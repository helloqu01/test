package com.ohj.classes;

public class MainClass {

	public static void main(String[] args) {
	//�� ����� ȸ�翡 �ٹ��ϸ鼭 ���� �� �ִ� �� ������ ���
	//�� ���� �ѿ���=����*��������/�� ��Ȱ�� = ��*12*��������
		
		TestClass tc = new TestClass();//��ü ����
		int[] total = tc.total();
		
		for(int i =0; i<total.length; i++){
			System.out.println(tc.ic[i].name+"����� �Ѽ���:"+total[i]);
		}
	}

}
  