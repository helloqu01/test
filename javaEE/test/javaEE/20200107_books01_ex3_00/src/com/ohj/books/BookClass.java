package com.ohj.books;

public class BookClass {
	
	String title,author,press,picture;
	int price,dc_price,dc;
	
	
	public BookClass() {
		
	}
	// ��� 2���� ���� �߰� ������
	
			public BookClass(String t, String a){// ��� 2�� ���� �߰� ������
				 this.title=t;
				this.author=a;
				}
		
			
	
					//"iOS�� �ȵ���̵带 ���� HTML5",          "�κ� �н�",  "�Ѻ��̵��",     33000, "07041351.jpg", 10
	public BookClass(String t,String a,String p,int pr,String pic,int d) {
		this.author =a;
		this.dc=d;
		this.dc_price=dc;
		this.picture=pic;
		this.press=p;
		this.price=pr;
		this.title=t;
		this.dc_price=this.dcOperator(d);//��ȯ�� ���ΰ����� ����
	}
	
	private int dcOperator(int dp){//���η� ��� 10,000������ 10%�����ϸ� -> 10,000*(1-0.1)=9,000��
		double d= dp*0.01;
		return (int) (this.price*(1-d));
	}

}
