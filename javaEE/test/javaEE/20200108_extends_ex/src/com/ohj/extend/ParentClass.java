package com.ohj.extend;

public class ParentClass {
	
	private int n=10;// 부모클래스,본인클래스 내부에서만 사용 가능한 변수
	boolean b = false;//같은 패키지 내부에서만 사용 가능한 변수
	public char c='A';//어디서든 접근 사용 가능한 변수
	
	protected String s ="test";//패키지가 달라도 자식 클래스에게는 허용
	
	public ParentClass() {
	
			System.out.println("PatrentClass()생성자 내부");
	}
	public ParentClass(int n) {
		this.n=n;
		System.out.println(n);
	}
	
	public void ParentMethod() {//어디서든 호출가능
		
			System.out.println("PatrentMethod()생성자 내부");
	}
	void defaultClass(){//같은패키지내에서만 호출가능
		
		System.out.println("defaultClass()생성자 내부");
	}
	private void privateMethod() {//부모 클래스 내부에서만 호출 가능
		
			System.out.println("privateMethod()생성자 내부");
	}

}
