<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ page import="com.freeflux.db.DBClass" %> 
 <%
 int n=Integer.parseInt(request.getParameter("no"));
 String p=request.getParameter("pw");
 
 String status= DBClass.dataDeleteOne(n, p);
 
 if(status.equals("SUCCESS")){
	 status="선택한 글이 삭제 되었습니다.";
 }else{
	 status="비밀번호를 다시 입력해주세요.";
 }
 %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>삭제 처리 결과</title>
</head>

<body>
	<h1>삭제처리 결과</h1>
	<form action = "delete.jsp">
		<input type = "password" name="PW" size = "50" 
		placeholder="<%= status%>"required="required">
		<input type = "hidden" name = "no" value = "<%=n %>">
		<br/><br/>
		<input type = "submit" value = "글삭제 ">
		&nbsp;
		<input type = "button" value = "글목록" onclick = "location.href='list.jsp'"/>
	</form>
</body>
</html>