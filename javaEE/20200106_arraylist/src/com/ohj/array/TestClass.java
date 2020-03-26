package com.ohj.array;


public class TestClass {

	int a =10;
	final float PI=3.14f;// 최종값이라고 선언했기 때문에 밑에서 바꿀 수 없다.(final)
	public TestClass(){
		this.a=100;
		//this.PI=3.13195f 상수 값은 변경불가
		float f2 = this.PI;// 꺼내 쓸 수는 있다
	}
}