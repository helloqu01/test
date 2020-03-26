<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    	String use_id = request.getParameter("use_id");
    if(use_id==null){
    	use_id="";
    }
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="JoinInsert" method="post">
	ID:<input type="text" name = "ID" value = "<%=use_id%>" required>
		<input type="button" value="중복확인" onclick = "location.href='LogCheck?input_id='+ID.value"><br>
	PW:<input type="password" name = "PW" pattern = "[a-z0-9_]*"  placeholder="영문 숫자 입력"><br>
	email:<input type="text" name = "EMAIL" ><br>
	phone:<input type="text" name="PHONE" pattern = "[-0-9]*"><br>
	<input type="submit" value="저장">
	<input type="reset" value="취소">
	</form>
</body>
</html>

<!-- 중복확인의 2가지 방법
	1.새로 작성해야하는 방식
	2.값을 불러와서 확인하는 방식
	
	전달->서블릿->DAO->1.content
					2.중복확인



 -->