package com.freeflux.tv;

public class Account {//��Ż��ݾ��� ���� �� �� 1��
	private int total = 0;
	
	public Account(){	
	}//�⺻ ������
	
	public void deposit(){
		total = total+1000;
	}
	
	public int getTotal(){
		return total;
	}
	
}
