<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "board_write_list2.DBClass" %>
    
    
 <%
 //String writer =  request.getParameter("no"));
 int no = Integer.parseInt(request.getParameter("no"));
 String status = DBClass.hitUp(no);
 
 out.print(status);
 
 if(status.equals("SUCCESS")){
	 response.sendRedirect("datail_form.jsp?no="+no);
 }
 %>