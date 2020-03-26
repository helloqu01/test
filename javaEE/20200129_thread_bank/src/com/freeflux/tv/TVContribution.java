package com.freeflux.tv;

public class TVContribution {
	
	public static void main(String[] args) {//3번 
		
		Account same_account = new Account();

		
		Customer donator1 = new	Customer(same_account,"1번  ARS");
		Customer donator2 = new	Customer(same_account,"2번  ARS");
		Customer donator3 = new	Customer(same_account,"3번  ARS");
		Customer donator4 = new	Customer(same_account,"4번  ARS");
		Customer donator5 = new	Customer(same_account,"5번  ARS");
		
		
		donator1.start();
		donator2.start();
		donator3.start();
		donator4.start();
		donator5.start();
		
		try {
			donator1.join();
			donator2.join();
			donator3.join();
			donator4.join();
			donator5.join();
			
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("성금 총액은 :"+same_account.getTotal());
		
		
	}
}
