package com.ohj.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass2 {

	public static void main(String[] args) {
		// ���� ����(������:�ؽ�Ʈ)�б� FileReader.class(���� ���ϵ��� �ٷ궧 pc�� �ִ� ������ �ٷ궧)
		//2-1. ���� �Ѱ��� byte������ �б� FileReader.class=>read() => (char)byte����ȯ ������� �� 
		//2-2. �� �پ� �б� BufferedReader.class=>readLine()=>String
		//	1.fileReader��ü�� ���� ���� : new FileReader("���� ������ ��� �� ����");
		//	2.BufferedReader��ü�� ����� : new BufferedReader(FileReader��ü);
		//*FileReader.Class�� �θ� Ŭ����=>File.class
		//*~~inputStream.class:��Ʈ��ũ�� ���� �����͸� ���� ��(���ͳ��� ���ؼ�) 
		//C:\Users\USER\workspace\20200113\src\com\ohj\MainClass2.java
		
		String uri="C:/Users/USER/workspace/20200113/src/com/ohj/MainClass2.java";
		try {//���� ���Ḧ �����ִ� ���
			FileReader f1=new FileReader("c:/filetest/memo.txt");
			BufferedReader br=new BufferedReader(f1);
		
			
			String line="";
			while((line=br.readLine())!= null){
				//line=br.readLine();
				//if(line==null){//EOF: end of file(��, ������ ��)
				//	break;
				//}
				System.out.println(line);
			}
			
			//System.out.println(br.readLine());//���� ���� ����ó���� ����. ù��° ���� ����
			//System.out.println(br.readLine());//�ι�° ���� ����
		
		} catch (IOException fnfe) {//FileNotFoundException Ŭ������//IOException����ó���� ����/IOException�� FileNotFoundException���� ����
			
		System.out.println(fnfe.getMessage());//���� ã�⸦ ������ ���
		}
	}

}
