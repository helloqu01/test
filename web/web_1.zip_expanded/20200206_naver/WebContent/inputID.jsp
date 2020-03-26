<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	String use_id = (String)request.getAttribute("USE_ID");
 	String result = result=(String)request.getAttribute("RESULT");
 	System.out.println(result+"++++++++");
 	
 	if(result==null){
 		result="";
 	 	System.out.println(result+"============");
 	}
 
 %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>아이디 중복체크 화면</title>
</head>
<body>
	<form action="LogCheck" method="post">
	<table>
	<tr>
		<td>사용 할 아이디</td>
	
	<td><input type="text" name = "USE_ID" value= "<%=use_id%>"></td>
	</tr>
	<tr><td><%=result%></td></tr>
	<tr>
	<td><input type="submit" value="중복확인" ></td>
	<td><input type="button"  value="사용"  onclick="location.href='PersonalInfo.jsp?use_id=<%=use_id %>'" ></td>
	</tr>
	</table>
	</form>

</body>
</html>