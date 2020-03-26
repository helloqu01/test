package com.ohj.books;

import java.util.ArrayList;

public class MainClass {
	
		public static void main(String[] args) {
		
		//메소드에 키워드만 전달
		
		//DataClass dc =new DataClass();
		
		MethodClass mc= new MethodClass();
		//데이터 연산 결과 확인 메소드 호출
		
		mc.dataTest();
		
		//책 제목을 포함하는 검색 메서드 호출
		
		String searchTitle = "HTML";
		
		mc.searchTitle(searchTitle);
		
		//저자를 검색하여 책 제목을 출력하는 메소드 
		
		String searchAuthor = "제프";
		
		mc.searchTitle(searchAuthor);//결과값 보임
		
		/////////////////////////////////////////////////////////////////////
		
		System.out.println("---------------------------------------");
		
		/*//방법 3번 결과 출력
		
		String searchPress = "미디어";
		
		ArrayList<ResultClass> result=mc.searchPress(searchPress);
		
		//검색 결과 출력
		
		for(int i=0;i<result.size();i++){
		
		System.out.print("제목 " +result.get(i).title+"\t");
		
		System.out.println("저자"+result.get(i).author);
		
		}*/
		//////////////////////////////////////////////
		
		System.out.println("---------------------------------------");
		/*//방법 2번 결과 출력
		
		String searchPress = "미디어";
		
		​
		
		ArrayList<BookClass> result=mc.searchPress(searchPress);
		
		//검색 결과 출력
		
		for(int i=0;i<result.size();i++){
		
		System.out.print("제목 " +result.get(i).title+"\t");
		
		System.out.println("저자"+result.get(i).author);
		
		}*/
		
		System.out.println("---------------------------------------");
		/*//출판사를 검색하여 책 제목과 저자를 출력하는 메소드
		
		String searchPress = "미디어";
		
		//방법 1번 결과 출력
		
		ArrayList<String> result=mc.searchPress(searchPress);
		
		//검색 결과 출력
		
		for(int i=0;i<result.size();i++){
		
		String[] s=result.get(i).split(",");
		
		System.out.print("제목 " +s[0]+"\t");
		
		System.out.println("저자"+s[1]);
		
		}*/
		
		System.out.println("---------------------------------------");
		
		////////////////////////////////////////////////
		
		/*//출판사 검색 결과값 책 제목과 저자
		
		String searchPress="한빛미디어";
		
		for(int a=0;a<dc.books.size();a++){
		
		if(dc.books.get(a).press.contains(searchPress)){
		
		System.out.println("책제목 :"+dc.books.get(a).title+"/저자 :"+dc.books.get(a).author);
		
		}
		
		}*/
		
		System.out.println("---------------------------------------");
		
		//////////////////////////////////////////////////////////////
		
		/*//저자 검색 : String의 contains"검색어")
		
		String searchAuthor="고경희";
		
		for(int a=0;a<dc.books.size();a++){
		
		if(dc.books.get(a).author.contains(searchAuthor)){
		
		System.out.println(dc.books.get(a).title);
		
		}
		
		}*/
		
		System.out.println("---------------------------------------");
		
		//////////////////////////////////////////////////////////2번
		
		/*//책 제목 검색 : String의 contains("검색어")
		
		//책 제목: dc.Books.get(0).title
		
		//첵제목을 포함하는 검색 : dc.books.get(0).title.contains("검색어")
		
		String searchTitle="HTML";
		
		for(int i=0;i<dc.books.size();i++){
		
		if(dc.books.get(i).title.contains(searchTitle)){
		
		System.out.println(dc.books.get(i).title);
		
		}
		
		}*/
		
		System.out.println("---------------------------------------");
		
		////////////////////////////////////////////////////////////1번
		
		// 데이터 연산 결과 확인 코드
		
		/*for(int i=0;i<dc.books.size();i++){
		
		System.out.print(dc.books.get(i).price+"원\t");
		
		System.out.print(dc.books.get(i).dc+"%\t");
		
		System.out.println(dc.books.get(i).dc_price+"원");
		
		}*/
		
		}

}
