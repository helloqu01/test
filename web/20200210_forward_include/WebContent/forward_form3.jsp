<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>포워딩 될페이지에 파라미터 값 전달하기 예제</h1>
		<form action="forwardform3.jsp" method="post">
		이름 : <input type="text" id ="name" name = "name"><br><br>
		당신의 좋아하는 색은?<p>
		
		<input type="radio" ="green" name = "color" value="green"/>
		<label for = "green">초록색</label><br/>
		<input type="radio" color="red" name = "color" value="red"/>
		<label for = "red">빨간색</label><br/>
		<input type="radio" color="blue" name = "color" value="blue"/>
		<label for = "blue">파란색</label><br/>
		<input type="radio" color="yellow" name = "color" value="yellow"/>
		<label for = "yellow">노란색</label><br/>
		<p>
		<input type="submit" value="보내기">
	
		</form>
</body>
</html>