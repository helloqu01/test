package com.ohj.emp;

//public ����������
public class InfoClass {
	//�������, �Ӽ�, ��������
	//default : ����������
	int empNo; // ��� �ĺ���ȣ
	String eName; // ����̸�
	String job;   //��å
	String hireData; //�Ի���
	int sale; // �޿�
	int commision;//������
	int deptNo;//�μ��ĺ���ȣ
	
	public InfoClass(){ //�⺻������
		
		
	}
	//1001, "�۹�ȣ", "���", "2007-03-01", 300, 0, 20
	//�ܺηκ��� �����͸� ���޹޴� ������(�ĺ���ȣ, ����̸�, ��å, �Ի���, �޿�, ������, �μ��ĺ���ȣ�� ������ �����
	public InfoClass(int e,String en,String j,String h,int s,int c,int d){
		this.empNo=e;
		this.eName=en;
		this.job=j;
		this.hireData=h;
		this.sale=s;//this�� Ŭ���� �ڱ� �ڽ��� ���Ѵ�.
		this.commision=c;
		this.deptNo=d;
		
	}

}
