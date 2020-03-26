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
	
	public DBClass() {//�⺻ ������
	}
	/*//mySQL ����̹� �ε� �� db ���� �޼���
	public static void connectMySQL() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("mysql ����̹� ����");
			String url = "jdbc:mysql://localhost:3306/lms_db";
			conn=DriverManager.getConnection(url,"root","920424");
		} catch (ClassNotFoundException e) {
			System.out.println("mysql ����̹� ����"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("������ Ŀ��Ʈ ����"+e.getMessage());
		}
		
	}
	//��ü ������ ��ȸ �޼���(select*from~)
		public static ResultSet dataSelectAll() {
			String querySelect = "select*from stu_table";
			ResultSet rs = null;
			try {
				Statement stmt = conn.createStatement();
				 rs = stmt.executeQuery(querySelect);
				
			} catch (SQLException e) {
				System.out.println("������ Select ����"+e.getMessage());
			}
			return rs;
		}*/
	public static void connectBoard() {//1��
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/board_db";
			conn =  DriverManager.getConnection(url,"root","920424");
		} catch (ClassNotFoundException e) {
			System.out.println("com.mysql.jdbc.Driver ����"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("DriverManager.getConnection ����"+e.getMessage());
		}
		
	}
	
	
	//write.jsp���� ���� ����
	public static String dataInsert(String w,String t, String c) {//2��
		connectBoard();//3�� ȣ��
		String status = null; // �� ���� ���� ����
		
		String queryInsert = "insert into board_table(writer,title,contents) values(?,?,?)";
		
		PreparedStatement pstmt=null;
		try {
			
			pstmt=conn.prepareStatement(queryInsert);
			pstmt.setString(1, ChangeEncoding.toLatin(w));
			pstmt.setString(2, ChangeEncoding.toLatin(t));
			pstmt.setString(3, ChangeEncoding.toLatin(c));
			
			
			int n = pstmt.executeUpdate();
			status=(n>0) ? "SUCCESS":"FAIL";//n�� ��� ����Ǿ����� Ȯ���ϴ� ��
			
		} catch (SQLException e) {
			System.out.println("pstmt.setString ERR"+e.getMessage());
			return "FAIL";
		}finally{//4��
			try {
				pstmt.close();//5��
				conn.close();
			} catch (SQLException e) {
				System.out.println("close(); ERR"+e.getMessage());
		}
		return status;
		}
	}//dataInsert end
	
	//��ü ������ ��ȸ �޼���
	public static ResultSet dataSelectAll() {
		connectBoard();
		ResultSet rs = null;
		String querySelect = "select idx, writer, title, contents, hit from board_table order by idx desc";
		Statement stmt =null;
		
		
		try {
			stmt = conn.createStatement();
			 rs = stmt.executeQuery(querySelect);
			
		} catch (SQLException e) {
			System.out.println("������ Select ����"+e.getMessage());
		}
		return rs;
	}
	
	//hit �� �ø���
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
	//������ ��ȸ �޼���(select*from~where~)
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
	//������ ���� �޼���(update~set~where)
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

