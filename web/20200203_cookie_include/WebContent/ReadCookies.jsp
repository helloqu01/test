<%@page import="java.security.PrivateKey"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% Cookie[] cookies =  request.getCookies(); %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>7번 쿠키 읽어오기</title>
</head>
<body>
	이름:<%= getCookieValue(cookies, "NAME") %><br>
	성별:<%= getCookieValue(cookies, "GENDER") %><br>
	나이:<%= getCookieValue(cookies, "AGE") %>
</body>
</html>
<%!
	private String getCookieValue(Cookie[] cookies, String name){
	String value = null;
	if(cookies==null)
		return null;
	for(Cookie cookie : cookies){
		if(cookie.getName().equals(name))
			return cookie.getValue();
	}
	return null;
}

//접속 url로 쿠키가 만들어지기 때문에
//localhost에 쿠키를 저장하고 ip주소로 127.0.0.1로 꺼낼 수 없다.
%>