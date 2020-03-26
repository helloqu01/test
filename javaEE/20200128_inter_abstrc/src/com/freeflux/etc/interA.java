package com.freeflux.etc;
public interface interA {

//인터페이스는 절대 생성자를 보유할 수 없다.

//public interA(){} -> 오류발생

int a=10;//(상수 선언가능)static final int a= 10; 이라는 뜻(컴파일)

//char c;(변수 선언불가능)

// public void sum(){} - > 메소드 선언 불가능

// 아래의 것은 추상 매서드, 선언 가능

public void sum1(); // 매서드명(반환타입, 매개변수 포함)까지만 가능하다

public void sum2(int n1, int n2); 

public int sum3(int n1, int n2); 

}


