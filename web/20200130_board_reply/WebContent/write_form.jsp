<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>글쓰기 화면</title>
</head>

<body>
	<h1>글쓰기</h1>
	<form action = "write.jsp" method="get">
	<table>
		<tr>
			<label>작성자  </label>
			<input type = "text" size = "50" name ="name" required="required"/>
		</tr>
	</br></br>
		<tr>
			<label>내용  </label>
			<textarea rows = "5" cols="50" name ="contents" required="required"/></textarea>
		</tr>
	
	
	</br></br>
		<tr>
			<td>
			<input type = "submit" value="글저장"/>&nbsp;
			<input type = "reset" value="수정"/>&nbsp;
			<input type = "button" value="글목록" onclick = "location.href='list.jsp'"/>
			</td>
		</tr>
	</table>
	</form>
	</body>
</html>