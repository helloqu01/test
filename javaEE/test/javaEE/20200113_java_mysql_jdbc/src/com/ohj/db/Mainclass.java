package com.ohj.db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Mainclass {

	public static void main(String[] args) {
		DBClass dbc=new DBClass();
		//����̹� �ε� �� DB���� �޼ҵ� ȣ��
		dbc.dbconnect();
		
		ResultSet rs =dbc.select();//���� db���ο��� ����Ǵ� ���� �ڹٿ� �ǵ����ִ� �� /���̺� ó�� ���� ������ ������ �ִ� ��/�� �� �� ������ �ִ� ���� record
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
				System.out.println("ERR:SQL����"+e.getMessage());
			}
		
		
		//int records=dbc.recordCount();
		
		
		}
	}


