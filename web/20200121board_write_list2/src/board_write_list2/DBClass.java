package board_write_list2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.freeflux.encode.ChangeEncoding;

import java.sql.PreparedStatement;


public class DBClass {
	private static Connection conn=null;
	
	public DBClass() {//기본 생성자
	}
	/*//mySQL 드라이버 로딩 및 db 접속 메서드
	public static void connectMySQL() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("mysql 드라이버 성공");
			String url = "jdbc:mysql://localhost:3306/lms_db";
			conn=DriverManager.getConnection(url,"root","920424");
		} catch (ClassNotFoundException e) {
			System.out.println("mysql 드라이버 에러"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("데이터 커넥트 에러"+e.getMessage());
		}
		
	}
	//전체 데이터 조회 메서드(select*from~)
		public static ResultSet dataSelectAll() {
			String querySelect = "select*from stu_table";
			ResultSet rs = null;
			try {
				Statement stmt = conn.createStatement();
				 rs = stmt.executeQuery(querySelect);
				
			} catch (SQLException e) {
				System.out.println("데이터 Select 에러"+e.getMessage());
			}
			return rs;
		}*/
	public static void connectBoard() {//1번
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/board_db";
			conn =  DriverManager.getConnection(url,"root","920424");
		} catch (ClassNotFoundException e) {
			System.out.println("com.mysql.jdbc.Driver 에러"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("DriverManager.getConnection 에러"+e.getMessage());
		}
		
	}
	
	
	//write.jsp에서 전달 받음
	public static String dataInsert(String w,String t, String c) {//2번
		connectBoard();//3번 호출
		String status = null; // 글 저장 성공 여부
		
		String queryInsert = "insert into board_table(writer,title,contents) values(?,?,?)";
		
		PreparedStatement pstmt=null;
		try {
			
			pstmt=conn.prepareStatement(queryInsert);
			pstmt.setString(1, ChangeEncoding.toLatin(w));
			pstmt.setString(2, ChangeEncoding.toLatin(t));
			pstmt.setString(3, ChangeEncoding.toLatin(c));
			
			
			int n = pstmt.executeUpdate();
			status=(n>0) ? "SUCCESS":"FAIL";//n이 몇개가 저장되었는지 확인하는 거
			
		} catch (SQLException e) {
			System.out.println("pstmt.setString ERR"+e.getMessage());
			return "FAIL";
		}finally{//4번
			try {
				pstmt.close();//5번
				conn.close();
			} catch (SQLException e) {
				System.out.println("close(); ERR"+e.getMessage());
		}
		return status;
		}
	}//dataInsert end
	
	//전체 데이터 조회 메서드
	public static ResultSet dataSelectAll() {
		connectBoard();
		ResultSet rs = null;
		String querySelect = "select idx, writer, title, contents, hit from board_table order by idx desc";
		Statement stmt =null;
		
		
		try {
			stmt = conn.createStatement();
			 rs = stmt.executeQuery(querySelect);
			
		} catch (SQLException e) {
			System.out.println("데이터 Select 에러"+e.getMessage());
		}
		return rs;
	}
	
	//hit 값 늘리기
	public static String hitUp(int no){
		connectBoard();
		PreparedStatement pstmt=null;
		String queryHit = "update board_table set hit = hit+1 where idx =?";
		String status = null; 
		
		try {
			pstmt = conn.prepareStatement(queryHit);
			pstmt.setInt(1,no);
			int n = pstmt.executeUpdate();
			status=(n>0) ? "SUCCESS":"FAIL";
		} catch (SQLException e) {
			System.out.println("prepareStatement ERR"+e.getMessage());
		}finally{
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				System.out.println("pstmt.close()"+e.getMessage());
			}
		}
		return status;
	}
	//데이터 조회 메서드(select*from~where~)
		public static void dataSelectOne() {
			connectBoard();
			ResultSet  rs = null;
			String querySelect = "selest * from where ";
			Statement stmt = null;
			
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(querySelect);
			} catch (SQLException e) {
				System.out.println("conn.createStatement() ERR"+e.getMessage());
			}
		}
	//데이터 수정 메서드(update~set~where)
		public static ResultSet dataUpdate() {
			connectBoard();
			ResultSet  rs = null;
			String querySelect = "update set where";
			Statement stmt = null;
			
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(querySelect);
			} catch (SQLException e) {
				System.out.println("conn.createStatement() ERR"+e.getMessage());
			}
			return rs;
		}

}	

