<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>

<!-- 글 목록 및 검색 결과를 출력 
	ListActionController 로부터 전달된 ArrayList객체를
	1. 어레이리스트 객체가 null 인지를 확인
	2.null이 아닌경우 Iterator 객체 추출
	3.전달된 각 데이터를 하나씩 추출
	4.추출될 때마다 ATO객체로 형변환하고,
	5.<table></table>내에 한줄씩 출력
	
	제목은 "retrieve.do?num=글번호"형태로 링크 설정
	글 목록 중 하나를 서낵하면 해당 글 번호를 RetrieveActionController에게 전달

<!----!>(HTML주석)
<%----%>(jsp주석)
-->