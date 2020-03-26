package com.ohj.news;

public class InfoClass {
int a=10;

String s="info";

public InfoClass(){//클래스 생성자가 없을 때 기본 생성자를 만들어준다.
}

public InfoClass(int n,String s){

this.a=n;

this.s=s;

}

//오버라이드:상속된 자식이 내부를 고치는 것

public String toString(){

return a+" "+s;

}

public static void test(int n){

int c =a;

}

public static void t(){

int b =a;

}

}

