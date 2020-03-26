package com.freeflux.etc;

public class TestClass implements interA,interB,interC{ //implements(구현받는다) 인터페이스를 사용 하려면 내가 선언한 것을 재정의하도록 하라(add)

//interA,interB,interC 다중 상속이 가능 하다.

public TestClass(){

}
@Override//부모로 부터 받은 변수를 자식이 재정의하는 것

public void sum1() {

//a=100; 상수는 한번 선언한 값을 변경 할 수 없다.

int aa= a;//인터페이스a의 값은 추출 가능하다.

int c= interA.a;//클래스명으로 직접 접근 가능

}

@Override

public void sum2(int n1, int n2) {

}

@Override

public int sum3(int n1, int n2) {

return 0;

}
@Override 

public double avg(int t, float f) {

return 0;

}
@Override

public void prn() {

}

}