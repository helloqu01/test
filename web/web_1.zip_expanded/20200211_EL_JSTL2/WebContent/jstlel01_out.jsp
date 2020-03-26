<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>header 라는 객체가 갖고 있는 값들을 불러서 보여준다.
		request.getHeader()로 가져올 수 있는 것</h1>
	<h3>header</h3>
	<c:forEach items = "${header}" var="h">
		<c:out value="${h}"/><br/>
	</c:forEach>
	
	<h3>header.cookie</h3>
		<c:out value="${header.cookie}"/><br/>
	<br/>
		
	<h3>또는 header["cookie"]</h3>	
	<c:out value='${header["cookie"]}'/>
	
	
</body>
</html>