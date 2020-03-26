package com.ohj.phone;

import com.ohj.extend.comm.SKTClass;

public class MainClass {
	int a =10;
	static int b = 100;
	public static void main(String[] args) {
		System.out.println(b);
		test();
	}
	public static void test(){
		System.out.println(b);
	}
		/////////////////////////////////////////////////////////////////////////////////////
		
		
		/*getter/setter SKTClass m1=new SKTClass();
		m1.phonrNumber="123-4567-8912";
		m1.tworld("123-4567-8912");
		
		SKTClass m2=new SKTClass("123-4567-8912");
		m2.tworld("123-4567-7897");//확인 됐는지 안됐는지 확인하기
		System.out.println(m2.version);//내폰의 버전 확인하기
		
		String number = m2.getPhoneNumber();//getter 매소드
		System.out.println(number);
		m1.call(number);*/
		

		/////////////////////////////////////////////////
		/*테스트 코드 SamsungClass g10_128=new SamsungClass(128); 
		g10_128.call("010-1234-5678");
		g10_128.sms("010-1234-5678","테스트문자");
		g10_128.Samsung();
		
		SamsungClass g_note=new SamsungClass(512); 
		g_note.call("011-1234-5678");
		g_note.sms("011-1234-5678","테스트문자2");
		g_note.Samsung();
		
		LgClass g8=new LgClass();
		g8.call("011-1234-5678");
		g8.sms("011-1234-5678","테스트문자1lg");

		LgClass v50 = new LgClass(512);
		v50.call("011-1234-5678");
		v50.sms("011-1234-5678","테스트문자2lg");
		System.out.println(v50.ram);
		System.out.println(v50.version);*/


}
