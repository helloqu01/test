package com.db.hangul;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		String url_stu ="c:/filetest/student.txt";//6��
		String url_prof ="c:/filetest/professor.txt";//6��
		 ArrayList<String> lines = FileReadWriteClass.readFileLines(url_stu);
		 //7��(�����)FileReadWriteClass.readFileLines(url_prof); ->92001, 590327-1839240, ���±�, 920, ����, 1997)
		 //9�� ArrayList<String> lines = �߰�
		 //System.out.println(lines.size());//10�� �� �� ���� Ȯ��
		 
		 DBReadWriteClass.connectMySQL();//15�� mysql ����̹� ����
		 DBReadWriteClass.dataInsert(lines);//22�� ȣ���ؼ� ������ ������ Ȯ���Ѵ�.
		 DBReadWriteClass.dataSelectAll();
		 
	}

}
