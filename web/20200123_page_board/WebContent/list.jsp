<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.ohj.db.DBClass,com.ohj.db.ChangeEncoding" %>
<%
	
	int total =  DBClass.dataCount2();
	//int listNum = 10;// 한 화면에 출력할 게시물의 갯수
	int totalPageNum = 0;
	if (total > 0) { // 정수는 0으로 나눌 수 없다.
		//out.print("총 데이터(레코드)의 갯수 :" + total);
		//총 페이지 수 구하기 = 총 데이터의 갯수/ 한 화면에 출력할 게시물의 갯수
		double d = total / (10 * 1.0);//총 페이지 수(소수점)
		d = Math.ceil(d); // 소수점 이하 자리수를 올림
		totalPageNum = (int) d; //정수형 변환
		//out.print("총 페이지 수 :" + totalPageNum);
	}

	int pageNo = 1;
	//request.getParameter("pNo") <= 처음 main.jsp로부터 1을 전달 받음,
 	pageNo = Integer.parseInt(request.getParameter("pNo"));//이후에는 하단의 페이지 번호
 	
 	
%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>글목록(10개씩) 화면</title>
</head>

<body>

	<h1>글목록 (10개씩) 화면</h1>
	<table border ="1">
	<tr>
	<th>no</th><th>title</th><th>날짜</th><th>주소</th>
	</tr>
  <%
  		ResultSet rs = DBClass.select10(pageNo);
		int no = 0;
		String title = null;
		String mkdate = null;
		String ipaddr = null;
		while(rs.next()){
			no=rs.getInt(1);
			title = ChangeEncoding.toUnicode(rs.getString(2));
			mkdate = ChangeEncoding.toUnicode(rs.getString(3));
			ipaddr = ChangeEncoding.toUnicode(rs.getString(4));
		
%>	
	<tr>
	<td> <%=no%></td>
	<td> <%=title%></td>
	<td> <%=mkdate%></td>
	<td> <%=ipaddr%></td>
	</tr>
	
	<%} %>
	

	</table>
	<br/><br/>
		<!-- 여기에는 테이블이 오는 위치 -->
	<%=totalPageNum %>
	
	<!-- 하단은 현재 페이지와 페이지 번호들을 출력 -->
	<br/><br/>
	현재 페이지 번호 : <%=pageNo %>
	<br/><br/>
	페이지 번호에 링크 걸기 출력<br/><br/>
	<%for(int i=1;i<(totalPageNum+1);i++){ %>
		<a href="list.jsp?pNo=<%=i %>">
		<%=i %>
		</a>
		&nbsp; <!-- 스페이스바 -->
	<%}%>
	
</body>
</html>