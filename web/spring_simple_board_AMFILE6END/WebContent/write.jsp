<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<form action="write.do">
			<table>
				<tr>
					<td>제   목</td><td><input type="text" name="title" /></td>
				</tr>
				<tr>
					<td>작성자</td><td><input type="text" name="author" /></td>
				</tr>
				<tr>
					<td>내   용</td>
					<td><textarea name="content" rows="5" cols="30"></textarea></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="저장" /></td>
				</tr>
			</table>
		</form>
	</body>
</html>


<%-- 글 쓰기 화면을 출력
입력된 내용을 WriteActionController 에게 전달.
글 저장과 글 목록으로 이동하는 기능 보유 --%>