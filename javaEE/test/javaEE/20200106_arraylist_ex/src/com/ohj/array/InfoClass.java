package com.ohj.array;

public class InfoClass {//Ŭ���� ���� �ο��� private�� ���� ������ �ʴ´�
	private String no;//private �� Ŭ���� ���ο����� ����ϰڴ�.�ܺο����� ���� ���� ��� �� �� ����.
	int age = 0;
	
	private InfoClass(){//�̰��� private�� �����ϸ� main�� ��ü�� �������� ���Ѵ�.
	
	}
	
	public InfoClass(String string) {
		this.no=string;
		this.ageOperator();
		
	}
	private void ageOperator(){
		//ic.no = "881234-4345678";
		String[] s=this.no.split("-");// -�� �������� �ѷ� �ɰ�
		//s[0] :"881234"//s[1]"2345678"�� ���� �ȴ�.
		
		String year=s[0].substring(0,2);//�̾Ƴ����� ���� s[0]���� 0=8/1=8�� ������� �� �ִ�. ���� �ε�����ȣ�� �����´�.(0���� 2�������� ���ڸ� �����´�)
		System.out.println(year);
		
		String genderNo=s[1].substring(0,1);
		System.out.println(genderNo);
	
	if(genderNo.equals("1")||genderNo.equals("2")){// ������ 1�̰ų� 2�̸�
		this. age = 2020-(1900+Integer.parseInt(year));
		System.out.println(this.age);//���ڿ��� ���ڷ� �ٲٴ� �޼ҵ�
		
	}else{
		this. age = 2000+Integer.parseInt(year);//�ֹε�Ϲ�ȣ�� ���̸� ���ϴ� ��
		if(age>2020){
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
		}else{
			this.age=2020-this.age;
		}
		
	}
	
	}
}
