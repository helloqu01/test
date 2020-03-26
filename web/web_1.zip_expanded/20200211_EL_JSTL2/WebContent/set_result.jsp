<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.freeflux.test.InfoModel" %>
<%
/*       InfoModel info = new InfoModel(); */
%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>InfoModel 값을 가져다 쓸 set_result.jsp</title>
</head> 
<body>
<!-- 위에서 InfoModel()을 썼으면 아래엔 new InfoModel() 대신 info 라고 쓰고 만약 쓰지 않을 경우 다음과 같이 바로 호출 가능-->
   <c:set var="info" value="<%= new InfoModel() %>"></c:set>
   <c:set target="${info}" property="name" value="테스트" ></c:set>
   <c:set target="${info}" property="age" value="24" ></c:set>
   
   회원 이름 : ${info.name } <br />
   나이 : ${info.age } <br />



</body>
</html>