package com.ohj.extend;

//new ParentClass();

public class ChildClass extends ParentClass{//extends : 물려받는 것

public ChildClass() {

//super();//부모 클래스를 호출한다. 무조건 앞에다가 적어줘야한다.

super(250);

System.out.println("ChildClass 생성자 내부");

}

}