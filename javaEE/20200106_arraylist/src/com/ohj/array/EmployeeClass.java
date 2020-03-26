package com.ohj.array;
public class EmployeeClass {

	int empNo=0;
	String eName ="";
	String job="";
	String hireDate="";
	int sale=0;
	int commission=0;
	int deptNo=0;
	
	public EmployeeClass(){//기본 생성자
	}
//모든데이터를 전달받는 생성자

	public EmployeeClass(int e,String n,String j,String h,int s,int c,int f,int d){
	this.empNo=e;
	this.eName=n;
	this.job=j;
	this.hireDate=h;
	this.sale=s;
	this.commission=c;
	this.deptNo=d;
	}

//부서 식별 번호가 없는 데이터를 전달받는 생성자

	public EmployeeClass(int e,String n,String j,String h,int s,int c,int f){
	
	this.empNo=e;
	this.eName=n;
	this.job=j;
	this.hireDate=h;
	this.sale=s;
	this.commission=c;

	}
}