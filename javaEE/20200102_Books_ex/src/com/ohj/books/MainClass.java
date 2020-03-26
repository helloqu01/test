package com.ohj.books;

public class MainClass {
	public static void main(String[] args) {

		DateClass dc = new DateClass();//데이타클래스에서 잘 입력되었는지 확인2번째

		//dc는 두 책의 정보를 보유(ic배열)
		//int sum = dc.ic[0].price+dc.ic[1].price;//두 책의 가격을 합하기

		int sum=0;//전체 책 값구하기
		for(int i=0;i<dc.ic.length;i++){
			sum= sum+dc.ic[i].price;
		}

		System.out.println(sum);

		for(int i=0; i<dc.ic.length;i++){// 전체 도서 정보중에서 출판사가 길벗인 책의 제목을 출력
			if(dc.ic[i].press.equals("길벗")){//길벗이라는 글자가 정확히 포함된 자료만 가지고 온다.
				System.out.println(dc.ic[i].title);
			}
		}

		for(int i=0; i<dc.ic.length;i++){// 전체 도서 정보중에서 출판사가 길벗인 책의 제목을 출력
			if(dc.ic[i].press.contains("길벗")){//길벗이라는 글자를 포함하는 자료를 가지고 온다.(contains)
				System.out.println(dc.ic[i].title);
			}
		}
	}
}