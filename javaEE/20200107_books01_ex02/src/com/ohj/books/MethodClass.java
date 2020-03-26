package com.ohj.books;

import java.util.ArrayList;

public class MethodClass {
   private DataClass dc=new DataClass(); // 이 내부에서만 쓸 수 있는 전용 데이터로 만들기 위해 private을 작성한다. 
   
   public MethodClass() { // 기본 생성자
   }
   
   //데이터 연산 결과 확인 Method
   public void dataTest(){    //(ArrayList<BookClass> books) 매개변수를 제거해준다
      ArrayList<BookClass> books  =dc.books; //method가 호출될 때 만들어지고, 종료될때 사라지는 변수 --> 이렇게 해주면 this.dc.books.get(i).price 이런식으로 길게 작성하지 않아도 된다.
                                             //private DataClass dc=new DataClass();를 삭제해주고 =dc.books; 에서 =new DataClass().books;로 변경(이러면 변수2개에서 하나로 줄어들게됨
      
      for(int i=0;i<books.size();i++){ // books.size(); 에 dc.를 붙여준다.(dc라는 객체는 현재 class가 가지고있는 변수 => 빨리 찾기 위해 this. 붙인다.)
         System.out.print(books.get(i).price+"원\t");   
         System.out.print(books.get(i).dc+"%\t"); 
         System.out.println(books.get(i).dc_price+"원"); 
      }
   }
   
   //1.책 제목을 포함하는 검색 method
   public void searchTitle(String keyword){ //(ArrayList<BookClass> books) 매개변수를 제거해준다
      ArrayList<BookClass> books  = this.dc.books;//method가 호출될 때 만들어지고, 종료될때 사라지는 변수 --> 이렇게 해주면 this.dc.books.get(i).price 이런식으로 길게 작성하지 않아도 된다.
      for(int i=0;i<books.size();i++){
         if(books.get(i).title.contains(keyword)){//검색어를 받게 될 변수를 기입
            System.out.println(keyword+"키워드가 포함된 책 제목 : "+books.get(i).title);
         }
      }
   }
   
   //2.저자 검색하여 저자가 작성한 책 제목 검색
   public void searchAuthor(String keyword){//(ArrayList<BookClass> books) 매개변수를 제거해준다
      ArrayList<BookClass> books  = this.dc.books;//method가 호출될 때 만들어지고, 종료될때 사라지는 변수 --> 이렇게 해주면 this.dc.books.get(i).price 이런식으로 길게 작성하지 않아도 된다.
      for(int i=0;i<books.size();i++){
         if(books.get(i).author.contains(keyword)){
            System.out.println(keyword+"이(가) 저자인 책 제목 : "+books.get(i).title);
         }
      }
   }

   //3.출판사 검색(책 제목과, 저자명 출력)
   
   /*
   //▼방법 1.
   public ArrayList<String> searchPress(String keyword){//(ArrayList<BookClass> books) 매개변수를 제거해준다
      ArrayList<BookClass> books  = this.dc.books; //검색 할 전체 데이터
      ArrayList<String> r=new ArrayList<String>(); //검색한 결과 저장
      for(int i=0;i<books.size();i++){
      if(books.get(i).press.contains(keyword)){
         r.add(books.get(i).title+","+books.get(i).author);
      }
   }
      return r;
   }*/
   
   
   /*
   //▼방법 2.
   public ArrayList<BookClass> searchPress(String keyword){
      ArrayList<BookClass> books  = this.dc.books; //검색 할 전체 데이터
      ArrayList<BookClass> r=new ArrayList<BookClass>(); //검색한 결과 저장

      for(int i=0;i<books.size();i++){
      if(books.get(i).press.contains(keyword)){
         r.add(new BookClass(books.get(i).title, books.get(i).author));
      }
   }
      return r;
   }*/
   
   
   
