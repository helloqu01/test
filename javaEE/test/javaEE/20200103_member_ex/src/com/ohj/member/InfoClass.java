package com.ohj.member;

public class InfoClass {
	
	String name;	//�̸�
	String joinDate;//������
	String lastVisitDate;//�����湮��
	int numVisit;//�湮Ƚ��
	String gender;//����
	String age;//���ɴ�
	
	public InfoClass(){//�⺻������
		
	}
	
	public InfoClass(String n,String j,String last,int nv, String g,String a){
		this.name=n;
		this.joinDate=j;
		this.lastVisitDate=last;
		this.numVisit=nv;
		this.gender=g;
		this.age=a;
	}
		

}

