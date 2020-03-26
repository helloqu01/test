package com.ohj.classes;

public class InfoClass {

	// 사람의 정보를 보관하는 클래스
	String name; 
	int age; 
	int salary;
	String local;
	int years;
	String worker;
	
	// 동일한 이름의 생성자, 메서드를 만들어 사용라는 기법
	//=> '오버로딩'라 부른다.
	// *주의 할 사항 : 메서드의 매개변수 타입이 달라야 하고, 또는 매개변수의 갯수가 달라야한다.

	public InfoClass(){//기본 생성자
	}

	//오버로딩 생성자

	// "A",28 , , "KR" , 1 , "정규"

	public InfoClass(String n, int a,String lo,int y, String j){//값이 들어 오는 순서대로 만들어줘야함. 정보내용을 입력.
		name = n;
		age = a;
		local=lo;
		years = y;
		worker = j;//각각의 변수에 대입 될 수 있도록 등록한다.
		salaryOperator();//연봉 계산하는 메소드 호출
	}

	//연봉 계산하는 메서드
	public void salaryOperator(){ 
		if(worker.equals("정규")){
			salary=250*13;//정규직일 경우
		}else{
			salary =200*13; //비정규직일 경우
		}
	}
}
