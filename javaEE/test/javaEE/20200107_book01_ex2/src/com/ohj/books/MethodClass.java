package com.ohj.books;

import java.util.ArrayList;

public class MethodClass {
	private DataClass dc =new DataClass();
	public MethodClass() {//�⺻ ������
		
	}
	//������ ���� ��� Ȯ�� �޼ҵ�
	public void dataTest (){
		ArrayList<BookClass> books=this.dc.books;//����
		
		for(int i=0;i<dc.books.size();i++){
			System.out.print(dc.books.get(i).price+"��\t");
			System.out.print(dc.books.get(i).dc+"%\t");
			System.out.println(dc.books.get(i).dc_price+"��");
		}
	}
		
		//ý������ �����ϴ� �˻��ϴ� �޼ҵ�
		public void searchTitle(String keyword){
			ArrayList<BookClass> books=this.dc.books;//����
			for(int i=0;i<books.size();i++){
				if(books.get(i).title.contains(keyword)){
				System.out.println(books.get(i).title);
				}
		}
	}
		//���ڸ� �˻��Ͽ� å ������ ����ϴ� �޼ҵ� 
		public void searchAuthor(String keyword){
			ArrayList<BookClass> books=this.dc.books;//����
			for(int a=0;a<books.size();a++){
				if(books.get(a).author.contains(keyword)){
					System.out.println(books.get(a).title);
				}
		}
	}
		//���ǻ縦 �˻��Ͽ� å ����� ���ڸ� ����ϴ� �޼ҵ�
		public void searchPress(String keyword){
			ArrayList<BookClass> books=this.dc.books;//����
			for(int a=0;a<books.size();a++){
				if(books.get(a).press.contains(keyword)){
					System.out.println("å���� :"+books.get(a).title+"/���� :"+books.get(a).author);
					}
		}
	}
}
