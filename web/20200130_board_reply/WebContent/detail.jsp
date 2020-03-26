<%@page  import = "com.freeflux.encode.ChangeEncoding,com.freeflux.db.DBClass,java.sql.ResultSet,
  java.sql.SQLException,com.freeflux.str.StringClass" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int n =  Integer.parseInt(request.getParameter("no"));

	ResultSet rs = DBClass.dataSelectOne(n);
	
	String name = null;
	String contents= null;
	
	
	if(rs.next()){

		name = ChangeEncoding.toUnicode(rs.getString(1));
		contents = ChangeEncoding.toUnicode(rs.getString(2));
	
	}
	
%>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 상세보기</title>
</head>
<body>
	<h1>글 상세보기</h1>
	<table>
		<tr>
			<label>작성자  </label>
			<input type = "text" size = "49px" readonly="readonly" value = <%=name%> disabled="disabled">
			<br/><br/>
			<label>내용 </label>
			<textarea rows = "30px" cols= "50px" readonly="readonly"  disabled="disabled"><%=contents%></textarea>
		</tr>
		
		<form action = "delete.jsp">
		
		<tr>
		<td><input type = "hidden" name = "no" value= "<%=n%>"/></td>
		<td><input type = "submit" value = "삭제"> &nbsp;
		<input type="button" value="글수정" onclick="location.href='modify_form.jsp?no=<%= n %>'" /></td>
		</tr>
		</form>
	</table>
<h1>답글쓰기</h1>
	<form action = "write.jsp" method="get">
	<table>
		<tr>
			<label>작성자</label>
			<input type = "text" size = "50" name ="name"placeholder="꼭꼭" required="required"/>
		</tr>
	</br></br>
		<tr>
			<label>내용</label>
			<textarea rows = "5" cols="50" name ="contents" required="required"/></textarea>
		</tr>
	</br></br>
		
	</br></br>
		<tr>
			<td>
			<input type = "submit" value="답변저장"/>&nbsp;
			<input type = "reset" value="취소"/>&nbsp;
			
			<input type = "button" value="글목록" onclick = "location.href='list.jsp'"/>
			</td>
		</tr>
	</table>
	</form>
	
</body>
</html>