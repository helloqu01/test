package com.ohj.news;

public class MainClass {
public static void main(String[] args) {

InfoClass ic1= new InfoClass();

InfoClass ic2= new InfoClass();
System.out.println(ic1.toString());

//com.ohj.news_ex.InfoClass@15db9742
System.out.println(ic2.toString());

//com.ohj.news_ex.InfoClass@6d06d69c 참조값 알아내기
System.out.println(ic1.getClass());

//class com.ohj.news_ex.InfoClass 어떤 객체의 타입을 알고 싶다.
}
}