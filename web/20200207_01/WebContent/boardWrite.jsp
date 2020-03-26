<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시판 등록 폼</title>
	<script src="./ckeditor/ckeditor.js" ></script>
</head>

<body>

	<form action=" 글저장서블릿"  method="post" >
	
	<table border="1" summary="게시판 등록 폼">
		<caption>게시판 등록 폼</caption>
		
		<colgroup>
			<col width="100" />
			<col width="500" />
		</colgroup>
		
		<tbody>
		
			<tr>
				<th align="center">제목</th>
				<td><input type="text" name="subject" size="80" maxlength="100" required /></td>
			</tr>
			
			<tr>
				<th align="center">작성자</th>
				<td><input type="text" name="writer" maxlength="20" required /></td>
			</tr>
			
			<tr>
				<td colspan="2">
					<textarea name="contents" cols="80" rows="10" required></textarea>
					<script>
					CKEDITOR.replace('contents');
					</script>
				</td>
			</tr>
		</tbody>
	</table>
	<p>
		<input type="button" value="목록" onclick="location.href='글목록서블릿'" />
		<input type="submit" value="글쓰기" />
	</p>
	</form>
</body>
</html>