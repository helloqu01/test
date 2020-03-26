<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*,board.dto.*"%>	

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시판 목록</title>
	</head>
	
	<body>
		<table border="1">
			<tr>
				<td align="center" colspan="5">*** 게시판 목록***&nbsp;&nbsp;&nbsp; 
					<a href="writeui.do">글쓰기</a>
				</td>
			</tr>
			
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
			<%
			    ArrayList list = (ArrayList)request.getAttribute("list"); //Object로 꺼내지기 때문에 (ArrayList)로 형변환한다.
			
			    if(list!=null){ //데이터가 존재한다면
			    	
			        Iterator iter = list.iterator(); //Iterator가 주로 쓰이는 경우는 set계열일 경우(인터페이스)
			        while(iter.hasNext()==true){ //hasNext() 꺼내올 데이터가 있으면 계속 얻어옴. true, 없으면 false를 반환
			        	
			            BoardDTO data = (BoardDTO)iter.next();//next()읽어 올 요소가 남아있는지 확인하는 메소드,true, 없으면 false를 반환
			            int num = data.getNum();
			            String title = data.getTitle();
			            String author = data.getAuthor();
			            String content = data.getContent();
			            String writeday = data.getDate();
			            int readcnt = data.getReadcnt();
			%>
			<tr>
				<td align="center"><%= num %></td>
				<td><a href="retrieve.do?num=<%= num %>"><%= title %></a></td>
				<td><%= author %></td>
				<td><%= writeday.substring(0,10)%></td> <!-- substring(0,10) 문자열을 자르는 것 9개의 문자열을 꺼내온다 -->
				<td><%= readcnt%></td>
			</tr>
			<%
					}//end while
				}//end if
			%>
			
			<!-- 검색 기능 시작 -->
			<tr>
				<td colspan="5" align="center">
					<form action="search.do">
						<select name="searchName" size="1">
							<option value="author">작성자</option>
							<option value="title">제목</option>
						</select> 
						<input type="text" name="searchValue" />
						<input type="submit" value="검색" />
					</form>
				</td>
			</tr>
			
		</table>
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