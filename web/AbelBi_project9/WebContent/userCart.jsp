<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>유저 장바구니 화면</title>
</head>
<body>
<table border="1" width="1000" height="400">
         <tr>
            <td align="left" colspan="5">장바구니&nbsp;&nbsp;&nbsp;
            </td>
         </tr>
         
         <tr>
            <th>이미지</th>
            <th>제품명</th>
            <th>수량</th>
            <th>가격</th>
            <th>배송비</th>
         </tr>
         
         <tr>
            <th>이미지</th>
            <th>제품명</th>
            <th>수량</th>
            <th>가격</th>
            <th>배송비</th>
         </tr>

         <td align="right" colspan="5">총구매금액 : <input type="text" name="customerName"></td>
         </tr>
         
         <tr>
         <td colspan="5">이름 : <input type="text" name="customerName"></td>
         </tr>
         
         <tr>
         <td colspan="5">전화번호 : <input type="text" name="customerPhone"></td>
         </tr>
         
         <tr>
         <td colspan="5">주소 : <input type="text" name="customerAddress"></td>
         </tr>
         
         <tr>
         <td colspan="5">주문메세지 : <input type="text" name="message"></td>
         </tr>
         
         <tr>
             <td align="right" colspan="5"><input type="submit" value="주문하기" onclick="location.href='list.jsp'">
          <input type="button" value="취소" onclick="location.href='list.jsp'"></td>
           </tr>
   </table>


</body>
</html>