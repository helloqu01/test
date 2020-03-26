<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"></meta>
	<title>게시판 목록</title>

	<style type="text/css">
	
	
		* {font-size: 9pt;} <!--* 바디와 바디사이에있는 모든 것은9 포인트(pt)로 출력하라 -->
		p {width: 600px; text-align: right;} <!--p는 p태그를 말한다. 가로 600 p태그 내부의 정렬 방식은 오른쪽 방식(생략하면 왼쪽정렬된다.)-->
		table thead tr th {background-color: gray;} <!--table thead tr th =>바디 안에있는 테이블태그 tr th 부분을 회색으로 칠해라 -->
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
	
	
	<table border="1" summary="게시판 목록"><!--summary => 코멘트  -->
		<caption>게시판 목록</caption> <!--<caption> => 테이블의 제목을 붙여주는 부분   테이블에서 가장 먼저 써주는 것 1번-->
		<colgroup> <!--<colgroup> => 컬럼그룹을 사용하는 경우는 td의 크기를 일괄적으로 적용하고 싶을 때 사용  /두번째로 사용하는 것 2번 /테이블 내부 구조에 대한 사전 작업의 마지막 부분-->
			<col width="50" /><!-- 칸이 5개이기 때문에 <col width="">가 5개이다 -->
			<col width="300" />
			<col width="80" />
			<col width="100" />
			<col width="70" />
		</colgroup>
		<thead> <!--<thead> 테이블의 헤더라는 뜻이다 제목 영역이다. -->
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>등록 일시</th>
				<th>조회수</th>
			</tr>
		</thead>

		<tbody> <!--<tbody> 테이블의 몸통 역할을 해준다. -->
			<tr>
				<td align="center" colspan="5">등록된 게시물이 없습니다.</td>
			</tr>

			<tr>
				<td align="center">글번호 출력 부분</td><!--  align(정렬시키는 코드) 가운데 정렬 시키는 것 -->
				<td><a href="#상세보기서블릿?번호전달" /></a>제목 출력 부분</td>
				<td align="center">작성자 출력 부분</td>
				<td align="center">등록 날짜 출력 부분</td>
				<td align="center">조회수 출력 부분</td>
			</tr>
		</tbody>

		<tfoot> <!-- <tfoot> 테이블의 아랫쪽 부분 -->
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