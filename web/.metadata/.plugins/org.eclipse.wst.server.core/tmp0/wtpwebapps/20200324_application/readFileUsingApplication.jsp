<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import ="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>application 기본 객체를 사용하여 자원 읽기 </title>
</head>
<body>
<%-- 에플리케이션 내에서의 경로를 사용한다. --%>
<%
	String resourcePath =" 경로 ";
%>
<%-- 자원의 실제 경로를 구한다. --%>
자원의 실제 경로:<br>
<%= application.getRealPath(resourcePath) %>
<br>
-----------<br>
<%=resourcePath %>의 내용 <br>
-----------<br>
<%
	char[] buff = new char[128];
	int len = -1;
	//자원으로부터 데이터를 읽어오는 스트림을 생성한다.
	try(InputStreamReader br = new InputStreamReader(application.getResourceAsStream(resourcePath), "UTF-8")){
		//스트림으로부터 데이터를 읽어와 출력한다.
		while((len = br.read(buff))!=-1){
			out.print(new String(buff,0,len));
		}
	}catch(IOException ex) {
		out.println("익셉션 발생 : "+ex.getMessage());
	}
	
	%>
</body>
</html>