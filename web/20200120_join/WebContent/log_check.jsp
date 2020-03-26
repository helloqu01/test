<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
String mySQL_id="root";
String mySQL_pw="920424";
String id = request.getParameter("txtID");
String pw = request.getParameter("txtPW");

if(mySQL_id.equals(id)&& mySQL_pw.equals(pw)){
	out.println(id);
	out.println("님이 로그인 되었습니다.");
}else{
	out.println("아이디 또는 비밀번호를 확인해주세요");
}


%>