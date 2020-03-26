package com.ohj.static_ex;
public class MainClass {
public static void main(String[] args) {

//1번 아래 데이터를 이용하여 이마트 총판매 값을 구하세요

System.out.println(DataClass.str.size());

DataClass dc = new DataClass();// 생성자 안에 있는 것을 가져올 때 반드시 객체가 선언 되야 한다.

System.out.println(DataClass.str.size());

OperClass.sum();//static이 붙어있는 것(생성자) 객체가 선언 되지않아도 가져올 수 있다.

System.out.println(OperClass.PI);//static이 붙어있는 것(생성자) 객체가 선언 되지않아도 가져올 수 있다.

double PI =Math.PI;

System.out.println(Math.floor(PI));// 소수점 뒷자리 잘라버리기

System.out.println(Math.ceil(PI));// 소수점 무조건 올림

System.out.println(Math.round(PI));// 소수점 뒷자리 반올림

//System.out.println(Math.PI);//Math안에 들어가 있는 함수

///////////////////////////////////////////////////////////////////////////////////////

double d = 45.3566;//이 와 같은 값이 있다.6을 반올림하고싶다 소수점을 옮겻다가 다시 복귀시키기

d=d*100;//소수점을 뒤로 옮기기

System.out.println(d);

d=Math.round(d);//소수점 반올림하기

System.out.println(d);

d=d/100;//소수점 다시 복귀시키기

System.out.println(d);
//////////////////////////////////////////////////////////////////////////////////

/*System.out.println(TestClass.n);// n변수의 객체가 만들어지지 않아도 실행이 가능하다.

​

TestClass t1= new TestClass();//객체 생성

t1.n=55;

t1.num=2222;

​

TestClass t2= new TestClass();

System.out.println(t2.n);

System.out.println(t2.num);

​

TestClass t3= new TestClass();

System.out.println(t3.n);*/

}

}