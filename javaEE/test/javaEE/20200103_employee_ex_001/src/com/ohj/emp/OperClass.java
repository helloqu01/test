package com.ohj.emp;

public class OperClass {//�żҵ带 �����ϴ� Ŭ����
	
	public OperClass(){ // �⺻������
		
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////	
	public void avgHireDate(InfoClass[] ic){//����� ���ϴ� �޼ҵ�
		int sum=0; String hd; String[] s;
		for(int i=0;i<ic.length;i++){
		//String hd =dc.ic[0].hireData;
		//System.out.println(hd);
		hd =ic[i].hireData;
			
		//String[]s=hd.split("-");// �ɰ��� �� "2007-03-01"-> "2007","03","01"
		//System.out.println(s[0]);
		//System.out.println(s[1]);
		//System.out.println(s[2]);
		s=hd.split("-");
		
		//System.out.println(2020+s[0]);//����+����=���ڿ�
		//int y = Integer.parseInt(s[0]);//���ڿ��� �Ǿ��ִ� ���ڸ� ���ڷ� �ٲ��ִ� �� ex) "2007"=>2007
		//System.out.println(2020-y); //���ڿ� ���ڴ� -�� �� �� ������ ���ڸ� ���ڷ� �ٲٸ� -�� �� �� �ִ�.
		sum = sum+(2020-Integer.parseInt(s[0]));
		
		}
		//��� ���������� ���϶�
		double avg = sum/(ic.length*1.0);
		System.out.println(avg);
//////////////////////////////////////////////////////////////////////////////////////////////
		
		
	}

}
