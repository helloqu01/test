package com.freeflux.db;

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
	
	//mysql 드라이버 로딩 및 DB 접속 메서드
	public static void connectlist() {//1번
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/vist_db";
			conn =  DriverManager.getConnection(url,"root","920424");
		} catch (ClassNotFoundException e) {
			System.out.println("com.mysql.jdbc.Driver 에러"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("DriverManager.getConnection 에러"+e.getMessage());
		}
		
	}
	
	//전체 데이터 조회 메서드
		public static ResultSet dataSelectAll() {
			connectlist();
			ResultSet rs = null;
			String querySelect = "select no, writer, contents from vist_table";
			Statement stmt =null;
			try {
				stmt = conn.createStatement();
				 rs = stmt.executeQuery(querySelect);
				
			} catch (SQLException e) {
				System.out.println("데이터 Select 에러"+e.getMessage());
			}
			return rs;
		}
		
		
	//데이터 삽입 메소드 write.jsp에서 전달 받음
	public static String dataInsert(String w,String c, String p) {//2번
		connectlist();//3번 호출
		String status = null; // 글 저장 성공 여부
		String queryInsert = "insert into vist_table(writer,contents,PW) values(?,?,?)";
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(queryInsert);
			pstmt.setString(1, ChangeEncoding.toLatin(w));
			pstmt.setString(2, ChangeEncoding.toLatin(c));
			pstmt.setString(3, ChangeEncoding.toLatin(p));
			int n = pstmt.executeUpdate();
			status=(n>0) ? "SUCCESS":"FAIL";//n이 몇개가 저장되었는지 확인하는 거
		} catch (SQLException e) {
			System.out.println("pstmt.setString ERR"+e.getMessage());
			return "FAIL";
		}finally {   // 위의 try / catch 종료 후 자원 해제
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				System.out.println("CLOSE ERR : "+e.getMessage());
			}
		}
		return status;
	}//dataInsert end
	
	
	
	//데이터 조회 메서드(select*from~where~)
		public static ResultSet dataSelectOne(int no) {
			connectlist();
			ResultSet  rs = null;
			String querySelectOne = "select writer, contents, PW from vist_table where no=?";
			
			try {
				PreparedStatement pstmt=conn.prepareStatement(querySelectOne);
				pstmt.setInt(1, no);
				rs=pstmt.executeQuery();
				
			} catch (SQLException e) {
				System.out.println("conn.prepareStatement(querySelectOne) ERR :"+e.getMessage());
			}
			return rs;
		}
		
	//데이터 수정 메서드(update~set~where)
		public static String dataUpdate(String w, String c) {
			connectlist();
			
			String queryhit ="update vist_table set writer=?, contents=?, where no=?"; 
			PreparedStatement pstmt = null;
			String status = null;
			
			try {
				pstmt=conn.prepareStatement(queryhit);
				
				pstmt.setString(1, w);
				pstmt.setString(1, c);
				
				int n = pstmt.executeUpdate();
				status=(n>0) ? "SUCCESS" : "FAIL";
				
			} catch (SQLException e) {
				System.out.println("conn.prepareStatement(queryhit) ERR:"+e.getMessage());
			}finally{
				try {
					pstmt.close();
				} catch (SQLException e) {
					System.out.println("pstmt.close(); ERR:"+e.getMessage());
				}
				try {
					conn.close();
				} catch (SQLException e) {
					System.out.println("conn.close(); ERR:"+e.getMessage());
				}
			}
			return status;
		}
		
		//비밀번호 확인 메소드
				public static String pwConfirm(int n, String pw) {
					String querypwConfirm = "select no, password from vist_table where no=? AND password=?";
					String status = null;
					ResultSet rs=null;
					PreparedStatement pstmt = null;
					
					try {
						pstmt=conn.prepareStatement(querypwConfirm);
						pstmt.setInt(1, n);
						pstmt.setString(2, pw);
						rs=pstmt.executeQuery();
						status=(rs.next()) ? "OK":"BAD";
					} catch (SQLException e) {
						System.out.println("prepareStatement(querypwConfirm) ERR:"+e.getMessage());
					}
							return status;		
						}
				
		//데이터 삭제 메서드(delete from~where~)
		public static String dataDeleteOne(int no, String p) {
			connectlist();
			
			String status =null;
			String queryDeleteOne = "delete from vist_table where no=? AND PW=?";
			PreparedStatement pstmt = null;
			try {
				pstmt = conn.prepareStatement(queryDeleteOne);
				pstmt.setInt(1, no);
				pstmt.setString(2, p);
				int n =pstmt.executeUpdate();
				status=(n>0)?"SUCCESS":"FAIL";
			} catch (SQLException e) {
				System.out.println("queryDeleteOne ERR:"+e.getMessage());
			}
			return status;
		}
}	

