package com.ohj.emp;

public class MainClass {

	public static void main(String[] args) {	
		
		String [] h;
		String names="";
		String hd="";
		for(int i =0; i<ic.length;i++){
			
		}
		
/////////////////////////////////////////////////////////////////////////////		
		/*String s="public-static-void-main";
		String[] r = s.split("-");
		System.out.println(r.length);
		
		String s1="public-static-void-main";
		String[] r1 = s.split("-");
		System.out.println(r.length);
		
		String s2="public-static-void-main";
		String[] r2 = s.split("-");
		System.out.println(r.length);
		
		String s3="public-static-void-main";
		String[] r3 = s.split("-");
		System.out.println(r.length);*/
		
		
//////////////////////////////////////////////////////////////////////////////		
		/*DateClass dc = new DateClass();
		for(int i=0; i<dc.ic.length;i++){
			if(dc.ic[i].job.equals("���")){
				System.out.println("����� �̸��� : "+dc.ic[i].eName);
			}
		}*/
	
//////////////////////////////////////////////////////////////////////////////	
		/*int[] n={10,15,33,5,7,20};
		int temp=0;//�ִ밪0,�������̰�200(�� ���̱��� �������� ���ϹǷ�)
		
		for(int i=0;i<n.length;i++){
			if(temp<n[i]){
				temp=n[i];
			}
		}
		System.out.println(temp);*/
/////////////////////////////////////////////////////////////////////////////
		
		/*//�ְ� ���� ã�� ���.
		int[] n={10,15,33,5,7,20};
		int temp=0;
		
		if(temp<n[0]){//������ n[0]���� ������       //(0<10)�̱� ������ 10�� ���� �ȴ�. temp =10
			temp=n[0];//������ n[0]���� �ִ´�.
		}
		if(temp<n[1]){//������ n[1]���� ������	//(10<15)�̱� ������ 15�� ���� �ȴ�. temp =15
			temp=n[1];//������ n[1]���� �ִ´�.
		}
		if(temp<n[2]){//������ n[2]���� ������	//(15<33)�̱� ������ 33�� ���� �ȴ�. temp =33
			temp=n[2];//������ n[2]���� �ִ´�.
		}
		if(temp<n[3]){//������ n[3]���� ������	//(33<5) 
			temp=n[3];//������ n[3]���� �ִ´�.
		}
		if(temp<n[4]){//������ n[4]���� ������	//(33<7) 
			temp=n[4];//������ n[4]���� �ִ´�.
		}
		if(temp<n[5]){//������ n[5]���� ������ 	//(33<20)
			temp=n[5];//������ n[5]���� �ִ´�.
		}
		//for���� �Ȱ��� ��Ģ�� �־�� �Ѵ�. �ұ�Ģ���� if*/
				
		
//////////////////////////////////////////////////////////////////////////		
		
	
		/*DataClass dc = new DataClass();//��ü ����, ��򰡿� ����ǿ� �մ� ���� ����´�.
		
		OperClass oc = new OperClass();
		oc.avgHireDate(dc.ic);//OperClass���� �������� �żҵ带 �����´�.*/
		
				
///////////////////////////////////////////////////////////////////////////		
		
		
		/*System.out.println(dc.ic[13].commision);//�����Ͱ� �� ������ Ȯ���Ѵ�.
		int sum=0; String hd; String[] s;
		for(int i=0;i<dc.ic.length;i++){
		//String hd =dc.ic[0].hireData;
		//System.out.println(hd);
		hd =dc.ic[i].hireData;
			
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
		double avg = sum/(dc.ic.length*1.0);
		System.out.println(avg);*/
		}

	}


