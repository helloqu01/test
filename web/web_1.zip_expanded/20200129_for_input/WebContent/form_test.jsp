<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
    
 <%
 String [] city_2 = request.getParameterValues("city2");
 String city_1 = request.getParameter("city1");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% for(String c : city_2){ %>
<%=c%><br/>
<%}%>

<br/>
<%= city_1%>

</body>
</html>