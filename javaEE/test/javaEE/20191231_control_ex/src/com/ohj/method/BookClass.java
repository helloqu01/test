package com.ohj.method;
// 파일 이름을 바꾸려면 파일 아이콘을 눌러서 f2를 누르면 된다. 그럼 해당된 내용이 모두 바뀐다.
public class BookClass {
	
	String author = "";//저자
	int price = 0;     //정가
	int r_price=0;     //판매가
	
	public BookClass(){//기본 생성자
		
	}
	
	public void realPrice(int d){//판매가 연산 메서드
		r_price =  price-d;//할인 가격 (유동성)
		
	}
}

// 사본을 만들 때 new를 앞에 붙여 사용한다