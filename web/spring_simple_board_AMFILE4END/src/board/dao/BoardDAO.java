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
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				BoardDTO data = new BoardDTO();
				
				data.setNum(rs.getInt("num"));
		        data.setAuthor(rs.getString("author"));
		        data.setTitle(rs.getString("title"));
		        data.setContent(rs.getString("content"));
		        data.setDate(rs.getString("date"));
		        data.setReadcnt(rs.getInt("readcnt"));
				list.add(data);
				
			}//while END
			// con, pstmt, rs try{ }  내부에 선언되어 있기 때문에 안에서 닫아줘야함
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;// ListActionController 로 반환
	}//list()END

	
	
	
}//Class() END
