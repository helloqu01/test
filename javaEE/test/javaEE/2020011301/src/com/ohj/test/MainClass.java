package com.ohj.test;

import java.io.File;

public class MainClass {

	public static void main(String[] args) {
		
		//1. ���� �ٷ��(File.class)==>����ó���� ����.(���ε����� �ǵ����� �ʴ´�.���� ��ü�� �ǵ��δ�.) new File("���") 
		File f =new File("c:/windows");
		//C:\Users\USER\Desktop\mysql-essential-5.1.60-win32
		System.out.println("���� �� �ִ���:"+f.canRead());
		System.out.println("�� �� �ִ� ��"+f.canWrite());
		System.out.println("���� ����:"+f.isDirectory());//���� ���� �ƴ��� Ȯ�ν����ִ� ��
		System.out.println("��������"+f.isFile());//�������� �ƴ��� Ȯ�� �����ִ� ��
		System.out.println("������ ���� ��¥�� 10������:"+f.lastModified());//�� ������ ������ ��¥�� 10������ �˷���
		//1578873452925:1970.1.1 00:00:00 ���� ��������� �ð��� 10������
		System.out.println("������ ũ��:"+f.length());
		
		System.out.println("������ ��� ���� ���� �� ���� �̸���"+f.list());//������ ��쿡 String���� ��ȯ�����ִ� ��
		
		String[] file_list=f.list();
			for(int i=0;i<file_list.length;i++){
			System.out.println(file_list[i]);
		}
				
			String uri="c:/windows";
			String[] file_list2=f.list();
			
			for(int i=0;i<f.length();i++){
				File f2 = new File(uri+file_list2[i]);
				if(f2.isDirectory()){
					System.out.println("����:"+file_list2[i]);
				}else{
					System.out.println("����:"+file_list2[i]);
				}
			}
	}

}
