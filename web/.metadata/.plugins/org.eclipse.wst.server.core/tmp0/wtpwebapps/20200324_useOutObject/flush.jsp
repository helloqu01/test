<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%--플러시(flush) 
버퍼가 다 찼을 때, 버퍼에 쌓인 데이터를 실제로 전송되어야 할 곳에 전송하고 버퍼를 비우는 것 --%>
<%@ page buffer ="1kb" autoFlush="false" %>
<%--버퍼가 다차면 에러발생  --%>
<%@ page buffer ="1kb" autoFlush="True" %>
<%--트루면 자동으로 리셋되기 떄문에 정상적으로 출 --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>autoFlush 속성값 예제 </title>
</head>
<body>

<%for(int i=0; i<1000; i++){%>
	
	1234
		
<% }%>

</body>
</html>