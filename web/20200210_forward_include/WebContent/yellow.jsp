<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>포워딩되는 페이지(yellow.jsp)</h1>
	<%
		String name = request.getParameter("name");
		String color = request.getParameter("color");
	%>
	<b><%=name%></b>님이 좋아하는 색은
	<b><%=color%></b>이고
	<p>빛의 밝음과 따뜻함을 상징하는 색입니다.
</body>
</html>