<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="javax.sql.DataSource" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.Context" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	Context intitcoContext =  new InitialContext();
	Context enContext = (Context)intitcoContext.lookup("java:/comp/env");
	DataSource ds = (DataSource)enContext.lookup("jdbc/myoracle");
	Connection conn = ds.getConnection();
	
	out.print("DBCP연동 성공");

%>

</body>
</html>