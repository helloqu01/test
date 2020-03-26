<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.freeflux.encode.ChangeEncoding,com.freeflux.db.DBClass" %> 
<%
	String name=request.getParameter("name");
	String contents=request.getParameter("contents");
	
	String status=DBClass.dataInsert(name,contents);
	
	if(status.equals("SUCCESS")){
 		response.sendRedirect("list.jsp");
	}else{
		out.print("데이터 저장 실패");
	}
	
%>
    