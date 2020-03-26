<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.test.db.DBClass"%>

<%
	String status = "SUCCESS";
	//status = DBClass.dataInsert2(); // 데이터를 집어 넣는 것
	if (status.equals("SUCCESS")) {
		response.sendRedirect("list.jsp?pNo=1");

	}
%>