   //▼방법 3.
   public ArrayList<ResultClass> searchPress(String keyword){
      ArrayList<BookClass> books  = this.dc.books; //검색 할 전체 데이터
      ArrayList<ResultClass> r=new ArrayList<ResultClass>(); //검색한 결과 저장

      for(int i=0;i<books.size();i++){
      if(books.get(i).press.contains(keyword)){
         r.add(new ResultClass(books.get(i).title, books.get(i).author));
      }
   }
      return r;
   }
   
   
   
         /*출판사를 검색하여 책 제목과 저자를 반환하는 메서드
         1, 2, 3 모두 ArrayList를 사용 : 검색 결과가 각기 다르기 때문
         
         ●●방법 1 : 두 개의 문자열을 ','로 구분하여 하나의 문자열로 만드는 방법
         
            ArrayList<String> r=new ArrayList<String>(); // <어떤 타입의혹은 어디의 데이터가 들어갈건지 선정>();
            r.add(books.get(i).title+","+books.get(i).author); //r에다가 title과 author를 대입시켜준다. 이렇','로 묶어주면 하나의 문자열이 만들어 진다.
            return r; //r값을 반환한다.
         
               MainClass에서
            String searchPress="길벗";
            ArrayList<String> result=mc.searchPress(searchPress);
               처럼 선언해준다. 
            for(int i=0;i<result.size();i++){
               String[] s=result.get(i).split(",");
               System.out.println("제목 : "+s[0]);
               System.out.println("저자 : "+s[1]);
            }
         //위 for문으로 결과값 출력.
         
         ●●방법 2 : 두 개의 결과값을 하나의 객체에 저장 후 ArrayList에 추가(기존 클래스 활용)
         ArrayList<BookClass> r=new ArrayList<BookClass>();
         r.add(new BookClass(books.get(i).title, books.get(i).author)); //BookClass 객체가 생성될 때 첫번째 값과 두번째값을 전달
               
               ====>BookClass 에 
               public BookClass(String t, String a){    // 방법2를 위한 추가 생성자(MethodClass의 books.get(i).title가 t로 books.get(i).author 가 a로 들어가게 된다.)
                  this.title=t;
                  this.author=a;
               }
               를 작성해준다.
               
         public class BookClass{
            public BookClass(String t, String a){  // 방법2를 위한 추가 생성자(books.get(i).title가 t로 books.get(i).author 가 a로 들어가게 된다.)
               this.title=t;
               this.author=a;
            }
         }
          이 후, MainClass 에서
             ArrayList<BookClass> result=mc.searchPress(searchPress);      //검색결과 출력
      for(int i=0;i<result.size();i++){
         System.out.println((i+1+".")+"제목 : "+result.get(i).title);
         System.out.println((i+1+".")+"저자 : "+result.get(i).author);
      }
      위와 같이 작성해주면 동일값 출력 가능
      
         ●●방법 3 : 새로운 클래스를 설계하여 사용
         ResultClass.java //ResultClass 새로 생성
         public class ResultClass{
             String title, author;
             public ResultClass(){ //기본 생성자
          
          }
             public ResultClass(String t, String a){
              this.title=t;
              this.author=a;
          }
         }
         
         //>>method의 return 타입 : ArrayList<ResultClass>로 변경
         //>>method 내부
         public ArrayList<ResultClass> searchPress(String keyword){
         ArrayList<BookClass> books  = this.dc.books; //검색 할 전체 데이터
         ArrayList<ResultClass> r=new ArrayList<ResultClass>(); //검색한 결과 저장

         for(int i=0;i<books.size();i++){
         if(books.get(i).press.contains(keyword)){
         r.add(new ResultClass(books.get(i).title, books.get(i).author));
         }
      }
         return r;
      }
         
         위와같이 하고난 후
         
         MainClass에서
         ArrayList<ResultClass> result=mc.searchPress(searchPress);      //검색결과 출력
         for(int i=0;i<result.size();i++){
            System.out.println((i+1+".")+"제목 : "+result.get(i).title);
            System.out.println((i+1+".")+"저자 : "+result.get(i).author);
            }   
         }
         처럼 작성해주면 동일한 결과값 출력 가능.
         
         */
      

}