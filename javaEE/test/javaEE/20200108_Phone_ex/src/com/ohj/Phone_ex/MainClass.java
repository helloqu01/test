package com.ohj.Phone_ex;

public class MainClass {

	public static void main(String[] args) {
		// 문제. 아래 데이터를 이용하여 이마트 총판매 값을 구하세요
		DataClass dc = new DataClass();
		InfoClass ic= new InfoClass();
	
		String searchName="갤럭시노트8";
		ic.searchName(dc.Info, searchName);
		
		System.out.println();//노트8가격
		System.out.println();//v50가격
		System.out.println();//아이폰 8 가격
		System.out.println();//총가격
		

	}

}
