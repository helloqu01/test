<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, board.dto.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>어드민 리스트 화면</title>
</head>
<body>
   <table border="1" width="1000" height="400">

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
      </table>
      
       <table>
			<%
			    ArrayList list = (ArrayList)request.getAttribute("list");
			
			    if(list!=null){ //데이터가 존재한다면
			        Iterator iter = list.iterator();
			        while(iter.hasNext()==true){ //꺼내올 데이터가 있으면 계속 얻어옴.
			        	
					BoardDTO data = (BoardDTO)iter.next(); 
			        String type = data.getType();
			        String top = data.getTop();
			        String bottom = data.getBottom();
			        String dress = data.getDress();
			        String productImage = data.getProductImage();
			        String productName = data.getProductName();
			        String productPrice = data.getProductPrice();
			       
			%>
          
      	   <jsp:include page="<%=top%>" flush="false">
      	   		<jsp:param name="productImage" value="<%=productImage %>" />
				<jsp:param name="productName" value="<%=productName%>" />
				<jsp:param name="productPrice" value="<%=productPrice%>"/>			
		</jsp:include>
			<% } %>
			<% } %>      
	</table>
    
    <table>
     <tr>  
      	<td><img src="./top/1.jpg"><BR>상품명<BR>상품가격</td>
      	<td><img src="./top/1.jpg"><BR>상품명<BR>상품가격</td>
      	<td><img src="./top/1.jpg"><BR>상품명<BR>상품가격</td>
      </tr>

			
			
      <tr>
         <td colspan="9" align="center"/>
      </tr>
     </table>

   
</body>
</html>