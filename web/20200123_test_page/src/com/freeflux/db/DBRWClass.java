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

	public DBRWClass() {// �⺻ ������
	}

	// mysql ����̹� �ε� �� DB ���� �޼���
	public static void connectBoard() {// 1��
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/board_db2";
			conn = DriverManager.getConnection(url, "root", "920424");
			System.out.println("________________________________________");
		} catch (ClassNotFoundException e) {
			System.out.println("com.mysql.jdbc.Driver ����" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DriverManager.getConnection ����" + e.getMessage());
		}

	}

	// �ʱ� ������ �Է�
	public static String dataInsert2() {
		connectBoard();
		String status = null; // �� ���� ���� ����
		String queryInsert = "insert into page_table (title) values (?)";
		PreparedStatement pstmt = null;
		String title = "�׽�Ʈ";

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
		} finally {// ���� Ʈ����/ĳġ ������ �ڿ� ����
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				System.out.println("close();" + e.getMessage());
			}
		}
		return status;

	}

	// ��ü ��ȸ�� �޼ҵ�
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
			if (rs.next()) {// �����Ͱ� ���� ���
				System.out.println(rs.getInt(1)+"_________________________________________________");
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			System.out.println("conn.createStatement(); ERR:" + e.getMessage());
		} finally {
			try { // ���ʿ��� �ڿ�(����)����
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				System.out.println("close(); ERR:" + e.getMessage());
			}
		}
		return 0; // �����Ͱ� ������..

	}
}
