<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Forward 사용법 예제2</title>
</head>
<body>
	<h2>포워딩하는 페이지 : forwardform1.jsp</h2>
	<% //request.setCharacterEncoding("UTF-8"); %>
	
	forwardform1.jsp의 내용입니다.<br>
	화면에 절대 표시 안됩니다.
	<%--아래 forward 태그 때문에 --%>
	
	<jsp:forward page="forwardTo1.jsp"/>
	<%-- 독립된 객체이기 때문에 script 안에 안쓴다. --%>

</body>
</html>