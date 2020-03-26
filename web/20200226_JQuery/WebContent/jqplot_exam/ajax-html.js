$(document).ready( function() {  //문서 준비가 끝나면
	$('#btnLoad3').click( function() {//그버튼을 준비하고 클릭하게되면
		$('#listArea').empty();					//내부를 비워라
		$('#listArea').load('ajax-listinfo.html li', function(htmlData){	
			//listArea내부에 ajax-listinfo.html의 li태그들을 읽어들여라 문서 끝까지 <ul>사이로 넣어라
			$('#listArea').listview('refresh');	
			//새로고침을해라
		});			
	});
});
