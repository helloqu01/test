<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page  import = "com.freeflux.encode.ChangeEncoding,com.freeflux.db.DBClass,java.sql.ResultSet,
  java.sql.SQLException,com.freeflux.str.StringClass" %>
<%
ResultSet rs = DBClass.dataSelectAll();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록 화면</title>

<style>
.td_center{text-align:center;}
.td_left{text-align:left;} 
</style>
</head>

<body>
	<h1>방명록 리스트</h1>
	<table border ="1">
	<tr>
	<th width="50">번호</th><th width="3000">내용</th><th width="100">작성자</th>
	</tr>
<% 
	//ResultSet rs = DBClass.dataSelectAll();
	if(!rs.next()){
		out.print("<tr><td colspan='3'> 조회된 데이터가 없습니다.</td></tr>");
	}else{
		int no=0;
		String writer = null;
		String contents = null;
		rs.previous();//if(!rs.next() 한번 해줬기 때문에 while(rs.next())하면 중간 줄을 띄우고 보여줘서 rs.previous()를 붙인다.
		while(rs.next()){
			no=rs.getInt(1);
			writer = ChangeEncoding.toUnicode(rs.getString(2));
			contents = ChangeEncoding.toUnicode(rs.getString(3));
			contents = StringClass.before20Char(contents);// 20자 이후로 ...으로 보여주는 것
	%>
	
		<tr>
		<td class="td_center"><%=no %> </td>
		<td class ="td_left"><a href=detail.jsp?no=<%=no %>><%=contents %></a></td>
		<td class="td_center"><%=writer %> </td>
		</tr>
	<%}%>
	<%}%>

</table>
<br/>
<input type = "button" value="방명록쓰기" onclick="location.href='write_form.jsp'"/>
</body>
</html>