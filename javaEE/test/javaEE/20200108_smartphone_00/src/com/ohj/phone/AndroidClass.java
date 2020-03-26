package com.ohj.phone;

public class AndroidClass {
	
	public String version ="10";
	
	public AndroidClass(){
		
	}
	
	public void call(String n){//전화 걸기 메소드
		System.out.println(n+"전화 걸기");
		
	}
	public void sms(String n,String m){//문자보내기
		System.out.println(n+"에게"+m+"문자보내기");
	}
}
