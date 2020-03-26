package com.ohj.emp;

//public 접근제한자
//default : 접근제한자
public class InfoClass {

	//멤버변수, 속성, 전역변수
	int empNo; // 사원 식별번호
	String eName; // 사원이름
	String job; //직책
	String hireData; //입사일
	int sale; // 급여
	int commision;//성과급
	int deptNo;//부서식별번호
	
	public InfoClass(){ //기본생성자
	}

					//1001, "송민호", "사원", "2007-03-01", 300, 0, 20
	//외부로부터 데이터를 전달받는 생성자(식별번호, 사원이름, 직책, 입사일, 급여, 성과급, 부서식별번호의 변수를 잡아줌
	public InfoClass(int e,String en,String j,String h,int s,int c,int d){

		this.empNo=e; //this는 클래스 자기 자신을 말한다.
		this.eName=en;
		this.job=j;
		this.hireData=h;
		this.sale=s;
		this.commision=c;
		this.deptNo=d;
	}
}