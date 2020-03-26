<%@page import="javax.xml.bind.DataBindingException"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import = "com.freeflux.db.DBReadWriteClass,java.sql.ResultSet,java.sql.SQLException,com.freeflux.encode.ChangeEncoding"%>
<% 
DBReadWriteClass.connectMySQL();// mySQL 접속
ResultSet rs = DBReadWriteClass.dataSelectAll();//stu_table의 select 결과
//rs.next();//실제 데이터 위치로 이동
//System.out.println(rs.getString(1));//첫 번째 필드 값 출력
//System.out.println(rs.getString(2));//두번째 필드 값 출력
//System.out.println(ChangeEncoding.toUnicode(rs.getString(3)));//세번째 필드값 출력
%>
<!DOCTYPE html>
<html>
<head><title></title></head>

<table border="1">

<tr><th>학번</th><th>주민번호</th><th>이름</th></tr>
<%while(rs.next()){%>
<tr>
<td><%=rs.getString(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=ChangeEncoding.toUnicode(rs.getString(3)) %></td>
</tr>
<%}%>

 		</table>
	</body>
</html>



