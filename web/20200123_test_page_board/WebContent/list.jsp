<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.freeflux.db.DBRWClass" %>
<%
	int total = DBClass.dataCount2();
// 	int listNum = 10;// 한 화면에 출력할 게시물의 갯수
// 	int totalPageNum = 0;
// 	if (total > 0) { // 정수는 0으로 나눌 수 없다.
// 		out.print("총 데이터(레코드)의 갯수 :" + total);
// 		//총 페이지 수 구하기 = 총 데이터의 갯수/ 한 화면에 출력할 게시물의 갯수
// 		double d = total / (listNum * 1.0);//총 페이지 수(소수점)
// 		d = Math.ceil(d); // 소수점 이하 자리수를 올림
// 		totalPageNum = (int) d; //정수형 변환
// 		out.print("총 페이지 수 :" + totalPageNum);
// 	}

// 	int pageNo = 0;
// 	pageNo = Integer.parseInt(request.getParameter("pNo"));
%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>글목록(10개씩) 화면</title>
</head>

<body>
	<!-- 여기에는 테이블이 오는 위치 -->




</body>
</html>