package com.ohj.array;

public class InfoClass {//클래스 선언 부에는 private를 절대 붙이지 않는다
	private String no;//private 내 클래스 내부에서만 사용하겠다.외부에서는 변수 값을 사용 할 수 없다.
	int age = 0;
	
	private InfoClass(){//이곳에 private를 적용하면 main에 객체를 생성하지 못한다.
	
	}
	
	public InfoClass(String string) {
		this.no=string;
		this.ageOperator();
		
	}
	private void ageOperator(){
		//ic.no = "881234-4345678";
		String[] s=this.no.split("-");// -를 기준으로 둘로 쪼갬
		//s[0] :"881234"//s[1]"2345678"이 들어가게 된다.
		
		String year=s[0].substring(0,2);//뽑아내려는 숫자 s[0]에는 0=8/1=8로 순서대로 들어가 있다. 시작 인덱스번호를 가져온다.(0부터 2번까지의 숫자를 가져온다)
		System.out.println(year);
		
		String genderNo=s[1].substring(0,1);
		System.out.println(genderNo);
	
	if(genderNo.equals("1")||genderNo.equals("2")){// 젠더가 1이거나 2이면
		this. age = 2020-(1900+Integer.parseInt(year));
		System.out.println(this.age);//문자열을 숫자로 바꾸는 메소드
		
	}else{
		this. age = 2000+Integer.parseInt(year);//주민등록번호를 나이를 구하는 법
		if(age>2020){
			System.out.println("연도를 잘못 입력하셨습니다.");
		}else{
			this.age=2020-this.age;
		}
		
	}
	
	}
}
