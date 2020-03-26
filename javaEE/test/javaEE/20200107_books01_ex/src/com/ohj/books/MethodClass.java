package com.ohj.books;

import java.util.ArrayList;

public class MethodClass {
	public MethodClass() {//기본 생성자
		
	}
	//데이터 연산 결과 확인 메소드
	public void dataTest (ArrayList<BookClass>books){
		for(int i=0;i<books.size();i++){
			System.out.print(books.get(i).price+"원\t");
			System.out.print(books.get(i).dc+"%\t");
			System.out.println(books.get(i).dc_price+"원");
		}
	}
		
		//첵제목을 포함하는 검색하는 메소드
		public void searchTitle(ArrayList<BookClass>books,String keyword){
			for(int i=0;i<books.size();i++){
				if(books.get(i).title.contains(keyword)){
				System.out.println(books.get(i).title);
				}
		}
	}
		//저자를 검색하여 책 제목을 출력하는 메소드 
		public void searchAuthor(ArrayList<BookClass>books,String keyword){
			for(int a=0;a<books.size();a++){
				if(books.get(a).author.contains(keyword)){
					System.out.println(books.get(a).title);
				}
		}
	}
		//출판사를 검색하여 책 제목과 저자를 출력하는 메소드
		public void searchPress(ArrayList<BookClass>books,String keyword){
			for(int a=0;a<books.size();a++){
				if(books.get(a).press.contains(keyword)){
					System.out.println("책제목 :"+books.get(a).title+"/저자 :"+books.get(a).author);
					}
			}
		}
}
