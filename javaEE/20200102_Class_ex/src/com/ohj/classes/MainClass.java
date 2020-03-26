package com.ohj.classes;

public class MainClass {
	public static void main(String[] args) {
		//각 사람이 회사에 근무하면서 받을 수 있는 총 수입을 계산
		//총 수입 총연봉=연봉*재직연수/총 생활비 = 월*12*재직연수
		TestClass tc = new TestClass();//객체 선언

		int[] total = tc.total();
	
		for(int i =0; i<total.length; i++){
			System.out.println(tc.ic[i].name+"사원의 총수입:"+total[i]);
		}
	}
}