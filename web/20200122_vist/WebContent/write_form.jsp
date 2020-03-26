<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>방명록 글쓰기 화면</title>
</head>

<body>
	<h1>방명록 글쓰기</h1>
	<form action = "write.jsp" method="get">
	<table>
		<tr>
			<td>작성자</td>
			<td><input type = "text" size = "50" name ="writer" required="required"/> </td>
		</tr>
	</br></br>
		<tr>
			<td>내용</td>
			<td><textarea rows = "5" cols="50" name ="contents" required="required"/></textarea></textarea></td> 
		</tr>
	</br></br>
		<tr>
			<td>비밀번호</td>
			<td><input type = "password" size = "50" name ="PW" placeholder="한글제외" required="required"/></td>
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