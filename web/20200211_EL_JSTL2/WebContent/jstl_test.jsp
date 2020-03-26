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
	<c:out value="<h1>JSTL</h1>,<,/" escapeXml="true"/>
	<c:out value="<h1>JSTL</h1>,<,/" escapeXml="false"/>
	<%@page %>
	
	<pre>내부에 씌여져 있는 모든 내용을 그대로 출력시켜주는 태그(pre 태그)</pre>
	
	<!-- escapeXml 글쓰기에서 html 태그로 바꿔주는 기능? -->
	<c:out value="${name}" default="test" escapeXml="true"/>
	
	<br>
	
		<!--&it;h1&gt;jstl&it;h1&gt;,&it;,/ -->

</body>
</html>