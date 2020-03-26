<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
</head>
<body>
 <label>파일형 게시판 글 목록- 글목록 화면</label>
 	<br/><br/>
 	<select id ="s2ID" cols = "30" size = "10" onchange="postDetail(this)" multiple>
	<option value = "보고싶은 파일을 아래에서 선택하세요.">보고싶은 파일을 아래에서 선택하세요.<option/>
		out.print("<option>"+파일명+"<option/>");
	</select>
	
</body>
</html>