<%@page import="com.freeflux.servlets.JoinList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.freeflux.model.JoinModel, java.util.ArrayList" %>
    <% 
    ArrayList<JoinModel> JoinList =(ArrayList<JoinModel>)request.getAttribute("LIST");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>가입 목록 화면</title>
</head>
<body>
	<h1>가입목록</h1>
	<table border="1">
	<tr> 
		<th>번호</th><th>아이디</th><th>비밀번호</th><th>이메일</th><th>연락처</th>
	</tr>
	
	<%
	for(JoinModel joinModel : JoinList){
		out.println("<tr>");
		out.println("<td>"+joinModel.getnum()+"</td>");
		out.println("<td>"+joinModel.getid()+"</td>");
		out.println("<td>"+joinModel.getpw()+"</td>");
		out.println("<td>"+joinModel.getemail()+"</td>");
		out.println("<td>"+joinModel.getphone()+"</td>");
		out.println("</tr>");
	}
	%>
	</table>
</body>
</html>