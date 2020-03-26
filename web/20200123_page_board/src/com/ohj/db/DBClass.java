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
	
	public DBClass() {// �⺻ ������
	}

	// mysql ����̹� �ε� �� DB ���� �޼���
	public static void connectBoard() {// 1��
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/board_db2";
			conn = DriverManager.getConnection(url, "root", "920424");
		} catch (ClassNotFoundException e) {
			System.out.println("com.mysql.jdbc.Driver ����" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DriverManager.getConnection ����" + e.getMessage());
		}

	}

	/*// �ʱ� ������ �Է�
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

	}*/
	
	// �ʱ� ������ �Է�
	public static String dataInsert2() {
		connectBoard();
		String status = null; // �� ���� ���� ����
		String queryInsert = "insert into page_table (title,mkdate,ipaddr) values (?,now(),?)";
		PreparedStatement pstmt = null;
		String ip = getIP();
		String title = "�׽�Ʈ";

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

		String queryrecordCount = "select count(*) from page_table";
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(queryrecordCount);
			if (rs.next()) {// �����Ͱ� ���� ���
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
	
	//������ �ε��� ���� 0���� �о����
	public static ResultSet select10(int idx){//int idx:list.jsp�� ������ ��������ȣ
		//�������� ���� ���� �ε��� ���ϱ�
		connectBoard();

		int pageNo = idx-1;
		pageNo = pageNo*10;//pageNo:���� ������ ? �� ������ ��
		String queryrecordCount = "select * from page_table order by no limit "+pageNo+",10";
		//select * from page_table order by no desc limit "+pageNo+",10" => ����
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
	
	//��ü ������ ��ȸ �޼���
			public static ResultSet dataSelectAll() {
				connectBoard();
				ResultSet rs = null;
				String querySelect = "select no, title from page_table";
				Statement stmt =null;
				try {
					stmt = conn.createStatement();
					 rs = stmt.executeQuery(querySelect);
					
				} catch (SQLException e) {
					System.out.println("������ Select ����"+e.getMessage());
				}
				return rs;
			}
			
			//���ۼ����� ip�ּ� ���
			public static String getIP(){
				String ip =null;
				try {
					ip=InetAddress.getLocalHost().getHostAddress();//������ip�ּ�
					System.out.println("ip �ּ� : "+ip);
				} catch (UnknownHostException e) {
					System.out.println("etHostAddress ERR:"+e.getMessage());
				}
				return ip;
			}
			
}
