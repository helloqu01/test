package com.ohj.books;

public class MainClass {

	public static void main(String[] args) {
		//���ο��� �� ��ü�� �����ϰ�, �� �޼ҵ忡 �����͸� ����
		DataClass dc =new DataClass();
		MethodClass mc= new MethodClass();
		
		//������ ���� ��� Ȯ�� �޼ҵ� ȣ��
		mc.dataTest(dc.books);
		
		//å������ �����ϴ� �˻� �޼��� ȣ��
		String searchTitle = "HTML";
		mc.searchTitle(dc.books, searchTitle);
		
		//å������ �����ϴ� �˻� �޼��� ȣ��
		String searchAuthor = "����";
		mc.searchTitle(dc.books, searchAuthor);
		
		//å������ �����ϴ� �˻� �޼��� ȣ��
		String searchPress = "�̵��";
		mc.searchTitle(dc.books, searchPress);
		
		
		////////////////////////////////////////////////////////////////
		/*//���ǻ� �˻� ����� å ����� ����
		String searchPress="�Ѻ��̵��";
		for(int a=0;a<dc.books.size();a++){
			if(dc.books.get(a).press.contains(searchPress)){
				System.out.println("å���� :"+dc.books.get(a).title+"/���� :"+dc.books.get(a).author);
			}
		}*/
		//////////////////////////////////////////////////////////////
		/*//���� �˻� : String�� contains"�˻���")
		String searchAuthor="�����";
		for(int a=0;a<dc.books.size();a++){
			if(dc.books.get(a).author.contains(searchAuthor)){
				System.out.println(dc.books.get(a).title);
			}
		}*/
		//////////////////////////////////////////////////////////2��
		/*//å ���� �˻� : String�� contains("�˻���")
		//å ����: dc.Books.get(0).title
		//ý������ �����ϴ� �˻� : dc.books.get(0).title.contains("�˻���")
		String searchTitle="HTML";
		for(int i=0;i<dc.books.size();i++){
			if(dc.books.get(i).title.contains(searchTitle)){
			System.out.println(dc.books.get(i).title);
			}
		}*/
	
		////////////////////////////////////////////////////////////1��
		// ������ ���� ��� Ȯ�� �ڵ�
		/*for(int i=0;i<dc.books.size();i++){
			System.out.print(dc.books.get(i).price+"��\t");
			System.out.print(dc.books.get(i).dc+"%\t");
			System.out.println(dc.books.get(i).dc_price+"��");
		}*/
	}

}
