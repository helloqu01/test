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
	/**mysql  드라이버 로딩 db 접속 메소**/
	public static void connectMySQL(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("com.mysql.jdbc.Driver 성공 ");
			String url = "jdbc:mysql://localhost:3306/testdb";
			conn=DriverManager.getConnection(url,"root","920424");
		} catch (ClassNotFoundException e) {
			System.out.println("com.mysql.jdbc.Driver 오류 "+e.getMessage());
		} catch (SQLException e) {
			System.out.println("DriverManager.getConnection 오류 "+e.getMessage());
		}
	}
	/**데이터 삽입 **/
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
				int n =  stmt.executeUpdate(queryInsert);//들어가라고 명령하는 것
				count = count +n;	
			}
			System.out.println(count + "데이터가 입력되었습니다 ");
		
		} catch (SQLException e) {
			System.out.println("dataInsert 에러 "+e.getMessage());
		}
	}
	
	public  ResultSet selectData(){
		
		ResultSet rs = null;
		try {
			Statement stmt =  conn.createStatement();
			rs = stmt.executeQuery("select * from cou_table");
		} catch (SQLException e) {
			System.out.println("ERR selectData 내부 오류 "+e.getMessage());
		}
		return rs;
	}


}

