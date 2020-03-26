package com.freeflux.tv;

public class Account {//토탈모금액을 저장 할 곳 1번
	private int total = 0;
	
	public Account(){	
	}//기본 생성자
	
	public void deposit(){
		total = total+1000;
	}
	
	public int getTotal(){
		return total;
	}
	
}
