package com.freeflux.tv;

public class Account {//토탈 모금액 저장 할 곳 1번 
	private int total = 0;
	
	public Account(){	
	}//기본생성자 
	
	public void deposit(){
		total = total+1000;
	}
	
	public int getTotal(){
		return total;
	}
	
}
