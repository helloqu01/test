<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시판 등록 폼</title>
	<!--<script src=""></script> => 외부 자바 스크립트를 불러 올 때 사용하는 코드
	*시작 태그와 닫는 태그가 분리 되어 있어야한다.-->
	<script src="./ckeditor/ckeditor.js" ></script><!--  ./ckeditor/ckeditor.js 가장 먼저 로드로 불러와야한다.-->
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
					<textarea name="contents" cols="80" rows="10" required></textarea><!--required></textarea> 이 사이에 한글을 넣으면 나타나지 않는다.-->
					<script>
					CKEDITOR.replace('contents'); <!--해당 객체를 불러와서 쓰는 것-->
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


<!-- HTML 4방식
<head>
	1.<meta -- >
	2.<title -- >
	3.<style -- >
	4.<scrip -- >
</haed>
 -->
 
 <!-- HTML 5방식
<head>
	1.<meta -- >
	2.<title -- >
	3.<style>  =>css파일로 관리하라고 함
	4.<scrip>
</haed>

*바디태그는 HTML에 넣어놓고
*스타일 태그는 보드리스트 처럼 해드 안에 넣지 말라고 함
*~.js를 사용
 -->
 
 
 