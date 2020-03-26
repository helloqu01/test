package com;

public class TestClass2 {
	public static void main (String[]args){

	/*1.1개 이상의 클래스 
	 * 2. 1개의 파일 내부에는 반드시 메인 (main)이 있어야 한다
	 * 클래스는 1개 이상이 가능하지만 메인은 1개 여야 한다.*/
		int number;
		String text;
		boolean bool;
		
		number =100;
		text = number+"abc";
		System.out.println(text);
		System.out.println("text");
		
		//int가 5개 들어갈 수 있는 공간을 새롭게 만드는 것 
		int [] nums = new int[5];
		nums[2]=3;
		nums[0]=1;
		nums[3]=number; //100
		
		System.out.println(nums[2]);//3
		System.out.println(nums[3]);//100
		
		//String가 5개 들어 갈 수 있는 공간을 새롭게 만드는 것 new를 붙여줘야 한다.
		String[] strs = new String[5];
		strs[0]="10";
		
		//값을 정해줘야함
		int init = 0;
		int sum = init+100;
		System.out.println(sum);//100
		
	
	}
}
