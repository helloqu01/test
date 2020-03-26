package com.ohj.Phone_ex;

import java.util.ArrayList;

public class InfoClass {
	String name,area,part;
	int price,dc_price;
	
	public InfoClass() {

	}
						//"갤럭시노트8", "이대점", "13EA"
	public InfoClass(String n,String a,String pi){
		this.area=a;
		this.part=pi;
		this.name=n;
		}
	
	public InfoClass(int dc,int d){
		this.dc_price=dc;
		this.dc_price=this.dcOperator(d);
	}
	
	public int dcOperator(int dp) {
		double d = dp*0.01;
		return (int)(this.price*(1-d));
	}
	
	public void searchName(ArrayList<InfoClass>name,String keyword){
		for(int i=0;i<name.size();i++){
			if(name.get(i).contains(keyword)){
				System.out.println(name.get(i).price);
			}
		}
	}
	private boolean contains(String keyword) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
