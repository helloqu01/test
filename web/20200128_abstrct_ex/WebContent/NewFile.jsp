<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>naver</title>
</head>
<body>
	<fieldset style = "width:350px">
	<legend>네이버 카페</legend>
	<label>게시판  </label>
	<input type = "text" name = "boardlist" list = "boardlist" />
	<datalist id = "boardlist">
	<option value = "웹 프로그래밍"> 웹 프로그래밍<option/>
	<option value = "it 자료"> it 자료<option/>
	<option value = "강의 자료"> 강의 자료<option/>
	</datalist>
	
	<input type = "text" name = "ho" list = "ho"/>
	<datalist id = "ho">
	<option value = "말머리 선택"> 말머리 선택<option/>
	</datalist>
	
	<input type = "checkbox" value = "1" name="checkbox1" >공지로 등록
	<br/><br/>
	<label>제목  </label>
	<input type = "text" size = "145px" name="title"  required="required"><br/><br/>

	<label>파일 첨부 : </label>
	<input type = "file" name = "FILE"/>사진
	<input type = "file" name = "FILE"/>동영상
	<input type = "file" name = "FILE"/>지도
	<br/><br/>
	<input type = "file" name = "FILE"/>일정
	<input type = "file" name = "FILE"/>링크
	<input type = "file" name = "FILE"/>파일
	<br/><br/>
	<input type = "file" name = "FILE"/>투표
	<br/><br/>
	<label>정보 첨부 : </label>
	<input type = "file" name = "FILE"/>책DB
	<input type = "file" name = "FILE"/>영화DB
	<input type = "file" name = "FILE"/>드라마DB
	<br/><br/>
	<input type = "file" name = "FILE"/>음악DB
	<input type = "file" name = "FILE"/>상품DB
	<input type = "file" name = "FILE"/>인물DB
	<br/><br/>
	<input type = "file" name = "FILE"/>날씨DB
	<input type = "file" name = "FILE"/>지식백과DB
	<br/><br/>
	
	
	
	
	
	<label>기본쓰기  </label>
	<br/><br/>

	<textarea rows = "10px" cols="150px" name ="contents"required="required"></textarea>
	<br/><br/>
	<label>태그달기  </label>
	<input type = "text" name="title"  required="required">
 	<input type = "submit" value="나의 태그보기"/><br/><br/>
 	<select name ="tag" multiple>
	<option value = "애플">애플<option/>
	<option value = "구글">구글<option/>
	<option value = "어도비">어도비<option/>
	<option value = "개발자">개발자<option/>
	<option value = "무엇이 달라졌나">무엇이 달라졌나<option/>
	<option value = "안드로이드">안드로이드<option/>
	</select>
	<br/><br/>
 	
 	
 	
 	
 	

	<label>공개 설정  </label>
	<input type = "radio" value = "allopen" name="allopen" >전체 공개	
	<input type = "radio" value = "menopen" checked name="menopen">멤버공개
	<br/><br/>
	<input type = "radio" value = "menopen" checked name="menopen">검색. 네이버 서비스 공개 허용 (?)<br/><br/>
	<br/><br/>
	
	<fieldset style = "width:150px">
	<label>기능 설정  </label>
	
	<label>댓글 설정  </label>
	<input type = "radio" value = "allow" name="allow" >허용	
	<input type = "radio" value = "notallow" checked name="notallow">비허용
	<br/><br/>
	<label>블로그/카페공유  </label>
	<input type = "radio" value = "allow" name="allow" >허용	
	<input type = "radio" value = "notallow" checked name="notallow">비허용
	<br/><br/>
	<label>외부공유  </label>
	<input type = "radio" value = "allow" name="allow" >허용	
	<input type = "radio" value = "notallow" checked name="notallow">비허용
	<br/><br/>
	<label>마우스 오른쪽클릭  </label>
	<input type = "radio" value = "allow" name="allow" >허용	
	<input type = "radio" value = "notallow" checked name="notallow">비허용
	<br/><br/>
	<label>동영상공유  </label>
	<input type = "radio" value = "allow" name="allow" >허용	
	<input type = "radio" value = "notallow" checked name="notallow">비허용
	<br/><br/>
	<label>자동출처 사용설정  </label>
	<input type = "radio" value = "allow" name="allow" >허용	
	<input type = "radio" value = "notallow" checked name="notallow">비허용
	<br/><br/>
	<label>CCL 사용설정  </label>
	<input type = "radio" value = "allow" name="allow" >허용	
	<input type = "radio" value = "notallow" checked name="notallow">비허용
	<br/><br/>
	</fieldset>
	
	<br/><br/>
	
	
	
	
 <input type = "submit" value="임시저장"/>
 <input type = "submit" value="미리보기"/>
 <input type = "submit" value="확인"/> <br/><br/>
	





</body>
</html>