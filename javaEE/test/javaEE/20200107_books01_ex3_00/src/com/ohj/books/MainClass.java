package com.ohj.books;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		//�޼ҵ忡 Ű���常 ����
		//DataClass dc =new DataClass();
		MethodClass mc= new MethodClass();
		
		//������ ���� ��� Ȯ�� �޼ҵ� ȣ��
		mc.dataTest();
		
		//å ������ �����ϴ� �˻� �޼��� ȣ��
		String searchTitle = "HTML";
		mc.searchTitle(searchTitle);
		
		//���ڸ� �˻��Ͽ� å ������ ����ϴ� �޼ҵ� 
		String searchAuthor = "����";
		mc.searchTitle(searchAuthor);//����� ����
		
		/////////////////////////////////////////////////////////////////////
		System.out.println("---------------------------------------");
		
		/*//��� 3�� ��� ���
		String searchPress = "�̵��";
		ArrayList<ResultClass> result=mc.searchPress(searchPress);
		//�˻� ��� ���
		for(int i=0;i<result.size();i++){
			System.out.print("���� " +result.get(i).title+"\t");
			System.out.println("����"+result.get(i).author);
		}*/

		//////////////////////////////////////////////
		System.out.println("---------------------------------------");
				
				/*//��� 2�� ��� ���
				String searchPress = "�̵��";
				
				ArrayList<BookClass> result=mc.searchPress(searchPress);
				//�˻� ��� ���
				for(int i=0;i<result.size();i++){
					System.out.print("���� " +result.get(i).title+"\t");
					System.out.println("����"+result.get(i).author);
				}*/
		System.out.println("---------------------------------------");
		
		/*//���ǻ縦 �˻��Ͽ� å ����� ���ڸ� ����ϴ� �޼ҵ�
		String searchPress = "�̵��";
		//��� 1�� ��� ���
		ArrayList<String> result=mc.searchPress(searchPress);
		//�˻� ��� ���
		for(int i=0;i<result.size();i++){
			String[] s=result.get(i).split(",");
			System.out.print("���� " +s[0]+"\t");
			System.out.println("����"+s[1]);
		}*/
		System.out.println("---------------------------------------");
		////////////////////////////////////////////////
		/*//���ǻ� �˻� ����� å ����� ����
		String searchPress="�Ѻ��̵��";
		for(int a=0;a<dc.books.size();a++){
			if(dc.books.get(a).press.contains(searchPress)){
				System.out.println("å���� :"+dc.books.get(a).title+"/���� :"+dc.books.get(a).author);
			}
		}*/
		System.out.println("---------------------------------------");
		//////////////////////////////////////////////////////////////
		/*//���� �˻� : String�� contains"�˻���")
		String searchAuthor="�����";
		for(int a=0;a<dc.books.size();a++){
			if(dc.books.get(a).author.contains(searchAuthor)){
				System.out.println(dc.books.get(a).title);
			}
		}*/
		System.out.println("---------------------------------------");
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
		System.out.println("---------------------------------------");
		////////////////////////////////////////////////////////////1��
		// ������ ���� ��� Ȯ�� �ڵ�
		/*for(int i=0;i<dc.books.size();i++){
			System.out.print(dc.books.get(i).price+"��\t");
			System.out.print(dc.books.get(i).dc+"%\t");
			System.out.println(dc.books.get(i).dc_price+"��");
		}*/
	}

}
