<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@page import="java.util.*,board.dto.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
</head>
<body>
	XML 성공!!
</body>
</html>

<%-- 글 목록 및 검색 결과를 출력, ListActionController로부터 전달된 ArrayList객체를
1. ArrayList 객체가 Null 인지를 확인
2. null이 아닌 경우 Iterator 객체 추출
3. 전달된 각 데이터를 하나씩 추출
4. 추출될 때마다 DTO객체로 형변환하고,
5. <table></table> 내에서 한 줄씩 출력
제목은 "retrieve.do?num=글번호" 형태로 링크 설정.

글 목록 중 하나를 선택하면 해당 글 번호를 RetrieveActionController에게 전달 --%>