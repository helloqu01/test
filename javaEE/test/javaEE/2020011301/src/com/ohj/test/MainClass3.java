package com.ohj.test;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass3 {

	public static void main(String[] args) {// �� ���� ���� ����� 
		// 3.���Ͽ� ������(�� �پ� ����)
		//3-1.filewriter.Class -> write("���ڿ�")
		//3-2 BufferedWriter.class=>newLine()�� /write("���ڿ�")
		//��� ��ο� � ���ϸ����� 
		String uri = "c:/filetest/basic.html";
		
		try {
			FileWriter fw=new FileWriter(uri);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("<html>");
			bw.newLine();
			bw.write("<body bgcolor='yellow'>");
			bw.newLine();
			bw.write("�������� ���ο� �������� �۾�");
			bw.newLine();
			bw.write("<form action =  'test.html' method='get'>");
			bw.write("<input type = 'text' name='txt' />");		
			bw.write("<input type = 'submit' />");//���⸦ ���ؾ���
			bw.write("</form>");
			bw.newLine();
			bw.write("</body>");
			bw.newLine();
			bw.write("</html>");
			bw.close();
		} catch (IOException e) {
			
			System.out.println(e.getMessage());//���� ã�⸦ ������ ���
		}
		
	}

}
