<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>어드민 상품 업로드 화면</title>
</head>
<body>
    <table border="1" width="1000" height="400">
    
    <tr>
    <td rowspan="3">이미지</td>
    <td>상품명</td>
    <td><input type="text" name ="productName" />
    </tr>
    
    
    <tr>
    <td>가격</td>
    <td><input type="text" name ="productPrice"/>
    </tr>
    
    <tr>
    <td align="right" colspan="2">
    <select name="searchName" size="1">
             <option value="type">TOP</option>
             <option value="type">BOTTOM</option>
              <option value="type">DRESS</option>
     </select> 
    </td>
    </tr>
    
     <tr>
    <td colspan="3" ><textarea ></textarea><td>
    </tr>
    
    <tr>
    <td align="right" colspan="3"><input type="submit" value="등록" onclick="location.href='adminList.jsp'">
    <input type="button" value="취소" onclick="location.href='adminList.jsp'"></td>
     </tr>
    </table>


</body>
</html>