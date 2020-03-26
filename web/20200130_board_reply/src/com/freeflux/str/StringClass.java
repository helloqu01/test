package com.freeflux.str;

public class StringClass {

	public StringClass() {
	}
	
	// 앞에서 20개 글자만 추출
	public static String before20Char(String contents){
		if(contents.length()<=20){
			return contents;
		}
		//String title = content.substring(0,20);
		return contents.substring(0,20)+"...";
		
	}

}
