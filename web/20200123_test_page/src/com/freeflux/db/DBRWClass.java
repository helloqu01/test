package com.freeflux.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.freeflux.encode.ChangeEncoding;

public class DBRWClass {
	private static Connection conn = null;

	public DBRWClass() {// 기본 생성자
	}

	// mysql 드라이버 로딩 및 DB 접속 메서드
	public static void connectBoard() {// 1번
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/board_db2";
			conn = DriverManager.getConnection(url, "root", "920424");
			System.out.println("________________________________________");
		} catch (ClassNotFoundException e) {
			System.out.println("com.mysql.jdbc.Driver 에러" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DriverManager.getConnection 에러" + e.getMessage());
		}

	}

	// 초기 데이터 입력
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

	}

	// 전체 조회수 메소드
	public static int dataCount2() {
		connectBoard();
		System.out.println("===========================================");
		String queryrecordCount = "select count(*) from page_table";
		Statement stmt = null;
		ResultSet rs = null;
		System.out.println("=====!!!!!!!!!!!!!!!!!!!!!!!!!!===========");
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(queryrecordCount);
			if (rs.next()) {// 데이터가 있을 경우
				System.out.println(rs.getInt(1)+"_________________________________________________");
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
}
