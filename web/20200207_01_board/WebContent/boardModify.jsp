<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8"></meta>
	<title>게시판 수정 폼</title>
	<script src="./ckeditor/ckeditor.js" ></script>
	
	<style type="text/css">
		* {font-size: 9pt;}
		p {width: 600px; text-align: right;}
		table tbody tr th {background-color: gray;} 
	</style>
	
</head>
<body>

	<form action=" 글수정서블릿" method="post" >
		<input type="hidden" name="num" value="글번호" />
		<input type="hidden" name="pageNum" value="페이지번호" />
		<input type="hidden" name="searchType" value="검색타입" />
		<input type="hidden" name="searchText" value="검색어" />
		
		<table border="1" summary="게시판 수정 폼">
			<caption>게시판 수정 폼</caption>
			<colgroup>
				<col width="100" />
				<col width="500" />
			</colgroup>
			<tbody>
				<tr>
					<th align="center">제목</th>
					<td>
					<input type="text" name="subject" size="80" maxlength="100" value="글제목"  /></td>
				</tr>
				<tr>
					<th align="center">작성자</th>
					<td><input type="text" name="writer" maxlength="20" value="작성자" /></td>
				</tr>
				<tr>
					<td colspan="2">
						<textarea name="contents" cols="80" rows="10">글내용</textarea>
						<script>
						CKEDITOR.replace('contents');
						</script>
					</td>
				</tr>
			</tbody>
		</table>
		
		<p>
			<input type="button" value="목록" onclick="location.href='글목록서블릿?페이지번호,검색타입,검색어전달'" />
			<input type="submit" value="글수정" />
		</p>
	
	</form>
</body>
</html>