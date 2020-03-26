<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <%@page  import = "com.freeflux.encode.ChangeEncoding,com.freeflux.db.DBClass,java.sql.ResultSet,
  java.sql.SQLException,com.freeflux.str.StringClass" %>
<%
	
	String name=request.getParameter("name");
	String contents=request.getParameter("contents");

	String status=DBClass.dataUpdate(name, contents);
	
	if(status.equals("SUCCESS")){
		response.sendRedirect("list.jsp");
	}
%>


