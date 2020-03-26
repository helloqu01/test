<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html > <!-- <!DOCTYPE html >  html 5 방식으로 바꿔주어야한다.-->
<html>
<head>
<meta charset="UTF-8"><!-- HTML5 방식 -->
<title>글쓰기 화면</title>
</head>
<body>
<h1>글쓰기</h1>
<form action = "write.jsp" method="get">
	<input type = "text" size ="50" name="writer"required="required"/>
<br/><br/>
	<input type = "text" size ="100" name="title"required="required"/>
<br/><br/>
<textarea rows = "10" cols="100" name ="contents"required="required"></textarea>
<br/><br/>
 <input type = "button" value="글목록" onclick = "location.href='list.jsp'"/> 	
 <input type = "submit" value="글저장"/> 
 <input type = "reset" value="초기화"/>
</form>


<p style="font-size:200%">글쓰기</p>
<input type ="text" size ="50" name="writer"/>
<br/><br/>
<textarea rows="10" cols="60" name= "contents"></textarea>
<br/>
 <input type = "submit" value="글저장"/> 
 <input type = "reset" value="초기화"/>
 
 
</body>
</html>