<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <%
      response.setContentType("text/html");
      String [] abc = {"빨강","노랑","초록"};
      %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="t" value="hello"/>
<c:out value="${t}"/>
<br/>

<h3>pageScope:Scope 속성값 중 page 범위</h3>
<c:forEach items="${pageScope}" var="h">
	<c:out value="${h}"/>
	<br/>
</c:forEach>

<h3>color</h3>
<c:set var="color" value="<%=abc%>"/>
	<c:forEach items="${color}" var="clr">
	<c:out value="${clr}"/>
 <br/>
 	</c:forEach>

<h3>color(추출된 카운트 , 추출된 인덱스)</h3>
<c:set var="color" value="<%=abc%>"/>
	<c:forEach items="${color}" varStatus="i">
	<c:out value="${i.count}"/>. <c:out value="${color[i.index]}"/>
 <br/>
 	</c:forEach>
</body>
</html>