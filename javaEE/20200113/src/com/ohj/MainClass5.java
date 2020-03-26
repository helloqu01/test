package com.ohj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass5 {
public static void main(String[] args) {
String driver_name="com.mysql.jdbc.Driver";

String db_url="jdbc:mysql://localhost:3306/testdb";

//ERR connect:Unknown database 'testdb6' 데이터베이스명을 잘 못 되었을 경우

String dc_id="root";

String db_pw="920424";

//ERR connect:Access denied for user 'root'@'localhost' (using password: YES)비밀번호나 아이디를 잘 못 입력했을 경우

Connection conn=null;//java.sql 접속 결과값을 저장받는 곳(추후 자원해제 시 필요)
​try {
Class.forName(driver_name); //1번째 해당 드라이버 로딩해주기

System.out.println(" mySQL Driver Load 성공");
conn=DriverManager.getConnection(db_url,dc_id,db_pw);//2번째 드라이버메니저로 접속주소, 아이디, 비밀번호를 적어 로그인

System.out.println("DB 접속 성공");//mysql에서 로그인해서 데이터베이스를 만들어 준다.
Statement stmt= conn.createStatement();//java.sql 임포트 시킨다. db명령을 실행할 객체

/*String insert = "insert into test values('abc','123')";//실행할 db 명령

int n=stmt.executeUpdate(insert);//db명령을 실제 실행하는 메소드

//실행한 내용을 정수로 반환.

System.out.println(n+"개 를 삽입했습니다.");

​

String delete = "delete from test";

int k = stmt.executeUpdate(delete);

System.out.println(k+"개를 삭제 했습니다.");*/

/*//id가 ghi인 pw 값을 111로 수정

//update테이블명 set 변경필드='변경값' where 검색필드 = '검색값'

String update = "update test set pw ='111' where id='ghi'";

int m = stmt.executeUpdate(update);

System.out.println(m+"개가 수정되었습니다.");*/

/*//테이블 데이터 조회(선택)

//selsct*from 테이블명

String select = "select*from test";

ResultSet rs = stmt.executeQuery(select);//executeQuery() 반환타입 ResultSet

rs.next();//다음 줄로 내려가라 내부포인터를 다음줄로 변경 / 다음 줄로 갈 수 있으면 true

System.out.println(rs.getString("id"));//re.get데이터타입("필드명")

rs.next();//다음 줄로 내려가라

System.out.println(rs.getString("pw"));*/

String select = "select*from test";

ResultSet rs = stmt.executeQuery(select);//executeQuery()

while(rs.next()){

System.out.println(rs.getString("id"+"\t"));

System.out.println(rs.getString("pw"));

}
} catch (ClassNotFoundException e) {

System.out.println("ERR mySQL Driver Load:"+e.getMessage());

} catch (SQLException e) {
System.out.println("ERR connect:"+e.getMessage());

}

}//main(String[] args) end

​

}//class MainClass5 end

​

//select 필드명리스트 from 테이블명

//insert into 테이블명 (필드명리스트) values(데이터리스트)

//delete from 테이블명

​

//ex)) select * from test <= test 테이블의 모든 데이터 조회(선택)

// select id from test <== test 테이블의 아이디 값만 조회

//select pw from test => test 테이블의 비번만 조회

//select id,pw from test=>test 테이블 아이디와 비번을 조회

​

//insert into test (id) values('ccc')<= test테이블의 아이디 필드에만 ccc문자열을 삽입

//insert into test (pw) values('111')<= test테이블의 pw 필드에만 ccc문자열을 삽입

//insert into test (id,pw) values('dd','11')<= test테이블의 아이디,비번 필드 dd,11문자열을 삽입

​

//insert into test (pw,id) values('22','ee')<= test테이블의 아이디,비번 필드 '22','ee'문자열을 삽입

//insert into test values('22','ee')<= test테이블 생성시 생성된 필드 순서대로 값들을 삽입

​

//delete from test <- 모든 테이블 ㅔ이터 삭제
