package com.freeflux.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBReadWriteClass {
	private static Connection conn=null;
	
	public DBReadWriteClass() {//기본 생성자
	}
	//mySQL 드라이버 로딩 및 db 접속 메서드
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
		}
}