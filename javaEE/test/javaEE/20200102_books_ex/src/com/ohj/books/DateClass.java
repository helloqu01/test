package com.ohj.books;

public class DateClass {//InfoClass 객체들 저장
	
	InfoClass[] ic= new InfoClass[6];// 책 정보들 저장
	
	public DateClass (){
		ic[0]=new InfoClass("이것이 자바자",30000,"신용권","한빛미디어");//ic에 책 정보들 저장
		//System.out.println(ic[0].press);//데이타클래스에서 잘 입력되었는지 확인1번쨰//확인코드
		
		
		ic[1] = new InfoClass("파이선",25000,"홍길동","길벗");
		//System.out.println(ic[1].press);////확인코드
		
		
		ic[2] = new InfoClass("정보처리기사",35000,"기사","길벗");
		ic[3] = new InfoClass("HTML",15000,"꾸미기","한빛출판사");
		ic[4] = new InfoClass("JSP&Serlet",23000,"열혈","길벗출판사");
		ic[5] = new InfoClass("오라클",21000,"oracle","A길벗출판사");
		//System.out.println("DataClass 생성자 작업 완료");//확인코드
		
	}

}
