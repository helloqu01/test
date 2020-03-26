package com.ohj.test;

public class Test2Class {

	/* 1. 1개 이상의 클래스 
	   2. 1개의 파일 내부에는 반드시 메인(main)이 있어야한다.(클래스는 1개 이상이 가능하지만 메인은 1개여야한다. 안드로이가 구분을 못함으로)*/
      public static void main(String[] args) {
		
		int number;
		String text;
		boolean bool;
		
		number=100;
		text = number+"adc";
		System.out.println(text);
		System.out.println("text");

		int[] nums= new int[5];// int가 5개 들어갈 수 있는 공간을 새롭게 만드는 것
		
		nums[2]=3;
		nums[0]=1;
		nums[3]=number;
		
		String[] strs= new String[5];//String가 5개 들어 갈 수 있 공간을 새롭게 만드는 것 new를 붙여야함
		
		strs[0]="10";
		
		int init = 0;//값을 정해줘야함
		int sum=init+100;
		
		
		
	
	}
	
}
