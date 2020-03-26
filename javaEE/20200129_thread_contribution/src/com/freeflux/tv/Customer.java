package com.freeflux.tv;

public class Customer extends Thread{//기부자 스레드 상속 //2번 
	
	Account same_acnt;
	
	public  Customer (Account a,String s){
		same_acnt =a;
		setName(s);
	}
	
	
	public void run(){//실제 스레드  (Thread 로부터 상속받은 메소드 )
		for(int i=0;i<200;i++){	//내부 실행 내용 재정의 
			System.out.println(getName()+":"+i+"��°");//0~199번째 까지 출력 
			same_acnt.deposit();
			
			if(same_acnt.getTotal()>500000){
				break;
			}
		}//for ed
	}//run ed
	
}
