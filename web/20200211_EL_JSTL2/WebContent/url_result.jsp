<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:url var="nameSend" value="/test_result.jsp">
		<c:param name="name" value="free"></c:param>
	</c:url>

	<%-- URL을 클릭해야 전달된 값으로 이동하게 된다. --%>
	<a href='<c:out value="${nameSend}"></c:out>'> URL</a>
</body>
</html>