<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	response.sendRedirect("http://localhost:8080/spring_simple_board_AMFILE/list.do");
%>

<%-- 초기화면인 list.jsp로 바로 이동, web.xml문서에 <welcome-file> 초기로딩페이지 </welcome-file>같이

설정하면 애플리케이션 명으로 요청이 들어왔을 때 자동 호출--%>