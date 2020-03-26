package com.ohj.books;

public class BookClass {
	
	String title,author,press,picture;
	int price,dc_price,dc;
	
	
	public BookClass() {
		
	}
	// 방법 2번을 위한 추가 생성자
	
			public BookClass(String t, String a){// 방법 2를 위한 추가 생성자
				 this.title=t;
				this.author=a;
				}
		
			
	
					//"iOS와 안드로이드를 위한 HTML5",          "로빈 닉슨",  "한빛미디어",     33000, "07041351.jpg", 10
	public BookClass(String t,String a,String p,int pr,String pic,int d) {
		this.author =a;
		this.dc=d;
		this.dc_price=dc;
		this.picture=pic;
		this.press=p;
		this.price=pr;
		this.title=t;
		this.dc_price=this.dcOperator(d);//반환된 할인가격을 대입
	}
	
	private int dcOperator(int dp){//할인률 계산 10,000원에서 10%할인하면 -> 10,000*(1-0.1)=9,000원
		double d= dp*0.01;
		return (int) (this.price*(1-d));
	}

}
