<%@page import="javax.xml.bind.DataBindingException"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import = "com.freeflux.db.DBReadWriteClass,java.sql.ResultSet,java.sql.SQLException,com.freeflux.encode.ChangeEncoding"%>
<% 
DBReadWriteClass.connectMySQL();// mySQL ����
ResultSet rs = DBReadWriteClass.dataSelectAll();//stu_table�� select ���
//rs.next();//���� ������ ��ġ�� �̵�
//System.out.println(rs.getString(1));//ù ��° �ʵ� �� ���
//System.out.println(rs.getString(2));//�ι�° �ʵ� �� ���
//System.out.println(ChangeEncoding.toUnicode(rs.getString(3)));//����° �ʵ尪 ���
%>
<!DOCTYPE html>
<html>
<head><title></title></head>

<table border="1">

<tr><th>�й�</th><th>�ֹι�ȣ</th><th>�̸�</th></tr>
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



