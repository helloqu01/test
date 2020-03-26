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

Connection conn = null;//getConnection의 변수​
public DBClass() {


}// DBClass ed

// DB접속 메소드(드라이버 로드 및 DB 접속까지 처리)

public void dbconnect() {

try {

Class.forName(this.driverName);// 드라이버 로딩

System.out.println("드라이버 로드 성공");

this.conn = DriverManager.getConnection(this.dbURI, this.dbID, this.dbPW);//드라이버들을 관리해주는 클래스 명 getConnection 변수를 선언 시켜줘야함

System.out.println("DB 접속 성공");

} catch (SQLException e) {

System.out.println("ERR connect:" + e.getMessage());

} catch (ClassNotFoundException e) {

System.out.println("ERR mySQL Driver Load:" + e.getMessage());​

}

​

}

// 전체 데이터 조회 메소드(select*from emp_table)단 조회 결과를 Main으로 전달

public ResultSet select() {​

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

//전체 레코드 갯수 메소드(select count(*)from emp_table)

//count(*)은 필드명이 아닌 mysql의 함수명이다.

public int recordCount(){

int n=0; //레코드의 총 갯수 저장

try {

Statement stmt =conn.createStatement();

ResultSet rs=stmt.executeQuery("select count(*)from emp_table");

rs.next();

n=rs.getInt(1);

System.out.println(n);

} catch (SQLException e) {

System.out.println("ERR count(*)오류"+e.getMessage());

}

return 0;

}

}// class DBClass ed

//executeUpdate()<- delete/ update/ insert 