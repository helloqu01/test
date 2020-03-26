<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>포워딩 될페이지에 파라미터 값 전달하기 예제2</title>
</head>
<body>
		<h2>포워딩하는 페이지 : forwardform2.jsp</h2>
	<% 
		request.setCharacterEncoding("UTF-8");
		String bloodType  = request.getParameter("bloodtype")+".jsp";
		//String bloodType ="a.jsp";
	%>
	
		<jsp:forward page="<%=bloodType%>"/>
		<!-- forward 액션 태그 때문에 이파일의 내용은 화면 출력이 되지않는다.
		ex) bloodType = a.jsp-->
</body>
</html>