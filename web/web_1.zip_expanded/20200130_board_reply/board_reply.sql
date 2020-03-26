
	CREATE TABLE board( /*게시판 테이블 기본구조*/
	idx int(11) NOT NULL auto_increment,/*글 번호(자동증가)*/
	/*PW int(50) NOT NULL,*/
	name varchar(10) NOT NULL,/*글쓴이*/
	title varchar(50) NOT NULL,/*글제목*/
	contents text NOT NULL,/*글내용*/
	email varchar(20) NOT NULL,/*글쓴이 메일*/
	/*mkate datetime NOT NULL,/*처음 저장 날짜삽입시*/*/
	/*modate datetime NOT NULL,/*수정후 저장 날짜삽입시*/*/
	hit int(10) not null default 0, /*조회수*/
	depth int(11) NOT NULL default 0,/*답글여부*/
	uid int(11) NOT NULL,/*답글정렬*/
	PRIMARY KEY(idx) /*중복 값 허용하지 않음*/
	);
	
	/*mysql함수
	 * count() 총합 구하는 것
	 * now()시간 구하는 것
	 * sum() 합구하는 것
	 * avg() 곱 구하는 것
	 * max() 최대값 구하는것
	 * min() 최소값 구하는 것
	 * MAX(uid)+1 uid의 최대값에 1을 더하는 것
	 * insert into board (name,title) values(?,?) values=> 값이 들어가는 것
	 * 자바에서 ResultSet이 select 값을 받는다 그래서 rs.next()를 써준다.
	 * 거기서 꺼내려면  00= rs.getInt() 를 써줌*/
	
	/*새글
	 * 1. select
	 * 2.insert
	 *  	답글 insect 기존 uid 
	 * 		1. update
	 * 		depth 새글은 0 답글은 1*/
	새로운 글쓰기 query
	SELECT MAX(uid)+1 FROM board;
	insert into board (name,title,message,email,check,hit,pass,depth,uid)
				values('name','title','message','email','now()',hit,'pass',depth,uid);
	
	글수정 query
	select pass from board where idx = 'no';
	update board set name = 'name',title ='title',message='message',email='email' mkdata = 'mkdata' where no='no';
	
	글삭제 query
	select pass from board where idx ='no';
	delete from board where idx ='no';
	
	답글쓰기 query
	depth=depth+1; /*새 글의 depth를 전달 받음*/
	update board set uit+1 where uid >=$uid;
	insert into board (name,title,message,email,check,hit,pass,depth,uid)
				values('name','title','message','email','now()',hit,'pass',depth,uid);
	
	