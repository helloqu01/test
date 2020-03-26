$(document).ready( function() {  
	$('#btnLoad2').click( function() {		
		$.getJSON('ajax-stuinfo.json', function(jsonData) { 
			//getJSON(함수)를 통해 ajax-stuinfo.json를 찾아와라 /ajax-stuinfo.json는  배열형태로 값을 넣었다
			//jsonData가 값을 전달 받는다.
			
			var tagList = "";
			//값의 로드가 끝나게되면 자동호출 되는 함수
			$.each(jsonData.stuinfo, function() {
				//jsonData(매개변수).stuinfo(ajax-stuinfo.json의 데이터)
				tagList += "<li>" + this.schoolyear + "</li>";
				//값을 읽어 올 때마다. <li></li>로 묶어놓아라
			});
			$('#listArea').empty();		
			//기존 값을 제거하자 empty
			$('#listArea').append(tagList);
			//값을 넣어주자 append
			$('#listArea').listview('refresh');
			//값을 보여주게 새로고침하도락하자 refresh
		});
	});
});	
