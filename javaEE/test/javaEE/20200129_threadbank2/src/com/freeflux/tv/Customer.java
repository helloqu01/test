package com.freeflux.tv;

public class Customer extends Thread{//����� ������ ��� //2��
	
	Account same_acnt;
	
	public  Customer (Account a,String s){
		same_acnt =a;
		setName(s);
	}
	
	
	public void run(){// ���� ������ (Thread�κ��� ��� ���� �żҵ�)
		for(int i=0;i<200;i++){	//���� ���� ���� ������
			System.out.println(getName()+":"+i+"��°");//0~199���� ���
			same_acnt.deposit();
			
			if(same_acnt.getTotal()>500000){
				break;
			}
		}//for ed
	}//run ed
	
}
