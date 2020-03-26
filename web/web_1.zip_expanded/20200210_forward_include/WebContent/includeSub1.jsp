<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String name = request.getParameter("name");%>
포함되는 페이지 includeSub1 입니다.<p>
<b><%=name%>님 어서 오세요!!</b>
<hr>

<!-- include를 사용할 때 <body> 태그등을 사용해서는 안된다. -->