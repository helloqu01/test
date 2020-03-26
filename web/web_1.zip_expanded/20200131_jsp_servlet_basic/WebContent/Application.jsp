<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>어플리케이션 내장변수의 사용의 예</title>
</head>
<body>
<% 
	String appPath = application.getContextPath();
	String filePath = application.getRealPath("/sub1/intro.html");
	
%>
	웹 어플리케이션의 URL 경로명 <%= appPath %><br>
	/sub1/Intro.html의 파일 경로명 <%= filePath %><br>
	</body>
</html>