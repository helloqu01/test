<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
String mySQL_id="root";
String mySQL_pw="920424";
String id = request.getParameter("txtID");
String pw = request.getParameter("txtPW");

if(mySQL_id.equals(id)&& mySQL_pw.equals(pw)){
	out.println(id);
	out.println("���� �α��� �Ǿ����ϴ�.");
}else{
	out.println("���̵� �Ǵ� ��й�ȣ�� Ȯ�����ּ���");
}


%>