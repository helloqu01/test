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
		
		//��� 3: ���ο� Ŭ������ �����Ϸ� ���
		//ResultClass.java
		//public class ResultClass{
		//String title,author;
		//public ResultClass(){}
		//public ResultClass(String t,String a({
		//this.title=t;
		//this.author=a;
		//}
		//}
		//�޼ҵ��� return Ÿ�� : ArrayList<ResultClass>�� ����
		//�żҵ� ����
		//ArrayList<ResultClass> r= new ArrayList<ResultClass>();
		//for()������if()����
		//r.add(new BookClass(books.get(i).title, books.get(i).author));
		//for ������
		//return r;
		public ArrayList<ResultClass> searchPress(String keyword){	
			ArrayList<BookClass> books=this.dc.books;//�˻��� ��ü ������
			
			ArrayList<ResultClass> r = new ArrayList<ResultClass>();//�˻���� ����
			
			for(int i=0;i<books.size();i++){
				if(books.get(i).press.contains(keyword)){
					r.add(new ResultClass(books.get(i).title,books.get(i).author));
				}
			}
			return r;
		}	

		/////////////////////////////////////////////////////////////////////////////
		
		/*//��� 2��
		
		//ArrayList�� ��� : �˻������ ���� �ٸ��� ������...
		//��� 1 : �� ���� ���ڿ��� ��ǥ�� �����Ͽ� �ϳ��� ���ڿ��� �����
		//ArrayList<String> r= new ArrayList<String>();
		//r.add (books.get(i).title+","+books.get(i).author);
		//return r;
		public ArrayList<BookClass> searchPress(String keyword){	
			ArrayList<BookClass> books=this.dc.books;//�˻��� ��ü ������
			ArrayList<BookClass> r = new ArrayList<BookClass>();//�˻���� ����
			
			for(int i=0;i<books.size();i++){
				if(books.get(i).press.contains(keyword)){
					r.add(new BookClass(books.get(i).title,books.get(i).author));
				}
			}
			return r;
		}	*/
		//////////////////////////////////////////////////////////////////////
		/*//���ǻ縦 �˻��Ͽ� å ����� ���ڸ� ����ϴ� �޼ҵ�
		//��� 1��
		//ArrayList�� ��� : �˻������ ���� �ٸ��� ������...
				//��� 1 : �� ���� ���ڿ��� ��ǥ�� �����Ͽ� �ϳ��� ���ڿ��� �����
				//ArrayList<String> r= new ArrayList<String>();
				//r.add (books.get(i).title+","+books.get(i).author);
				//return r;
		public ArrayList<String> searchPress(String keyword){	
			ArrayList<BookClass> books=this.dc.books;//�˻��� ��ü ������
			ArrayList<String> r = new ArrayList<String>();//�˻���� ����
			for(int i=0;i<books.size();i++){
				if(books.get(i).press.contains(keyword)){
					r.add(books.get(i).title+","+books.get(i).author);
					}
			}
			return r;
		}*/
		/////////////////////////////////////////////////////////////////////
		//ArrayList�� ��� : �˻������ ���� �ٸ��� ������...
		//��� 2 : �� ���� ��� ���� �ϳ��� ��ü�� ���� �� arratList�� �߰�(���� Ŭ���� Ȱ��)
		//ArrayList<BookClass> r= new ArrayList<BookClass>();
		
		//r.add(new BookClass(books.get(i).title, books.get(i).author));
		
		//public Class BookClass{
		//public BookClass(String t, String a){// ��� 2�� ���� �߰� ������
		//	 this.title=t;
		//	this.authir=a;
		//	}
		//}
		
		
		
		
		
}




