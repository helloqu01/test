package com.ohj.array;

import java.util.ArrayList;

public class MainClass {
		
	public static void main(String[] args) {
		
		DataClass dc = new DataClass();
		
		for(int i =0;i<dc.empArr.size();i++){
			System.out.println(dc.empArr.get(i).eName);
		}
		
		
		
		
		//InfoClass ic = new InfoClass("181234-3345678");
		//System.out.println(ic.age);
		
		//TestClass tc = new TestClass();
		
		//ArrayList<TestClass> a = new ArrayList<TestClass>();//������ �س��� ������ ���� �������� �ʿ䰡 ����
		//a.add(tc);
		//int s = a.size();//�氳���� �ƴ� ���
		//System.out.println(s);
		//Object t = a.get(0);
		//TestClass t2 = (TestClass)a.get(0);
		
	}

}

/*

�迭 :  �ַ� �������� ���� ���� �Ҷ�
�迭�� Ư¡ : ������ ������ Ÿ�Ը� ���� ����
		 	�ʱ� �ε���(��)�� ������ ���� �Ұ���
		 	�ʱ⿡ �ε���(��)�� ������ ����
			ex) TestClass[] tArr= new TestClass[3];
			
ArrayList : �ܺ�Ŭ������ ����(ArrayList.Class)
			�̰��� ����Ϸ��� �ݵ�� import�� �ʿ�(import java.util.ArrayList)
			���� �޼ҵ带 ���Ͽ� ������ �������� ��������, ���� ��ü������ �ʼ�(new ArrayList())
			ArrayList�� �ַ� ��ü���� ������ �� ���
			Ÿ���� Ÿ���� �����͸� �ѹ��� ���� �� ���ִ�(������Ʈ ���Ϸ� �߰��Ǳ� ������ �����ϴ�)
			ex)ArrayList a = new ArrayList();
			a.add(new TestClass);
			a.add(true);
			a.add(1123);
			a.add(12.5);
			a.add('abcd);
			�� ����� ���� ������Ʈ Ÿ������ ����ȴ�.
			���� �����͸� ��� �� ��� ���� Ÿ������ ��ȯ�ؾ� �Ѵ�.
			�� TestClass t =(TestClass)a.get(0);
			
���� ������ Ÿ���� ��ü���� ������ ��쿡�� �̸� Ÿ���� �����Ѵ�.(�迭�� ArrayList�� ������)
		ex) ArrayList<TestClass> a = new ArrayList<TestClass>();
			a.add(new TestClass());//�׽�Ʈ Ŭ���� Ÿ������ ���� ��.
			TestClass tt = a.get(0);//������ Ÿ�� ��ȯ �ʿ� ����.
			
arrayList�� �ֿ� �޼ҵ�
1. 	add; // �� ������ ��ġ�� ������ �߰�
2.	get(�ε�����ȣ);//������ ��ġ�� ������ ����
3.	remove(�ε�����ȣ)//������ ��ġ�� �����͸� �����ϰ� �� �����͸� ��ȯ.
4.	size() // �������� ������ ��ȯ

ArrayList�� �����͸� �߰��ϰų� ������ ���, size()�� �ڵ����� �ٲ��.
ex) ArrayList<TestClass> a= new ArrayList<TestClass>();
	a.add(new testClass); // Size()=>1
	a.add(new testClass); // Size()=>2
	a.add(new testClass); // Size()=>3
	
	a.remove(0); //size()=>2
	�� �� ���ŵ� ������ ��ġ�� �ٸ� �����͵��� ��ĭ�� �̵��ȴ�.
	


*/