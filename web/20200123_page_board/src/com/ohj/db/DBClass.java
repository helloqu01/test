package com.ohj.db;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ohj.db.ChangeEncoding;


public class DBClass {
	
	private static Connection conn = null;
	
	public DBClass() {// 기본 생성자
	}

	// mysql 드라이버 로딩 및 DB 접속 메서드
	public static void connectBoard() {// 1번
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/board_db2";
			conn = DriverManager.getConnection(url, "root", "920424");
		} catch (ClassNotFoundException e) {
			System.out.println("com.mysql.jdbc.Driver 에러" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DriverManager.getConnection 에러" + e.getMessage());
		}

	}

	/*// 초기 데이터 입력
	public static String dataInsert2() {
		connectBoard();
		String status = null; // 글 저장 성공 여부
		String queryInsert = "insert into page_table (title) values (?)";
		PreparedStatement pstmt = null;
		String title = "테스트";

		try {
			pstmt = conn.prepareStatement(queryInsert);
			int n = 0;
			for (int i = 0; i < 95; i++) {
				pstmt.setString(1, ChangeEncoding.toLatin(title + i));
				n = pstmt.executeUpdate();
			}
			status = (n > 0) ? "SUCCESS" : "FAIL";
		} catch (SQLException e) {
			System.out.println("conn.prepareStatement(querySelect); ERR: " + e.getMessage());
		} finally {// 위의 트라이/캐치 종료후 자원 해제
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				System.out.println("close();" + e.getMessage());
			}
		}
		return status;

	}*/
	
	// 초기 데이터 입력
	public static String dataInsert2() {
		connectBoard();
		String status = null; // 글 저장 성공 여부
		String queryInsert = "insert into page_table (title,mkdate,ipaddr) values (?,now(),?)";
		PreparedStatement pstmt = null;
		String ip = getIP();
		String title = "테스트";

		try {
			pstmt = conn.prepareStatement(queryInsert);
			int n = 0;
			for (int i = 0; i < 95; i++) {
				pstmt.setString(1, ChangeEncoding.toLatin(title + i));
				pstmt.setString(2, ip);
				n = pstmt.executeUpdate();
			}
			status = (n > 0) ? "SUCCESS" : "FAIL";
		} catch (SQLException e) {
			System.out.println("conn.prepareStatement(querySelect); ERR: " + e.getMessage());
		} finally {// 위의 트라이/캐치 종료후 자원 해제
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				System.out.println("close();" + e.getMessage());
			}
		}
		return status;

	}
	// 전체 조회수 메소드
	public static int dataCount2() {
		connectBoard();

		String queryrecordCount = "select count(*) from page_table";
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(queryrecordCount);
			if (rs.next()) {// 데이터가 있을 경우
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			System.out.println("conn.createStatement(); ERR:" + e.getMessage());
		} finally {
			try { // 불필요한 자원(연결)해제
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				System.out.println("close(); ERR:" + e.getMessage());
			}
		}
		return 0; // 데이터가 없으면..
	}
	
	//지정한 인덱스 부터 0개씩 읽어오기
	public static ResultSet select10(int idx){//int idx:list.jsp가 전달한 페이지번호
		//페이지에 대한 시작 인덱스 구하기
		connectBoard();

		int pageNo = idx-1;
		pageNo = pageNo*10;//pageNo:쿼리 내부의 ? 에 전달할 값
		String queryrecordCount = "select * from page_table order by no limit "+pageNo+",10";
		//select * from page_table order by no desc limit "+pageNo+",10" => 역순
		ResultSet rs = null;
		Statement stmt = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(queryrecordCount);
			System.out.println(idx);
			
		} catch (SQLException e) {
			System.out.println("queryrecordCount ERR:"+e.getMessage());
		}
		return rs;
	}
	
	//전체 데이터 조회 메서드
			public static ResultSet dataSelectAll() {
				connectBoard();
				ResultSet rs = null;
				String querySelect = "select no, title from page_table";
				Statement stmt =null;
				try {
					stmt = conn.createStatement();
					 rs = stmt.executeQuery(querySelect);
					
				} catch (SQLException e) {
					System.out.println("데이터 Select 에러"+e.getMessage());
				}
				return rs;
			}
			
			//글작성자의 ip주소 얻기
			public static String getIP(){
				String ip =null;
				try {
					ip=InetAddress.getLocalHost().getHostAddress();//접속자ip주소
					System.out.println("ip 주소 : "+ip);
				} catch (UnknownHostException e) {
					System.out.println("etHostAddress ERR:"+e.getMessage());
				}
				return ip;
			}
			
}
