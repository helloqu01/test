package com.ohj.news_ex;

public class InfoClass {
	 int a=10;
	String s="info";
	public InfoClass(){//Ŭ���� �����ڰ� ���� �� �⺻ �����ڸ� ������ش�.
		
	}
	
	
	public InfoClass(int n,String s){
		this.a=n;
		this.s=s;
	}
	
	
	//�������̵�:��ӵ� �ڽ��� ���θ� ��ġ�� ��
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
