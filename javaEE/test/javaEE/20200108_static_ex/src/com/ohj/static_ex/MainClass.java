package com.ohj.static_ex;

public class MainClass {

	public static void main(String[] args) {
		//1�� �Ʒ� �����͸� �̿��Ͽ� �̸�Ʈ ���Ǹ� ���� ���ϼ���
	
		System.out.println(DataClass.str.size());
		
		DataClass dc = new DataClass();// ������ �ȿ� �ִ� ���� ������ �� �ݵ�� ��ü�� ���� �Ǿ� �Ѵ�.
		System.out.println(DataClass.str.size());
		
		OperClass.sum();//static�� �پ��ִ� ��(������) ��ü�� ���� �����ʾƵ� ������ �� �ִ�.
		
		System.out.println(OperClass.PI);//static�� �پ��ִ� ��(������) ��ü�� ���� �����ʾƵ� ������ �� �ִ�.
		double PI =Math.PI;
		System.out.println(Math.floor(PI));// �Ҽ��� ���ڸ� �߶������
		System.out.println(Math.ceil(PI));// �Ҽ��� ������ �ø�
		System.out.println(Math.round(PI));// �Ҽ��� ���ڸ� �ݿø�
		//System.out.println(Math.PI);//Math�ȿ� �� �ִ� �Լ�
		///////////////////////////////////////////////////////////////////////////////////////
		
		double d = 45.3566;//�� �� ���� ���� �ִ�.6�� �ݿø��ϰ�ʹ� �Ҽ����� �Ű�ٰ� �ٽ� ���ͽ�Ű��
		d=d*100;//�Ҽ����� �ڷ� �ű��
		System.out.println(d);
		d=Math.round(d);//�Ҽ��� �ݿø��ϱ�
		System.out.println(d);
		d=d/100;//�Ҽ��� �ٽ� ���ͽ�Ű��
		System.out.println(d);
		
		//////////////////////////////////////////////////////////////////////////////////
		/*System.out.println(TestClass.n);// n������ ��ü�� ��������� �ʾƵ� ������ �����ϴ�.
		
		TestClass t1= new TestClass();//��ü ����
		t1.n=55;
		t1.num=2222;
		
		TestClass t2= new TestClass();
		System.out.println(t2.n);
		System.out.println(t2.num);
		
		TestClass t3= new TestClass();
		System.out.println(t3.n);*/
		
	}
	

}
