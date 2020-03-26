package com.ohj.books;

public class InfoClass {//책제목,가격,저자,출판사 정보 4가지 정보

	String title; //제목
	int price; //가격
	String outhor; //저자
	String press; //출판사

	public InfoClass(){//기본 생성자
	}

	//외부로부터 값을 전달받는 생성자
	//("이것이 자바자"(String),30000(int),"신용권"(String),"한빛미디어"(String));//ic에 책 정보들 저장

		public InfoClass(String t,int p, String a,String pr){
			title=t;
			price=p;
			outhor=a;
			press=pr;
			//System.out.println("InfoClass 생성자 작업 완료");//확인코드
		}
}//InfoClass End