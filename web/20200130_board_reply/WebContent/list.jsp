<%@page import="java.sql.ResultSet"%>
<%@page  import = "com.freeflux.encode.ChangeEncoding,com.freeflux.db.DBClass,java.sql.ResultSet,
  java.sql.SQLException,com.freeflux.str.StringClass" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
</head>
<body>

	<h1>리스트</h1>
	<table border ="1">
	<tr>
	<th width="50">번호</th><th width="100">내용</th><th width="50">작성자</th>
	<tr/>
	
	<% ResultSet rs = DBClass.dataSelectAll();
		if(!rs.next()){
			out.print("<tr><td colspan='3' 조회된 데이터가 없습니다.</td></tr>");
		}else{
			int idx = 0;
			String name = null;
			String contents = null;
			
			rs.previous();
			while(rs.next()){
				idx=rs.getInt(1);
				name = ChangeEncoding.toUnicode(rs.getString(2));
				contents = ChangeEncoding.toUnicode(rs.getString(3));
				contents = StringClass.before20Char(contents);
				
	%>
	
		<tr>
		<td class="td_center"><%=idx %> </td>
		<td class ="td_left"><a href=detail.jsp?no=<%=idx %>><%=contents %></a></td>
		<td class="td_center"><%=name %> </td>
		
		</tr>
		<%}%>
		<%}%>
		
	</table>
<br/>
<input type = "button" value="글쓰기" onclick="location.href='write_form.jsp'"/>
</body>
</html>