$(document).ready( function() {  
	$('#btnLoad1').click( function() {		
		$.ajax({
			url: 'ajax-stuinfo.xml',
			type: 'get',
			dataType: 'xml',
			timeout: 10000, //응답기다리는 것(10초)
			success: function(xmlData) { //xmlData 매개변수명 (ajax-stuinfo.xml) 값을 받음
				var tagList = "";
				$(xmlData).find('student').each(function(){
					tagList += "<li>" + $(this).find('gradepoint').text() + "</li>";
					//li태그에다가 this(학생)의 (학점)의 글씨를 꺼낸다.tagList에 값이 누적된다.
				});
				$('#listArea').empty();
				//id가 listArea라는 애를 찾는다.(ajax-data.html) 찾아서 기존값 비워라(empty)
				$('#listArea').append(tagList);
				//tagList태그들을 다시 넣어라 /append는 값을 뿌리라는 뜻
				$('#listArea').listview('refresh');
				//<ul>이 listArea를 갖고 있다.<ul> 안에 tagList가 들어있다.listview를 이용해서 refresh(새로고침)를 시켜라
			},
			error: function() {
				$("#listArea").html("<p>Error!!</p>");
			}
		});
	});
});


