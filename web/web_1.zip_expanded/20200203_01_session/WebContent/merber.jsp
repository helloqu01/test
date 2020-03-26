<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>가입 정보 기입</title>
</head>
<body>

	<head><title>가입 정보 기입</title></head>
	<form action=ResultServlet>
		이름 : <input type = "text" name = "NAME" pattern = "[a-zㄱ-힣]*" required=required><br>
		연락처 : <input type = text name = NUMBER required=required><br>
		이메일: <input type = text name = EMAIL required=required><br>
		<input type = "submit" value="다음" >
		<input type = "button" value="이전" onclick = "location.href='join.html'">
	
</body>
</html>