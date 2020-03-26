<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 	Cookie cookie = new Cookie("GENDER","");
 	cookie.setMaxAge(0);// 쿠키 바로삭제
 	//cookie.setMaxAge(3600);//1시간 수명
 	//cookie.setMaxAge(-1);// 웹브라우저가 끝날 때 쿠키가 삭제 되도록 한다.
 	response.addCookie(cookie);
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>9번 쿠키 삭제하기</title>
</head>
<body>
	GENDER 쿠키가 삭제되었습니다.
</body>
</html>