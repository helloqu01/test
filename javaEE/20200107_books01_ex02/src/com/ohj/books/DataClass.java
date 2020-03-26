package com.ohj.books;

import java.util.ArrayList;

public class DataClass {

	//저장될 객체 타입을 예약 : <BookClass>
	ArrayList<BookClass> books=new ArrayList<BookClass>();

	public DataClass() {
		books.add(new BookClass("DO it HTML 5 CSS 3", "고경희", "이지스퍼블리싱", 16800, "06365234.jpg", 20));		
		books.add(new BookClass("모던 웹 디자인을 위한 HTML5 CSS3 입문", "윤인성", "한빛미디어", 30000, "06992821.jpg", 20));		
		books.add(new BookClass("HTML5 CSS3와 함께하는 드림위버 CS6 무작정 따라하기", "고경희", "길벗", 24000, "07056591.jpg", 10));		
		books.add(new BookClass("Head First HTML5 Programming", "엘리자베스 롭슨, 에릭 프리먼", "한빛미디어", 34000, "06950729.jpg", 20));		
		books.add(new BookClass("만들면서 배우는 HTML5 CSS3 jQuery", "야무", "한빛미디어", 25000, "06837215.jpg", 23));		
		books.add(new BookClass("HTML5 CSS3", "양용석", "로드북", 25000, "06741081.jpg", 15));		
		books.add(new BookClass("HTML5 CSS3 WebGL로 재미있게 배우는 HTML5 게임 프로그래밍", "제이콥 세이드린", "제이펍", 30000, "06980245.jpg", 10));		
		books.add(new BookClass("HTML5 캔버스 완벽 가이드", "데이비드 기어리", "위키북스", 40000, "07085557.jpg", 10));		
		books.add(new BookClass("올인원웹실무가이드 HTML 5 CSS 3", "나인환 김은영 외 1명", "제우미디어", 28000, "06630397.jpg", 16));	
		books.add(new BookClass("HTML5와 CSS3로 작성하는 반응형 웹 디자인", "벤 프레인", "에이콘출판", 30000, "06983417.jpg", 20));	
		books.add(new BookClass("HTML5가 보이는 그림책","ANK Co Ltd", "성안당", 31500, "06992821.jpg", 21));	
		books.add(new BookClass("HTML5 Canvas", "스티브 펄튼, 제프 펄튼", "한빛미디어", 38000, "06806523.jpg", 20));	
		books.add(new BookClass("세르게이의 HTML5 CSS3 퀵 레퍼런스", "세르게이 마브로디", "제이펍", 20000, "07114432.jpg", 10));	
		books.add(new BookClass("이제 실전이다 HTML5 CSS3 사이트제작의 모든것", "양용석", "로드북", 25000, "06880352.jpg", 10));	
		books.add(new BookClass("iOS와 안드로이드를 위한 HTML5", "로빈 닉슨", "한빛미디어", 33000, "07041351.jpg", 10));
		
		}

}
