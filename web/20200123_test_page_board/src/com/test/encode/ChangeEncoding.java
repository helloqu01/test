package com.test.encode;

import java.io.UnsupportedEncodingException;

public class ChangeEncoding {
	public ChangeEncoding() {

	}
	
	//java -> mySQL�� ����
	public static String toLatin(String str){//���ڵ� ���� Latin���� �Ǿ� �ִ�.
		
		try {
			byte[] b = str.getBytes();//String�� ������ �ִ� getBytes�޼ҵ� //���ڿ��� 1����Ʈ ������ �ɰ��� �޼ҵ�
			return new String(b,"ISO-8859-1");//ISO-8859-1�� �⺻ ���� �Ǿ��ִ�.//String ��ü ����
			//���ڿ��� ����Ʈ �迭�� ���� ->ISO-8859-1���� ���ڵ�
			
		} catch (UnsupportedEncodingException uee) {
			System.out.println("���ڵ� ERR : toLatin()"+uee.getMessage());
			return null;
		}
	}
	
	//mySQL-> java�� �б�
	public static String toUnicode(String str){
	
		try {
			byte[] b = str.getBytes("ISO-8859-1");
			//MYSQL���ڿ��� 1����Ʈ ������ �ɰ��µ�, ��, ISO-8859-1�� �ɰ�
			return new String(b);//���ο� String ��ü ����(����Ʈ �迭�� ������) 
		} catch (UnsupportedEncodingException uee) {
			System.out.println("���ڵ� ERR : Unicode()"+uee.getMessage());
			return null;
		}
		
	}
}
