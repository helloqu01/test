package com.ohj.test;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass4 {

	public static void main(String[] args) {// �� ���� ���� ����� 
		// 3.���Ͽ� ������(�� �پ� ����)
		//3-1.filewriter.Class -> write("���ڿ�")
		//3-2 BufferedWriter.class=>newLine()�� /write("���ڿ�")
		//��� ��ο� � ���ϸ����� 
		String uri = "c:/filetest/main.java";
		
		try {
			FileWriter fw=new FileWriter(uri);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("public class Main{");
			bw.newLine();
			bw.write("public static void main(String[] args) {");
			bw.newLine();
			bw.write("System.out.println(\"���\");");
			bw.newLine();
			bw.write("}");
			bw.newLine();
			bw.write("}");
			bw.close();
		} catch (IOException e) {
			
			System.out.println(e.getMessage());//���� ã�⸦ ������ ���
		}
		
	}

}
