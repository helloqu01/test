package com.ohj.books;

public class MainClass {
	
		public static void main(String[] args) {
		
		//메인에서 각 객체를 생성하고, 각 메소드에 데이터를 전달
		
		DataClass dc =new DataClass();
		
		MethodClass mc= new MethodClass();
		//데이터 연산 결과 확인 메소드 호출
		
		mc.dataTest(dc.books);
		//책제목을 포함하는 검색 메서드 호출
		
		String searchTitle = "HTML";
		
		mc.searchTitle(dc.books, searchTitle);
		
		//책제목을 포함하는 검색 메서드 호출
		
		String searchAuthor = "제프";
		
		mc.searchTitle(dc.books, searchAuthor);
		
		//책제목을 포함하는 검색 메서드 호출
		
		String searchPress = "미디어";
		
		mc.searchTitle(dc.books, searchPress);

////////////////////////////////////////////////////////////////

/*//출판사 검색 결과값 책 제목과 저자

String searchPress="한빛미디어";

for(int a=0;a<dc.books.size();a++){

if(dc.books.get(a).press.contains(searchPress)){

System.out.println("책제목 :"+dc.books.get(a).title+"/저자 :"+dc.books.get(a).author);

}

}*/

//////////////////////////////////////////////////////////////

/*//저자 검색 : String의 contains"검색어")

String searchAuthor="고경희";

for(int a=0;a<dc.books.size();a++){

if(dc.books.get(a).author.contains(searchAuthor)){

System.out.println(dc.books.get(a).title);

}

}*/

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
////////////////////////////////////////////////////////////1번

// 데이터 연산 결과 확인 코드

/*for(int i=0;i<dc.books.size();i++){

System.out.print(dc.books.get(i).price+"원\t");

System.out.print(dc.books.get(i).dc+"%\t");

System.out.println(dc.books.get(i).dc_price+"원");

}*/

		}
}