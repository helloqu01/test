package com.test.encode;

import java.io.UnsupportedEncodingException;

public class ChangeEncoding {
	public ChangeEncoding() {

	}
	
	//java -> mySQL에 저장
	public static String toLatin(String str){//인코딩 값이 Latin으로 되어 있다.
		
		try {
			byte[] b = str.getBytes();//String이 가지고 있는 getBytes메소드 //문자열을 1바이트 단위로 쪼개는 메소드
			return new String(b,"ISO-8859-1");//ISO-8859-1는 기본 세팅 되어있다.//String 객체 생성
			//문자열은 바이트 배열의 값을 ->ISO-8859-1으로 인코드
			
		} catch (UnsupportedEncodingException uee) {
			System.out.println("인코딩 ERR : toLatin()"+uee.getMessage());
			return null;
		}
	}
	
	//mySQL-> java로 읽기
	public static String toUnicode(String str){
	
		try {
			byte[] b = str.getBytes("ISO-8859-1");
			//MYSQL문자열을 1바이트 단위로 쪼개는데, 단, ISO-8859-1로 쪼갬
			return new String(b);//새로운 String 객체 생성(바이트 배열의 값으로) 
		} catch (UnsupportedEncodingException uee) {
			System.out.println("인코딩 ERR : Unicode()"+uee.getMessage());
			return null;
		}
		
	}
}
