<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>includeMain2</h2>
	
	<%
		request.setCharacterEncoding("UTF-8");
		String siteName1 =request.getParameter("siteName1");
	%>
	
	<hr>
	<jsp:include page="includeSub2.jsp">
		<jsp:param value="<%=siteName1%>" name="siteName"/>
	</jsp:include>
	includeMain2 페이지의 나머지 내용입니다.
</body>
</html>