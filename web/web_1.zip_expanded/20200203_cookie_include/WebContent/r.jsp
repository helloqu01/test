<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>3번</title>
</head>
<body>

	<%
	request.getParameter("NUM1");// NUM1를 AddServlet에서 꺼내온다.
	request.getParameter("NUM2");//NUM2를 AddServlet에서 꺼내온다.
	request.getAttribute("ADD");//ADD를 AddServlet에서 꺼내온다.
	//params	/       arrtibute
	//NUM1="10"			"ADD":30	
	//NUM2="20"
	
	%>


</body>
</html>