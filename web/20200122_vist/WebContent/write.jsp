<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.freeflux.encode.ChangeEncoding,com.freeflux.db.DBClass" %> 
<%
	String writer=request.getParameter("writer");
	String contents=request.getParameter("contents");
	String PW=request.getParameter("PW");
	
	
	String status=DBClass.dataInsert(writer,contents,PW);
	
	if(status.equals("SUCCESS")){
		response.sendRedirect("list.jsp");
	}else{
		out.print("데이터 저장 실패");
	}
	
	//out.print(status);
	//out.print("<br />");
	//out.print("<a href='list.jsp'>게시판 글목록 화면으로 이동</a>");
%>