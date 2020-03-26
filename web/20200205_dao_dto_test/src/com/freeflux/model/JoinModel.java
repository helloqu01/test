package com.freeflux.model;

public class JoinModel {
	private int num;
	private String id;
	private String pw;
	private String email;
	private String phone;
	public int getnum(){
		return num;
	}
	
	//alt+shift+s+r 겟터세터 만들기
	
	public void setnum(int num){
		this.num = num;
	}
	
	
	
	public String getid(){
		return id;
	}
	public void setid(String id){
		this.id = id;
	}
	
	
	
	public String getpw(){
		return pw;
	}
	public void setpw(String pw){
		this.pw = pw;
	}
	
	
	public String getemail(){
		return email;
	}
	public void setemail(String email){
		this.email = email;
	}
	
	
	public String getphone(){
		return phone;
	}
	public void setphone(String phone){
		this.phone = phone;
	}

}
