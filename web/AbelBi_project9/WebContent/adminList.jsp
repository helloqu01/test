<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.*, board.dto.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>유저 리스트 화면</title>

</head>

<body>
	<form action="adminUpload.jsp" enctype="multipart/form-data" >
   <table border="1" width="800" height="400">
   <tr>
            <td colspan="9" align="center">
               <form action="#">
                  <select name="type" size="1">
                     <option value="top">TOP</option>
                     <option value="bottom">BOTTOM</option>
                     <option value="dress">DRESS</option>
                  </select> 
                  <input type="submit" value="검색" />
               </form>
            </td>
         </tr> 

         <tr><th>번호</th><th>상품명</th><th>상품가격</th><th>분류</th></tr>
         
         <%
             ArrayList list = (ArrayList)request.getAttribute("list");
         
             if(list!=null){ //데이터가 존재한다면
                 Iterator iter = list.iterator();
                 while(iter.hasNext()==true){ //꺼내올 데이터가 있으면 계속 얻어옴.
                    
               BoardDTO data = (BoardDTO)iter.next(); 
               int idx = data.getIdx();
                 String summary = data.getSummary();
/*                  String top = data.getTop();
                 String bottom = data.getBottom();
                 String dress = data.getDress(); 
                 String productImage = data.getProductImage();*/
                 String productName = data.getProductName();
                 String productPrice = data.getProductPrice();    
         %>
         
<%--         <tr>
        <td><img src="<%=idx %>" width="200" height="250"><p><%=productName %><BR><%=productPrice %></p></td>
		</tr> --%>
		
	  <tr>
         <td align="center"><%= idx %></td>
         <td><a href="retrieve.do?idx=<%= idx%>"><%=productName%></a></td>
         <td><%=productPrice %></td>
         <td><%=summary %></td>
      </tr>
			
            
         <% } %>
         <% } %>   
         
         <tr>
         <td align="right"><input type="button"  value="등록" onclick="location.href='writeui.do'" ></td>
         </tr>
      </table>   



   </form>
</body>
</html>