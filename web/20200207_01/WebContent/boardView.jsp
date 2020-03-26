<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8"></meta>
	<title>게시판 상세보기</title>
	
	<style>
		* {font-size: 9pt;}
		.btn_align {width: 600px; text-align: right;}
		table tbody tr th {background-color: gray;}
	</style>

</head>

<body>
	<table border="1" summary="게시판 상세조회">
		<caption>게시판 상세조회</caption>
		<colgroup>
			<col width="100" />
			<col width="500" />
		</colgroup>
		<tbody>
			<tr>
				<th align="center">제목</th>
				<td>글제목출력</td>
			</tr>
			<tr>
				<th align="center">작성자/조회수</th>
				<td>작성자출력 / 조회수 출력</td>
			</tr>
			<tr>
				<th align="center">등록 일시</th>
				<td>등록 일시 출력</td>
			</tr>
			<tr>
				<td colspan="2">글내용 출력</td>
			</tr>
		</tbody>
	</table>
	
	<p class="btn_align">
		<input type="button" value="목록" onclick="location.href='글목록서블릿?페이지번호,검색타입,검색어전달'"/>
		<input type="button" value="수정" onclick="location.href='글수정서블릿?페이지번호,검색타입,검색어전달'" />
		<input type="button" value="삭제" onclick="location.href='글삭제서블릿?페이지번호,검색타입,검색어전달'" />
	</p>
	
</body>
</html>