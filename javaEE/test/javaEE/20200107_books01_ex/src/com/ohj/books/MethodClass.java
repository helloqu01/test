package com.ohj.books;

import java.util.ArrayList;

public class MethodClass {
	public MethodClass() {//�⺻ ������
		
	}
	//������ ���� ��� Ȯ�� �޼ҵ�
	public void dataTest (ArrayList<BookClass>books){
		for(int i=0;i<books.size();i++){
			System.out.print(books.get(i).price+"��\t");
			System.out.print(books.get(i).dc+"%\t");
			System.out.println(books.get(i).dc_price+"��");
		}
	}
		
		//ý������ �����ϴ� �˻��ϴ� �޼ҵ�
		public void searchTitle(ArrayList<BookClass>books,String keyword){
			for(int i=0;i<books.size();i++){
				if(books.get(i).title.contains(keyword)){
				System.out.println(books.get(i).title);
				}
		}
	}
		//���ڸ� �˻��Ͽ� å ������ ����ϴ� �޼ҵ� 
		public void searchAuthor(ArrayList<BookClass>books,String keyword){
			for(int a=0;a<books.size();a++){
				if(books.get(a).author.contains(keyword)){
					System.out.println(books.get(a).title);
				}
		}
	}
		//���ǻ縦 �˻��Ͽ� å ����� ���ڸ� ����ϴ� �޼ҵ�
		public void searchPress(ArrayList<BookClass>books,String keyword){
			for(int a=0;a<books.size();a++){
				if(books.get(a).press.contains(keyword)){
					System.out.println("å���� :"+books.get(a).title+"/���� :"+books.get(a).author);
					}
			}
		}
}
