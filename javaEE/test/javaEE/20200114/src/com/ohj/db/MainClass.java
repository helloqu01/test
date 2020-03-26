package com.ohj.db;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MainClass {

	public static void main(String[] args) {
		DBClass dbc=new DBClass();
		//파일 생성 위치
		
		dbc.dbconnect();
		//전체 데이터 조회하는 메소드 호출
		ResultSet rs =dbc.select();
		
	
		
		String uri = "c:/filetest/table.html";
		//데이터베이스에 접속하는 메소드 호출
		try {
			FileWriter fw =  new FileWriter (uri);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("<html>");
			bw.newLine();
			bw.write("<head>");
			bw.newLine();
			bw.write("<title>table</title>");
			bw.newLine();
			bw.write("</head>");
			bw.newLine();
			bw.write("<body>");
			bw.newLine();
			bw.write("<table border=1>");
			bw.newLine();
			bw.write("<tr><th>name</th><th>age</th><th>local</th><th>years</th><th>worker</th></tr>");
			try {
				while(rs.next()){//MYSQL에서 파일을 불러온다.(rs는 메인으로 부터 값을 전달 받는 매개변수) 값을 반복적으로 꺼내는 부분
					bw.write("<tr>");
					bw.write("<td>"+rs.getString("name")+"</td>");
					bw.write("<td>"+rs.getInt("age")+"</td>");
					bw.write("<td>"+rs.getString("local")+"</td>");
					bw.write("<td>"+rs.getInt("years")+"</td>");
					bw.write("<td>"+rs.getBoolean("worker")+"</td>");
					bw.write("</tr>");
					bw.newLine();
				}
			} catch (SQLException e) {
				System.out.println("오류:"+e.getMessage());
			}
			bw.write("</table>");
			bw.write("</body>");
			bw.write("</html>");
			bw.close();//저장되고 파일이 닫힌다.
		} catch (IOException e) {
			
		System.out.println("오류"+e.getMessage());
		}

	}

}


/*1. mysql 데이터베이스에 접속 할 수 있는 jdbc 드라이버 로딩
1-1 mysql-connector-java-5.1.18-bin 파일을 현재 작업중인 프로젝트에 참조 bulid path 메뉴를 사용
1-2 Class.forName("드라이버이름")를 이용하여 전용 드라이버 이름을 전달
2.드라이버드을 관리하는 클래스의 매서드를 이용하여 데이터베이스에 접속(데이터베이스 주소/데이터베이스명, 접속아이디, 접속비밀번호필요)
드라이버드을 관리하는 클래스:DriverManager.class
매서드 : getConnection("주소/db이름","아이디","비밀번호")
DriverManager.getCinnection("주소/db이름","아이디","비밀번호")

***위의 1,2에는 반드시 예외처리가 필요***
1.ClassNotFoundException
2.AQLException
기존에 만들 클래스 : DBClass의 dbConnect()내부에서 처리*/


/*/작업 2. 위의 작업 1이 성공적으로 끝났을 경우에만 해당.
 1. 테이블의 전체 데이터를 조회 : select*from emp_table
 2.데이터베스의 테이블 내용을 조회할 쿼리를 실행하는 메소드 필요
 2-1.쿼리를 실행할 수 있는 메소드를 보유하는 클래스 :  Statement.class
 	Statement 클래스는 new를 이용하여 객체생성이 불가능하고, 반드시 접속성공한 결과를 가지고 있는 Connection 객체를 통하여 생성
 	Statement stmt = conn.createStatement();
 
 2-1 쿼리 중 조회하는 쿼리를 실행하는 메소드 : executeQuery("쿼리문");
 	executeQuery()는 반드시 결과값을 ResultSet 객체로 반환
 	ResultSet rs = null;
 	rs = stmt.executeQuery(selectQuery);
 	
 만약, 데이터를 삭제 : delete from emo_table where name = 'AA';
 	데이터를 수정:update emp_table set name = 'SSSS' where age=10;
 	데이터를 추가: insert into emp_table values("AA",~~~);
 이와 같은 쿼리를 실행할 경우 필요한 메서드 : executeUpdate("실행쿼리")
 executeUpdate()메소드는 실행한 결과(실행 횟수)를 정수로 반환
 int n = stmt.executeUpdate("실행쿼리");
 ============================================
 
 작업 3.조회된 데이터를 HTML로 바꾸는 법
 	1.없는 파일을 생성항 파일 내부에 HTML코드를 적는다.
 	1-1.파일 내부에 글을 쓸 수 있는 클래스: FileWriter.Class
 		String uri = "c:/filetest/table.html";
 		FileWriter fw =  new FileWriter (uri);
 		or
 		FileWriter fw =  new FileWriter ("c:/filetest/table.html");
 		new 이용하여 객체 생성가능
 		단, 생성할 파일명, 경로가 반드시 필요.
 	1-2. 줄 단위로 글을 쓰기 위해서 필요한 클래스 : BufferedWriter.class
 		BufferedWriter bw = new BufferedWriter(fw);	
 		new 이용하여 객체 생성가능 
 		단, 생성시 파일 관련 객체가 필요.
 		
 	1-3. 실제 파일에 글을 쓰는 메서드 : bw.write("적을내용");
 	1-4. 줄을 바꿔주는 메서드 : bw.nextLine();
 
 ===================================================
 HTML: 웹브라우저 내의 문서를 표현할 수 있는 언어
 1.HTML 구조
<html>
 
 <head>
 		<title>웹브라우저 탭에 보여지는 제목</title>
 </head>
 
 <body>
 	웹브라우저 내부에 보여지는 내용
 </body>
 
</html>
 
 1-3. 표형태로 표현할 경우:<body>이 곳에다가 적는다.</body>
 	
 1-3-1.표
 	<table>
 	</table>
 1-3-2.표내부에 한 줄 : <table>이곳에다가 적는다.</table>
 	<tr>
 	</tr>
 	
 1-3-3 한 줄의 한칸 : <tr>이곳 사이에 적는다.</tr>
 제목표현
 <th>제목</th>
 데이터표현
 <td>데이터</td>	
 	
 	
 	
 */