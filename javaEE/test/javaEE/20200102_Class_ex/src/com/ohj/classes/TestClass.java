package com.ohj.classes;

public class TestClass {
	// ����� ������ �־��ִ� Ŭ����
	// ��ü �����͸� �����ϴ� �迭
	InfoClass[] ic = new InfoClass[10];// 10���� ���� �����.

//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public TestClass() {
		ic[0]=new InfoClass(  "A"   ,    28  ,               "KR" ,         1  ,      "����");
		ic[1]=new InfoClass( "B"   ,    31  ,               "JP"  ,        3  ,     "������");
		ic[2]=new InfoClass(   "C"   ,    28  ,               "JP"  ,        1  ,      "����");
		ic[3]=new InfoClass(  "D"  ,     29 ,                "KR"  ,        2  ,      "����");
		ic[4]=new InfoClass( "E"   ,    28 ,                "US"  ,        2  ,     "������");
		ic[5]=new InfoClass( "F"   ,    32  ,               "US"  ,        5  ,      "����");
		ic[6]=new InfoClass(  "G"  ,     28  ,               "KR" ,         1  ,     "������");
		ic[7]=new InfoClass(  "H"  ,     29  ,              "EU"  ,        2   ,    "������");
		ic[8]=new InfoClass(  "I"   ,    33  ,               "EU"  ,        6  ,      "����");
		ic[9]=new InfoClass( "J"   ,    28  ,               "KR"  ,        1  ,     "������");
		
		// InfoClass ic2 = new InfoClass( "A",28, "KR", 1, "����");
		// ������ ���ο��� �ҷ���(info���� ������)salaryOperator();
	}	
///////////////////////�ۿ� ���� �ϱ�!!!!!!!!///////////////////////////////////////////////////////////
	public int[] total() {
		// �� ����� �� ���� �迭(�� ���� = �� ����+�� ��Ȱ��)
		int[] totalArray = new int[10];

		for (int i = 0; i < ic.length; i++) {// �����
			// �ٹ� (����)�Ⱓ ���� �� ��Ȱ�� ����(�� ��Ȱ��*12*�������)
			int costOfliving = 0;

			// �ٹ� (����)�Ⱓ ���� �� ���� ����(����*�������)
			int total = 0;

			total = ic[i].salary * ic[i].years;

			if (ic[i].local.equals("US")) {
				costOfliving = 70 * 12 * ic[i].years;
			}

			if (ic[i].local.equals("JP")) {
				costOfliving = 50 * 12 * ic[i].years;
			}

			if (ic[i].local.equals("EU")) {
				costOfliving = 100 * 12 * ic[i].years;

			}

			totalArray[i] = total + costOfliving;

		                                   }

		return totalArray;
	}

}// TestClass END
