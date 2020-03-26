<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page import = "java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>초기화 파라미터 읽어오기</title>
</head>
<body>
<%--웹 어플리케이션 초기화 파리미터 사용 이유
	초기화를하는데 필요한 설정 정보를 지정하기위해 사용된다.
	예를 들면 데이터베이스 연결과 관련된 설정 파일의 로나 로깅 설정 파일 또는 웹어플리케이션의 주요속성정보를 담고 있는 파일의 경로등을지정 할 때
	초기화 파라미터를 사용한다. --%>
	
	초기화 파라미터 목록:
	<ul>
	<%
		Enumeration<String> initParamEnum = application.getInitParameterNames();
		while(initParamEnum.hasMoreElements()){
			String initParamName = initParamEnum.nextElement();
			%>
			<li>
			<%=initParamName%>=
			<%= application.getInitParameter(initParamName) %>
			<% 
		}
		%>
	</ul>
</body>
</html>