<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
		request.setCharacterEncoding("UTF-8");
		String color  = request.getParameter("color")+".jsp";
		//String color ="green.jsp";
	%>
	
		<jsp:forward page="<%=color%>"/>
		<!-- forward 액션 태그 때문에 이파일의 내용은 화면 출력이 되지않는다.
		ex) bloodType = a.jsp-->

</body>
</html>