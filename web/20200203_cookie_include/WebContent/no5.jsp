<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>오늘의 메뉴</h3>
	-짜장면<br>
	-볶음밥<br>
	-짬뽕<br><br>
	
	<%
	//out.flush(); //out.flush();가 오늘의 메뉴등을 가지고 있다. out.flush();가 include의 필수이다. 오늘의 메뉴의 내용을 가지고 있기 때문에 
	RequestDispatcher dispatcher = request.getRequestDispatcher("no4now.jsp");
	dispatcher.include(request, response);//include가  no4now였다가 no5로 됐다가 no4now가 하게 한다.
	// no4now에 html의 태그가 있어서는 안된다. 왜냐하면 no4now가  이 jsp 사이로 들어오기 때문에
	
	
	%>
	
	<%@ include file ="no4now.jsp"%>

</body>
</html>