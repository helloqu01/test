package com.ohj.Phone_ex;

public class MainClass {

	public static void main(String[] args) {
		// ����. �Ʒ� �����͸� �̿��Ͽ� �̸�Ʈ ���Ǹ� ���� ���ϼ���
		DataClass dc = new DataClass();
		InfoClass ic= new InfoClass();
	
		String searchName="�����ó�Ʈ8";
		ic.searchName(dc.Info, searchName);
		
		System.out.println();//��Ʈ8����
		System.out.println();//v50����
		System.out.println();//������ 8 ����
		System.out.println();//�Ѱ���
		

	}

}
