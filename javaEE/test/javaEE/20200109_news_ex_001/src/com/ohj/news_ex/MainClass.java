package com.ohj.news_ex;

public class MainClass {

	public static void main(String[] args) {
		InfoClass ic1= new InfoClass();
		InfoClass ic2= new InfoClass();
		
		System.out.println(ic1.toString());
		//com.ohj.news_ex.InfoClass@15db9742
		
		System.out.println(ic2.toString());
		//com.ohj.news_ex.InfoClass@6d06d69c ������ �˾Ƴ���
		
		
		System.out.println(ic1.getClass());
		//class com.ohj.news_ex.InfoClass � ��ü�� Ÿ���� �˰� �ʹ�.
		
	}

}
