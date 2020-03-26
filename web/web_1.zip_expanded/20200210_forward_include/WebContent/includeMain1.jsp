<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>포함하는 페이지 includeMain.jsp입니다.</h1>
		<% request.setCharacterEncoding("UTF-8");%>
		<!-- <hr>는 가로로 줄을 그어주는 태그이다.-->
		<hr>
		<jsp:include page="includeSub1.jsp" flush="false"/>
		<!-- 처리된 결과 내용을 출력 -->
		
		<!-- includeSub1.jsp의 결과가 출력
		포함되는 페이지 includeSub1 입니다.<p>
		<b><%=name%>님 어서 오세요!!</b>
		<hr> -->
		includeMain1의 나머지 내용입니다.

</body>
</html>