<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"></meta>
	<title>게시판 목록</title>

	<style type="text/css">
		* {font-size: 9pt;}
		p {width: 600px; text-align: right;}
		table thead tr th {background-color: gray;}
	</style>
</head>

<body>
	<form  action="" method="get"  >
	<p>
		<select name="searchType">
			<option value="ALL" selected="selected">전체검색</option>
			<option value="SUBJECT" >제목</option>
			<option value="WRITER" >작성자</option>
			<option value="CONTENTS" >내용</option>
		</select>
		<input type="text" name="searchText"  />
		<input type="submit" value="검색" />
	</p>
	</form>
	
	
	<table border="1" summary="게시판 목록">
		<caption>게시판 목록</caption>
		<colgroup>
			<col width="50" />
			<col width="300" />
			<col width="80" />
			<col width="100" />
			<col width="70" />
		</colgroup>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>등록 일시</th>
				<th>조회수</th>
			</tr>
		</thead>

		<tbody>
			<tr>
				<td align="center" colspan="5">등록된 게시물이 없습니다.</td>
			</tr>

			<tr>
				<td align="center">글번호 출력 부분</td>
				<td><a href="#상세보기서블릿?번호전달" /></a>제목 출력 부분</td>
				<td align="center">작성자 출력 부분</td>
				<td align="center">등록 날짜 출력 부분</td>
				<td align="center">조회수 출력 부분</td>
			</tr>
		</tbody>

		<tfoot>
			<tr>
				<td align="center" colspan="5">페이지 번호 출력(마지막에 기술)</td>
			</tr>
		</tfoot>
	</table>
	
	<p>
		<input type="button" value="목록"  onclick="location.href='글목록서블릿?페이지번호전달'"/>
		<input type="button" value="글쓰기"  onclick="location.href='글쓰기서블릿'" />
	</p>
</body>
</html>