package com.ohj.method;
// ���� �̸��� �ٲٷ��� ���� �������� ������ f2�� ������ �ȴ�. �׷� �ش�� ������ ��� �ٲ��.
public class BookClass {
	
	String author = "";//����
	int price = 0;     //����
	int r_price=0;     //�ǸŰ�
	
	public BookClass(){//�⺻ ������
		
	}
	
	public void realPrice(int d){//�ǸŰ� ���� �޼���
		r_price =  price-d;//���� ���� (������)
		
	}
}

// �纻�� ���� �� new�� �տ� �ٿ� ����Ѵ