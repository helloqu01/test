package com.ohj.books;

public class DateClass {//InfoClass ��ü�� ����
	
	InfoClass[] ic= new InfoClass[6];// å ������ ����
	
	public DateClass (){
		ic[0]=new InfoClass("�̰��� �ڹ���",30000,"�ſ��","�Ѻ��̵��");//ic�� å ������ ����
		//System.out.println(ic[0].press);//����ŸŬ�������� �� �ԷµǾ����� Ȯ��1����//Ȯ���ڵ�
		
		
		ic[1] = new InfoClass("���̼�",25000,"ȫ�浿","���");
		//System.out.println(ic[1].press);////Ȯ���ڵ�
		
		
		ic[2] = new InfoClass("����ó�����",35000,"���","���");
		ic[3] = new InfoClass("HTML",15000,"�ٹ̱�","�Ѻ����ǻ�");
		ic[4] = new InfoClass("JSP&Serlet",23000,"����","������ǻ�");
		ic[5] = new InfoClass("����Ŭ",21000,"oracle","A������ǻ�");
		//System.out.println("DataClass ������ �۾� �Ϸ�");//Ȯ���ڵ�
		
	}

}
