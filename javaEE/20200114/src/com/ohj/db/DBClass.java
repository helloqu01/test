package com.ohj.db;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

public class DBClass {

String driverName = "com.mysql.jdbc.Driver";//드라이버 명칭은 고정

String dbURI = "jdbc:mysql://localhost:3306/testdb";//127.0.0.1 로컬호스트 번호

String dbID = "root";

String dbPW = "920424";

Connection conn = null;

public DBClass() {
}

public void dbconnect() {//(선언)

try {

Class.forName(this.driverName);// 드라이버 로딩(사용)

System.out.println("드라이버 로드 성공");

this.conn = DriverManager.getConnection(this.dbURI, this.dbID, this.dbPW);//드라이버들을 관리해주는 클래스 명 getConnection 변수를 선언 시켜줘야함

System.out.println("DB 접속 성공");

} catch (SQLException e) {

System.out.println("ERR connect:" + e.getMessage());

} catch (ClassNotFoundException e) {

System.out.println("ERR mySQL Driver Load:" + e.getMessage());

}
}

public ResultSet select() {
String selectQuery = "select*from emp_table";

ResultSet rs = null;

try {

Statement stmt = conn.createStatement();//Statement 쿼리문을 실행할 수 있는 메소드를 가지고 있음//Connection 객체를 통해서 연결

rs = stmt.executeQuery(selectQuery);//

} catch (SQLException e) {

System.out.println("ERR:SQL오류" + e.getMessage());

}

return rs; 

}
}