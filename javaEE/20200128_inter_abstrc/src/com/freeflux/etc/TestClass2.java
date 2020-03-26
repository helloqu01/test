package com.freeflux.etc;

public class TestClass2 implements interD{
	//interD�� interA,B,C의 변수를 상속 받았기 때문에 모든 변수를 같이 add한다. 
	public  TestClass2() {

	}

	@Override
	public void sum1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum2(int a1, int a2) {
		//int a1, int a2 매개변수명은 변경 할 수 있으나 타입명을 변경하면 오류가 뜬다. 
		// TODO Auto-generated method stub
		
	}

	@Override
	public int sum3(int n1, int n2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double avg(int t, float f) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void prn() {
		// TODO Auto-generated method stub
		
	}
}
