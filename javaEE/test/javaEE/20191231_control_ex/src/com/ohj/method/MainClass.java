package com.ohj.method;

public class MainClass {

	public static void main(String[] args) {
		//�纻�� �����ϴ� ���� ��ü��� �Ѵ�.ũ�� ��Ʋ�� �����̴�.
		
		BookClass b1 = new BookClass();//�纻
		b1.author = "������";//������ �־���
		b1.price = 200;//������ �־��� ����
		b1.realPrice(120);//���ΰ��� �־��� �����Ǹ��Ѱ�
		
		System.out.println("�������� ���� �ǸŰ��� :"+ b1.r_price);//���� �ǸŰ��� ��Ÿ��
		
		BookClass b2 = new BookClass();//�纻2
		b2.author = "ȫ�浿";
		b2.price = 150;
		b2.realPrice(100);
		
		System.out.println("ȫ�浿�� ���� �ǸŰ��� :"+ b1.r_price);
		
		BookClass[] books= new BookClass[2]; //�迭 �ȿ� 2���� �ִ�.������ �������� �迭�ϴ� ��� �� ���� �����
		books[0]=b1;
		books[1]=b2;
		System.out.println(books[0].author);
		System.out.println(books[1].author);
		
		BookClass[] books2={b1,b2}; //������ ���ÿ� ���� ����� �迭�ϴ� ��� �� �ٷ� �����ؼ� ��������
		System.out.println(books2[0].author);
		System.out.println(books2[1].author);
		
		System.out.println(books[0].author+"||"+books2[0].author);
	}

}
