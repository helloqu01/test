<%@page import="com.sun.media.sound.InvalidDataException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
    <% 자바코드들%>
	<%= 바로출력%>
	<%! 선언 %>
	<%@ 지시%>-> page/include 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String ID = (String)session.getAttribute("ID");
String PW = (String)session.getAttribute("PW");
String NAME = (String)session.getAttribute("NAME");
String NUMBER = (String)session.getAttribute("NUMBER");
String EMAIL = (String)session.getAttribute("EMAIL");
%>
<% //jsp의 내장객체 
	//request -> getParameter/getParameterValues/setAttribute/getAttribute
				//getCookies
	//response-> sendRedirect/ addcookie
	//out
	//application - > getContentPath/getrealpath
	//session ->setAttribute/getAttribute/invalidate/removeAttribute

	
%>

<%
	//Cookie  c = new Cookie("","")
			//c.getName() 쿠키명
			//c.getValue() 쿠키값
			//c.setMaxAge()
%>

ID:: <%= ID%>
<br>
PW:: <%= PW%>
<br>
이름:: <%= NAME%>
<br>
연락처:: <%= NUMBER%>
<br>
이메일:: <%= EMAIL%>

</body>
</html>