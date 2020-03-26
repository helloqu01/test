package com.freeflux.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBReadWriteClass {
	private static Connection conn=null;
	
	public DBReadWriteClass() {//�⺻ ������
	}
	//mySQL ����̹� �ε� �� db ���� �޼���
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
		}
}