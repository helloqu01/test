<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page buffer ="8kb" autoFlush="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>out 기본 객체 사용(버퍼 정) </title>
</head>
<body>
<%
	 out.print("안녕하세요");
%>
<br>
<%
	out.print("out 기본객체를 사용하여 출력한 결과입니다. ");
%>
<br>

버퍼 크기: <%= out.getBufferSize() %> <br>
남은 크기:<%=out.getRemaining() %><br>
auto flush:<%=out.isAutoFlush() %><br>

</body>
</html>