package com.ohj.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBClass {

	String driverName = "com.mysql.jdbc.Driver";//����̹� ��Ī�� ����
	String dbURI = "jdbc:mysql://localhost:3306/testdb";//127.0.0.1 ����ȣ��Ʈ ��ȣ
	String dbID = "root";
	String dbPW = "920424";

	Connection conn = null;//getConnection�� ����

	public DBClass() {

	}// DBClass ed

	// DB���� �޼ҵ�(����̹� �ε� �� DB ���ӱ��� ó��)
	public void dbconnect() {
		try {
			Class.forName(this.driverName);// ����̹� �ε�
			System.out.println("����̹� �ε� ����");
			this.conn = DriverManager.getConnection(this.dbURI, this.dbID, this.dbPW);//����̹����� �������ִ� Ŭ���� �� getConnection ������ ���� ���������
			System.out.println("DB ���� ����");
		} catch (SQLException e) {
			System.out.println("ERR connect:" + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("ERR mySQL Driver Load:" + e.getMessage());

		}

	}

	// ��ü ������ ��ȸ �޼ҵ�(select*from emp_table)�� ��ȸ ����� Main���� ����
	public ResultSet select() {

		String selectQuery = "select*from emp_table";
		ResultSet rs = null;
		try {
			Statement stmt = conn.createStatement();//Statement �������� ������ �� �ִ� �޼ҵ带 ������ ����//Connection ��ü�� ���ؼ� ����
			rs = stmt.executeQuery(selectQuery);//
		} catch (SQLException e) {
			System.out.println("ERR:SQL����" + e.getMessage());
		}
		return rs;	
	}

	//��ü ���ڵ� ���� �޼ҵ�(select count(*)from emp_table)
	//count(*)�� �ʵ���� �ƴ� mysql�� �Լ����̴�.
	public int recordCount(){
		int n=0; //���ڵ��� �� ���� ����
		try {
			Statement stmt =conn.createStatement();
			ResultSet rs=stmt.executeQuery("select count(*)from emp_table");
			rs.next();
			n=rs.getInt(1);
			System.out.println(n);
			
		} catch (SQLException e) {
			System.out.println("ERR count(*)����"+e.getMessage());
		}
		return 0;
	}
		
		

}// class DBClass ed

//executeUpdate()<- delete/ update/ insert 
