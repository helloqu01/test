package com.freeflux.str;

public class StringClass {

	public StringClass() {
	}
	
	// �տ��� 20�� ���ڸ� ����
	public static String before20Char(String contents){
		if(contents.length()<=20){
			return contents;
		}
		//String title = content.substring(0,20);
		return contents.substring(0,20)+"...";
		
	}

}
