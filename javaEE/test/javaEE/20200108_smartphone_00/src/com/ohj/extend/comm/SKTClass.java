package com.ohj.extend.comm;

import com.ohj.phone.SamsungClass;

public class SKTClass extends SamsungClass{
	public int t_member=0;
	public String phonrNumber="";
	
	public SKTClass() {
	}
	public SKTClass(String string) {
		this.phonrNumber=string;
	}
	public void tworld(String n){//�ڱ� ��ȣ�� ���� �޾ƾ��ϱ� ������
	if(this.phonrNumber.equals(n)){
		System.out.println("�α��� �Ǿ����ϴ�.");
		
	}else{
		System.out.println("����� �ƴմϴ�.");
	}
	}

	public String getPhoneNumber(){ //getter �żҵ�
		return this.phonrNumber;
	}
}
