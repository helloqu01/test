<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page  import = "com.freeflux.encode.ChangeEncoding,com.freeflux.db.DBClass,java.sql.ResultSet,
  java.sql.SQLException,com.freeflux.str.StringClass" %>
<%
	int n=Integer.parseInt(request.getParameter("no"));
	ResultSet rs =DBClass.dataSelectOne(n);
	
	String writer = null;
	String contents= null;
	String PW = null;
	
	if(rs.next()){
		writer = ChangeEncoding.toUnicode(rs.getString(1));
		contents = ChangeEncoding.toUnicode(rs.getString(2));
		 PW = ChangeEncoding.toUnicode(rs.getString(3));
	}
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>방명록 내용 보기</title>
</head>

<body>
	<h1>방명록 글 상세보기</h1>
	<table>
	<tr>
		<td>작성자</td>
		<td><input type = "text" size = "20" readonly = "readonly" value = <%=writer%> disabled ="disabled"/></td>
			</tr><tr>
	<tr>
		<td>내용</td>
		<td><textarea rows="5" cols="50"  readonly="readonly" disabled ="disabled"><%= contents %></textarea></td>
	</tr>
			
	<form action = "delete.jsp">
	<tr>			
		<td>비밀번호</td>
		<td><input type = "password" placeholder="삭제시 비밀번호 입력" name = "pw" 
			required="required"/></td>
	</tr>
	<tr>
		<td><input type = "hidden" name = "no" value= "<%=n%>"/></td>
		<td><input type = "submit" value = "삭제"> &nbsp;<input type ="button" 
					value="글목록" onclick = "location.href='list.jsp'"/></td>
	</tr>
	</form>
	</table>
</body>
</html>