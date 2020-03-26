<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page  import = "com.freeflux.encode.ChangeEncoding,com.freeflux.db.DBClass,java.sql.ResultSet,
  java.sql.SQLException,com.freeflux.str.StringClass" %>
<%
	int no=Integer.parseInt(request.getParameter("no"));
	ResultSet rs=DBClass.dataSelectOne(no);
	rs.next();
	String name=ChangeEncoding.toUnicode(rs.getString(1));
	String contents=ChangeEncoding.toUnicode(rs.getString(2));
%>
<!DOCTYPE html> <!-- HTML5 방식 -->
<html>
<head>
<meta charset="UTF-8"> <!-- HTML5 방식 -->
<title>글 수정 화면</title>
</head>
<body>
	<h1>글 수정 하기</h1>
	<form action="modify.jsp" method="get">
		<table>
			<tr>
				<td>작성자</td>
				<td><input type="text" size="20" readonly="readonly" name="writer"  value=<%= name %> /> </td>
			</tr>
			<br/><br/>
				<td>내용</td>
				<td><textarea rows="10" cols="60" name="contents"  required="required" ><%= contents %></textarea></td>
			</tr>
			<tr>
				<td><input type="hidden" size="20" readonly="readonly" name="no"  value=<%= no %> /></td>
				<td>
				<input type="button"  value="글목록" onclick="location.href='list.jsp'" />
				<input type="submit" value="글수정저장"  />
				</td>
			</tr>
		</table>
		</form>
</body>
</html>



