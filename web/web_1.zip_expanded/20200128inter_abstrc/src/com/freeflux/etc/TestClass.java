package com.freeflux.etc;

public class TestClass implements interA,interB,interC{ //implements(�����޴´�) �������̽��� ��� �Ϸ��� ���� ������ ���� �������ϵ��� �϶�(add)
												//interA,interB,interC ���� ����� ���� �ϴ�.
	public  TestClass(){
	}

	@Override//�θ�� ���� ���� ������ �ڽ��� �������ϴ� ��
	public void sum1() {
		//a=100; ����� �ѹ� ������ ���� ���� �� �� ����.
		int aa= a;//�������̽�a�� ���� ���� �����ϴ�.
		int c= interA.a;//Ŭ���������� ���� ���� ����
	}

	@Override
	public void sum2(int n1, int n2) {
		
	}

	@Override
	public int sum3(int n1, int n2) {
		return 0;
	}

	
	@Override	
	public double avg(int t, float f) {
		return 0;
	}

	@Override
	public void prn() {
		
	}
	
}
