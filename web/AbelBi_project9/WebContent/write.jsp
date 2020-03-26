<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>어드민 상품 업로드 화면</title>
</head>
<body>
		<form action="write.do">
    <table border="1" width="1000" height="400">
    
    <tr>
    <td rowspan="3">이미지<input type="file" name="productImage" /></td>
    <td>상품명</td>
    <td><input type="text" name ="productName" />
    </tr>
    
    
    <tr>
    <td>가격</td>
    <td><input type="text" name ="productPrice"/>
    </tr>
    
    <tr>
    <td align="right" colspan="2">
         <!-- <select name="type" size="1">
              <option value="top">TOP</option>
              <option value="bottom">BOTTOM</option>
             <option value="dress">DRESS</option>
     </select> --> 
     <input type="text" name ="summary" placeholder="top / bottom / dress 를 입력해주세요"/>
     
    </td>
    </tr>
    
     <tr>
    <td colspan="3"  ><input type="text" name="productContent" ><td>
    </tr>
    
    <tr>
    	<td align="right" colspan="3"><input type="submit" value="등록" >
  	 	 <input type="button" value="취소" onclick="location.href='adminList.jsp'"></td>
     </tr>
    </table>
</form>

</body>
</html>