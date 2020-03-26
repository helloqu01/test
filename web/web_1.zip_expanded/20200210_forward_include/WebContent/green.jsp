<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>포워딩되는 페이지(green.jsp)</h1>
	<%
		String name = request.getParameter("name");
		String color = request.getParameter("color");
		String selectedColor = request.getParameter("color");
	%>
	<b><%=name%></b>님이 좋아하는 색은
	<b><%=color%></b>이고
	<p>기분의 안정과 온화함을 상징하는 색입니다.
	
	<br>
	<img src="./forward3_image/<%=selectedColor+".jpg" %>" width="320" height="240" >
	
</body>
</html>