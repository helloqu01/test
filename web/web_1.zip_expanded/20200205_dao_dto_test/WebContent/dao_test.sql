use dao_db;
create table dao_test(
	num int not null auto_increment, /*private int num=0;*/
	id varchar(10) not null,		/*private String id="";*/
	pw varchar(10) not null,		/*private String pw="";*/
	email varchar(20),				/*private String email="";*/
	phone char(13),					/*private String phone="";*/
	PRIMARY key(num)
);

/*dto 
 * 1.멤버 변수는 프라이빗
 * 2.테이블의 필드명과 동일한 변수명을 선언할 것
 * 3.프라이빗 변수의 겟터와 셋터가 반드시 존재 할 것
 * 
 * Table의 Field명과 동일한 이름을 갖는 변수
 * DTO(데이터를 가지고 다니는 객체)
 * 	VO(Value Object)객체
 * 	Java Beans 객체
 * 	MVC 패턴(Model 객체)
 * 데이터베이스 관련 Frame work : myBatis
 * 코드(개발) 관련 Frame work : String
 * 전자정부 표준 2.0 ~ 현재까지 표준 Frame work :  myBatis+ String
 * 과거 정부표준 Frame work : Hibanate(DB관련)+String(개발관련)
 * 
 */






use dao_db;
/*아래 필드명을 이용하여 BoardModel 클래스 작성
 *작성시 변수 추가 : pageNum ="1"/searchType ="" / searchText=""/listCount=10
 * */
create table board1(
	num int not null auto_increment, 	/*번호*/
	subject varchar(250) not null,		/*제목*/
	writer varchar(50) not null,		/*작성자*/
	contents text						/*내용*/
	hit int(11) default null,			/*조회수*/
	reg_date datetime default null,		/*등록일시*/
	mod_date datetime default null,		/*수정일시*/
	ip varchar(30) not null,			/*접속ip*/
	good int(11) default null,			/*좋아요*/
	PRIMARY key(num)
);
