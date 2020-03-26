<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.freeflux.test.InfoModel" %>
<%
InfoModel info=new InfoModel();
%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   
   <c:set var="info" value="<%=info%>" />
   <c:set target="${info}" property="name" value="test" />
   <c:set target="${info}" property="age" value="24" />
   
   이름 : <c:out value="${info.name }" /><br>
   나이 : <c:out value="${info.age}" /><br>
   
   이름 : <c:out value="${name }" /><br>
   나이 : <c:out value="${age}" /><br>
   
   이름: ${info.name}<br>
   나이: ${info.age}<br>
   
   <c:remove var="info"/>
   
   이름: ${info.name}<br>
   나이: ${info.age}<br>
   
   
</body>
</html>