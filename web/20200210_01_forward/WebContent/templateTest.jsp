<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <% 
   	String contentPage = request.getParameter("CONTENTPAGE");
   	//String contentPage = "content.jsp";
   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>templateTest 페이지 연습</title>
</head>
<body>
	<!-- cellpadding,cellspacing 떨어진 간격 -->
	<table width="600" border="1" cellpadding = "0" cellspacing="0" align="center">
	
	<tr height="80">
	 <td colspan="2"> <!-- 상단영역 -->
	 	<jsp:include page="top.jsp" flush="false"/>
	 	</td>
	 </tr>
	 
	<tr height = 300>
	 <td width="150" valign="top"> <!-- 좌측영역 -->
	 	<jsp:include page="left.jsp" flush="false"/>
	 	</td>

	 <td width="350" valign="top"> <!-- 본문 영 역 -->
	 	<jsp:include page="<%=contentPage%>" flush="false"/>
	 	</td>
	 </tr>
	 
	 <tr height="80">
	 <td colspan="2"> <!-- 하단영역 -->
	 	<jsp:include page="bottom.jsp" flush="false"/>
	 	</td>
	 </tr>
	 
	
	</table>
	
</body>
</html>