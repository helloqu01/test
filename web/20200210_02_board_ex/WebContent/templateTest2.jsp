<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%
    	String contentPage =request.getParameter("CONTENTPAGE");
    	String contentPage2 =request.getParameter("CONTENTPAGE2");
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr><td>
			<table width="500" border="1" cellpadding = "0" cellspacing="0" align="center">
			<tr><td height="30" ><jsp:include page="top3.jsp" flush="false"/></td></tr>
			<tr><td height="30" colspan=2 ><jsp:include page="content.jsp" flush="false"/></td></tr>
		
			</table></td>
	
			<td>
			<table width="500" cellpadding = "0" cellspacing="0" align="center"><hr>
			<tr><th height="30" align="left"><jsp:include page="top.jsp" flush="false"/></th>
			<th height="80" align="right" ><jsp:include page="top_1.jsp" flush="false"/></th></tr>
			<tr><td height="30" align="center"colspan="2" ><jsp:include page="top2.jsp" flush="false"/></tr>
			<tr> <td width="350" valign="top"colspan="2">
	 		<jsp:include page="<%=contentPage2%>" flush="false"/></td></tr>
		
			</table></td></tr>
	
	
	</table>

</body>
</html>