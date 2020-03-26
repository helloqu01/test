package com.freeflux.population.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.freeflux.population.util.ChangeEncoding;

public class DBReadWriteClass {
	private static Connection conn = null;
	public DBReadWriteClass() {
		
	}
	/**mysql ����̹� �ε� db���� �޼ҵ�**/
	public static void connectMySQL(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("com.mysql.jdbc.Driver ����");
			String url = "jdbc:mysql://localhost:3306/testdb";
			conn=DriverManager.getConnection(url,"root","920424");
		} catch (ClassNotFoundException e) {
			System.out.println("com.mysql.jdbc.Driver ����"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("DriverManager.getConnection ����"+e.getMessage());
		}
	}
	/**�����͸� ����**/
	public static void dataInsert(ArrayList<String> lines){
		
		
		try {
			String[] words= null;
			int count =0;
			for(int i=0;i<lines.size();i++){
				words = lines.get(i).split(", ");
				
				String classcode = ChangeEncoding.toLatin(words[0]);
				String subject = ChangeEncoding.toLatin(words[1]);
				int hour = Integer.parseInt(words[2]);
				
				String queryInsert="insert into cou_table values ('"+classcode+"','"+subject+"','"+hour+"')";
				System.out.println(queryInsert);
				
				Statement stmt = conn.createStatement();
				int n =  stmt.executeUpdate(queryInsert);//����� ����ϴ°�
				count = count +n;	
			}
			System.out.println(count + " �����Ͱ� �Է���ϴ�");
		
		} catch (SQLException e) {
			System.out.println("dataInsert ����"+e.getMessage());
		}
	}
	
	public  ResultSet selectData(){
		
		ResultSet rs = null;
		try {
			Statement stmt =  conn.createStatement();
			rs = stmt.executeQuery("select * from cou_table");
		} catch (SQLException e) {
			System.out.println("ERR selectData���� ����"+e.getMessage());
		}
		return rs;
	}


}

