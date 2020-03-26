<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "board_write_list2.DBClass,java.sql.ResultSet,java.sql.SQLException,com.freeflux.encode.ChangeEncoding"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head><title>글 목록 화면</title></head>
<table border="1">
<tr><th>idx</th><th>writer</th><th>title</th><th>contents</th><th>hit</th></tr>
<%
	ResultSet rs =DBClass.dataSelectAll();
	int no = 0;
	String writer =null;
	String title =null;
	String contents =null;
	int hit = 0;

	while(rs.next()){
	no=rs.getInt(1);
	writer=ChangeEncoding.toUnicode(rs.getString(2)); 
	title=ChangeEncoding.toUnicode(rs.getString(3)); 
	contents=ChangeEncoding.toUnicode(rs.getString(4)); 
	hit=rs.getInt(5);


%>

<tr>
<td> <%=no%></td>
<td> <%=writer%></td>
<td> <a href=hit.jsp?no=<%=no%>><%=title%></a></td>
<td> <%=contents%></td>
<td> <%=hit%></td>
</tr>
	<%}%>
		</table>
		<br/>
		<input type = "button" value="글쓰기" onclick="location.href='write_form.jsp'"/>  
	</body>
</html>