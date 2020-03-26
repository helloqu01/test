
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


</head>
<body>

	<table border="1" width="1000">
	<tr><!-- tr 행 -->
		<th colspan="9" height="50"><font size="5"> 이 력 및 경 력 기 술</font></th> <!--colspan 행 th 제목셀 -->
	</tr>
	
	<tr>
		<th rowspan="3" width="85" height="70" bgcolor="D5D5D5">성명</th><!-- rowspan 열 3줄 -->
	</tr>
	
	<tr>
		<th colspan="2" bgcolor="D5D5D5">한글:</th>
		<td width="90"><input type="text" name="korname" required pattern="^[가-힣]*$" placeholder="한글만 입력" /></td>
		
         <th bgcolor="D5D5D5">희망분야</th>
         <td width="90"><input type="text" name="part" value="프로그램 개발 엔지니어" readonly /></td>
         <th colspan="2" width="80" bgcolor="D5D5D5">작성일자</th>
         <td width="90"><input type="text" name="writedate" value=" " /></td>
      </tr>
      <tr>
         <th colspan="2" bgcolor="D5D5D5">영문 : </th>
         <td><input type="text" name="engname" required pattern="^[a-zA-Z]*$" placeholder="영문만 입력" /></td>
         
         <th bgcolor="D5D5D5">희망직무</th>
         <td width="90"><input type="text" name="part" value="프로그램 개발" readonly /></td>
         <th colspan="2" width="80" bgcolor="D5D5D5">추천인</th>
         <td width="90"><input type="text" name="proposer" placeholder="선택입력" /></td>
      </tr>
   </table><br/>

   <table border="1" width="1000">
      <tr>
         <th width="85" height="50" bgcolor="D5D5D5">생년월일</th>
         
         <td colspan="7"><input type="text" size="100" name="birth" /></td>
         
         <td rowspan="4" width="100" height="50"><input type="file" name="imgurl" /></td>
      </tr>
      <tr>
         <th width="85" height="50" bgcolor="D5D5D5">현주소</th>
         <td colspan="7"><input type="text" size="100" name="address" /></td>
      </tr>
      <tr>
         <th width="85" height="50" bgcolor="D5D5D5">E-mail</th>
         <td colspan="7"><input type="text" size="100" name="email" /></td>
      </tr>
      <tr>
         <th width="85" height="50" bgcolor="D5D5D5">연락처</th>
         <td colspan="7"><input type="text" size="100" name="phone" /></td>
      </tr>
   </table>
     <br>
   
      <table border="1" width="1000">
      <tr>
		<th rowspan="8" width="85" height="70" bgcolor="D5D5D5">학력사항</th><!-- rowspan 열 3줄 -->
	</tr>
	
	<tr>
		<th colspan="1" width="20">고교</th>
		<td width="90"><input type="text" name="highin"/>부터
		<input type="text" name="highout"/></th>까지
		<td width="90"colspan="4"><input type="text" name="highname"/></td>
	<tr>
		<th colspan="1">전문</th>
		<td width="90"><input type="text" name="colin"/>부터
		<input type="text" name="colout"/></th>까지
		<th colspan="1" >부전공/복수전공</th>
		<td width="90"colspan="4"><input type="text" name="colsub"/></td>
	</tr>
		<tr>
		<th colspan="1">대학</th>
		<td width="90"><input type="text" name="highin"/>부터
		<input type="text" name="highin"/></th>까지
		<th colspan="1">부전공/복수전공</th>
		<td width="90"colspan="4"><input type="text" name="highin"/></td>
	</tr>
		<tr>
		<th colspan="1">석사</th>
		<td width="90"><input type="text" name="highin"/>부터
		<input type="text" name="highin"/></th>까지
		<td width="90"colspan="4"><input type="text" name="highin"/></td>
	</tr>
		<tr>
		<th colspan="1">박사</th>
		<td width="90"><input type="text" name="highin"/>부터
		<input type="text" name="highin"/></th>까지
		<td width="90" colspan="4"><input type="text" name="highin"/></td>
	</tr>
		<tr>
		<th colspan="1"bgcolor="D5D5D5"></th>
		<th colspan="1"></th>
		<th colspan="1">세부전공</th>
		<td width="90"><input type="text" name="highin"/>
		<th colspan="1">논문제목</th>
		<td width="90"><input type="text" name="highin"/>
	</tr>
	<tr>
		<th colspan="1"bgcolor="D5D5D5"></th>
		<th colspan="1">휴학기간/사유</th>
		<td width="90" colspan="4"><input type="text" name="highin"/>
		
	</tr>
	</table>
	
    <br>
     <table border="1" width="1000">
      <tr>
		<th rowspan="6" width="85" height="70" bgcolor="D5D5D5">외국어</th><!-- rowspan 열 3줄 -->
	</tr>
	
	<th colspan="1"bgcolor="D5D5D5">외국어명</th>
	<th colspan="1"bgcolor="D5D5D5">시 험 명</th>
	<th colspan="1"bgcolor="D5D5D5">응시년월</th>
	<th colspan="1"bgcolor="D5D5D5">점수</th>
	<th colspan="1"bgcolor="D5D5D5" rowspan="3">컴퓨터사용능력(사용가능 언어 및 TOOL)</th>
	<td width="90"><input type="text" name="highin"></td>
	<tr>
	<td width="90"><input type="text" name="highin"/>
	<td width="90"><input type="text" name="highin"/>
	<td width="90"><input type="text" name="highin"/>
	<td width="90"><input type="text" name="highin"/>
	</tr>
	<tr>
	<td width="90"><input type="text" name="highin"/>
	<td width="90"><input type="text" name="highin"/>
	<td width="90"><input type="text" name="highin"/>
	<td width="90"><input type="text" name="highin"/>
	</tr>
    </table>     
	    <br>
     <table border="1" width="1000">
      <tr>
		<th rowspan="6" width="85" height="70" bgcolor="D5D5D5">자격증</th><!-- rowspan 열 3줄 -->
	</tr>
	<th colspan="1"bgcolor="D5D5D5">자격 및 면허</th>
	<th colspan="1"bgcolor="D5D5D5">발 행 처</th>
	<th colspan="1"bgcolor="D5D5D5">취 득 일</th>
	<th colspan="1"bgcolor="D5D5D5">자격면허번호</th>
	<tr>
	<td width="90"><input type="text" name="highin"/>
	<td width="90"><input type="text" name="highin"/>
	<td width="90"><input type="text" name="highin"/>
	<td width="90"><input type="text" name="highin"/>
	</tr>
     </table>
         <br>
     <table border="1" width="1000">
      <tr>
		<th rowspan="6" width="85" height="70" bgcolor="D5D5D5">연수/교육</th><!-- rowspan 열 3줄 -->
	</tr>
	<th colspan="1"bgcolor="D5D5D5">기간</th>
	<th colspan="1"bgcolor="D5D5D5">기관/소재지</th>
	<th colspan="1"bgcolor="D5D5D5">내용</th>
	<th colspan="1"bgcolor="D5D5D5">사유</th>
	<tr>
	<td width="90"><input type="text" name="highin"/>
	<td width="90"><input type="text" name="highin"/>
	<td width="90"><input type="text" name="highin"/>
	<td width="90"><input type="text" name="highin"/>
	</tr>
     </table>
      
	<h1 align="right"><input type="submit" value="다음" a href="#" onclick="location.href='page3.jsp'"/>
	
	


</body>
</html>