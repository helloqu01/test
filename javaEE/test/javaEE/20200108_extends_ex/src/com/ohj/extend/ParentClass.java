package com.ohj.extend;

public class ParentClass {
	
	private int n=10;// �θ�Ŭ����,����Ŭ���� ���ο����� ��� ������ ����
	boolean b = false;//���� ��Ű�� ���ο����� ��� ������ ����
	public char c='A';//��𼭵� ���� ��� ������ ����
	
	protected String s ="test";//��Ű���� �޶� �ڽ� Ŭ�������Դ� ���
	
	public ParentClass() {
	
			System.out.println("PatrentClass()������ ����");
	}
	public ParentClass(int n) {
		this.n=n;
		System.out.println(n);
	}
	
	public void ParentMethod() {//��𼭵� ȣ�Ⱑ��
		
			System.out.println("PatrentMethod()������ ����");
	}
	void defaultClass(){//������Ű���������� ȣ�Ⱑ��
		
		System.out.println("defaultClass()������ ����");
	}
	private void privateMethod() {//�θ� Ŭ���� ���ο����� ȣ�� ����
		
			System.out.println("privateMethod()������ ����");
	}

}
