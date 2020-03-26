package com.ohj.member;

public class InfoClass {
	
	String name;	//이름
	String joinDate;//가입일
	String lastVisitDate;//최종방문일
	int numVisit;//방문횟수
	String gender;//성별
	String age;//연령대
	
	public InfoClass(){//기본생성자
		
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

