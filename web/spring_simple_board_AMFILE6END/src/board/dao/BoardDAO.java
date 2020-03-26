package board.dao;
/** connection, preparedStatement 쿼리 실행 관련*/
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**Context(Interface이다), initialConttext 객체 = > Context.xml<Context>*/
//lookup(찾고자하는 이름(JNDI명)-> 탐색기에서 검색하는 것과 같은 느낌 
import javax.naming.Context;
import javax.naming.InitialContext;

/*-----------------------------------------------------------*/
// 추가 (JNDI 방식)
// DataSource 객체 => getConnection()
import javax.sql.DataSource;

import board.command.BoardCommand;
import board.dto.BoardDTO;

/*
 * 각 쿼리를 실제로 수행하는 class
 * 생성자를 통해 Context로부터 DB 접속
 * 조회, 검색, 수정, 삭제 등 쿼리 수행하고 결과를 반환
 * 각 Controller 에서 호출되는 메소드들 보유
 */

public class BoardDAO {
	DataSource ds;
	
	//생성자:DataSource 얻기 InitialContext와 JNDI명
	public BoardDAO() {	
		try {
			//InitialContext ctx = new InitialContext();도 가능
			//이유 :  InitialContext implements(구현) Context
			Context ctx = new InitialContext();
			
			//lookup("java:comp/env/찾고자하는 JNDI명");
			//찾고자하는 JNDI명:=> Context.xml<Resource name="~~"> 반드시 형변환이 필요하다.
			ds=(DataSource)ctx.lookup("java:comp/env/jdbc/orcl");
			
			System.out.println("ds:"+ ds);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//BoardDAO() END
	
	/**글 목록 조회 메서드*/
	public ArrayList<BoardDTO> list(){
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		
		try {
			String sql = "SELECT * FROM springboard ORDER BY num desc";
			Connection con =ds.getConnection();
			
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs =stmt.executeQuery();
			
			while(rs.next()){
				BoardDTO data = new BoardDTO();
				
				data.setNum(rs.getInt("num"));
		        data.setAuthor(rs.getString("author"));
		        data.setTitle(rs.getString("title"));
		        data.setContent(rs.getString("content"));
		        data.setDate(rs.getString("writeday"));
		        data.setReadcnt(rs.getInt("readcnt"));
		        
				list.add(data);
				
			}//while END
			// con, pstmt, rs try{ }  내부에 선언되어 있기 때문에 안에서 닫아줘야함
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;// ListActionController 로 반환
	}//list()END

	/** 글 번호 얻기 메서드(글 쓰기 메서드에서 사용) */
	public int getNewNum() {
		int newNum =1;
		
		try {
			String sql = "select max(num) from springboard";
			Connection con = ds.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				//가상필드이기 때문에, 필드명을 쓸 수 없어서 인덱스 (1)을 사용.
				newNum=rs.getInt(1)+1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return newNum;	
	}
	
	/** 글 쓰기 메서드 */
	//public void write(BoardCommand dar) {} 가 정석
	//그러나 3개만 받기 위하여 아래와 같이 작성
	public void write(String author,String title, String content ) {
		try {
			int newNum = getNewNum();//최대값을 구해오는 메소드 호출
			
			System.out.println("newnum:"+newNum);
			
			String sql = "insert into springboard(num,author,title,content) values(?,?,?,?)";
			System.out.println(sql);// 한글 깨지는지 확인
			
			Connection con = ds.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, newNum);
			stmt.setString(2, author);
			stmt.setString(3, title);
			stmt.setString(4, content);
			stmt.executeUpdate();//==stmt.executeUpdate(sql);
			
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}//catch END
	}//public void write()END
	
	/** 글 자세히 보기 메서드 */

	public BoardDTO retrieve(String num) {
		BoardDTO data = new BoardDTO();
		
		String sql = "update springboard set readcnt=readcnt+1 where num=?";
		try {
			//1.조회수 증가시키기(메서드 처리가능)
			Connection con = ds.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, Integer.parseInt(num));
			int update = stmt.executeUpdate();
		
			System.out.println("BoardDAO에서 retrieve 조회수 증가 유무(update)");
			
			//2.글번호를 이용하여 선택된 글만 조회
			stmt=null;//한 개의 stmt을 2번(재사용) 쓸 수 있는 방법 / update한 것을 리셋(null)을 시켜주고 쿼리를 넣어줘야한다.
			sql ="select * from springboard where num=?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, Integer.parseInt(num));
			ResultSet rs =stmt.executeQuery();
			
			if(rs.next()){
				data.setNum(rs.getInt("num"));
				data.setAuthor(rs.getString("author"));
				data.setTitle(rs.getString("title"));
				data.setContent(rs.getString("content"));
			}//IF END
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return data;	
	}//retrieve(String num)END
	
	
	/** 글 수정하기 메서드 */
	public void update(BoardCommand data, String num) {//String num, String author, String title, String content
	//BoardDTO data = new BoardDTO();

	try {
		String sql = "update springboard set title=?, content=?, author=? where num=?";
		System.out.println(sql);
		
		Connection con=ds.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(4, Integer.parseInt(num));
		stmt.setString(3, data.getAuthor());
		stmt.setString(1, data.getTitle());
		stmt.setString(2, data.getContent());
		stmt.executeUpdate();//==stmt.executeUpdate(sql);
		
	stmt.close();
	con.close();	
	} catch (SQLException e) {
		
		e.printStackTrace();
	}

}// update() END
	/** 글 삭제하기 메서드 */
	public void delete(String num) {
		BoardDTO data = new BoardDTO();
		
		
		try {
			String sql = "delete springboard where num=?";
			System.out.println(sql);
			
			Connection con=ds.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, Integer.parseInt(num));
			stmt.executeUpdate();
			
			stmt.close();
			con.close();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}//delete() END


	
	/** 검색하기 메서드 
	 * @return */
	public ArrayList search(String name, String value) {
		//name(""또는"")
		ArrayList list = new ArrayList();
		
		try {
			String sql = "select * from springboard";
		sql+=" where "+name+" like '%"+value+"%' ";
		sql+=" order by num desc";
		System.out.println(sql);
		
			Connection con=ds.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
	            BoardDTO data = new BoardDTO();
	            
	            data.setNum(rs.getInt("num"));
	            data.setAuthor(rs.getString("author"));
	            data.setTitle(rs.getString("title"));
	            data.setContent(rs.getString("content"));
	            data.setDate(rs.getString("writeday"));
	            data.setReadcnt(rs.getInt("readcnt"));
	            
	            list.add(data);
	         }//while END
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}//search() END
	
	
}//Class() END
