<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "board_write_list2.DBClass,java.sql.ResultSet,java.sql.SQLException,com.freeflux.encode.ChangeEncoding"%>
<% 
//전달 받은 값을 확인 하는 것 (글쓰기로 전달 받은 값을 저장해라)
String writer = request.getParameter("writer");
String title = request.getParameter("title");
String contents= request.getParameter("contents");

//out.print(writer+"<br/>");
//out.print(title+"<br/>");

String status= DBClass.dataInsert(writer, title, contents);//DBClass 7번 dataInsert를 불러오는 것 8번 DBClass.dataInsert status를 불러온다.

out.print(status);
out.print("<br />");
out.print("<a href='list.jsp'>게시판 글목록 화면으로 이동</a>");


%>