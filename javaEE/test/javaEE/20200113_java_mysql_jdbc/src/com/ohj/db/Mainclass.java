package com.ohj.db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Mainclass {

	public static void main(String[] args) {
		DBClass dbc=new DBClass();
		//드라이버 로드 및 DB접속 메소드 호출
		dbc.dbconnect();
		
		ResultSet rs =dbc.select();//실제 db내부에서 실행되는 것을 자바에 되돌려주는 것 /테이블 처럼 생긴 내용을 가지고 있는 것/한 줄 당 가지고 있는 것이 record
		try{
			while(rs.next()){
				System.out.println(rs.getString("name")+"\t");
				System.out.println(rs.getInt("age"+"\t"));
				System.out.println(rs.getString("local"+"\t"));
				System.out.println(rs.getInt("years"+"\t"));
				System.out.println(rs.getInt("worker"+"\t"));
				System.out.println(rs.getInt("----------------"));
			}
			}catch(SQLException e){
				System.out.println("ERR:SQL오류"+e.getMessage());
			}
		
		
		//int records=dbc.recordCount();
		
		
		}
	}


