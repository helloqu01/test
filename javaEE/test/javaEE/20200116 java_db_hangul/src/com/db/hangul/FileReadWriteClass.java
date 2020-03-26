package com.db.hangul;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReadWriteClass {
	public FileReadWriteClass() {
	}
	
	//�ܺ� �ؽ�Ʈ ������ �ٴ����� �д� �޼���
	public static  ArrayList<String> readFileLines(String url) {//1�� String url
		ArrayList<String> lines = new ArrayList<String>();//4��
		try {
			FileReader fr = new FileReader(url);//2��
			BufferedReader br = new BufferedReader(fr);//3�� ����ó�� ����(try,catch)
			
			while(true){
				String line  = br.readLine();//8��
				if(br.readLine()==null){
					return lines;
				}
				//System.out.println(br.readLine());//5�� ù��° ���θ� Ȯ�� catch�� �߰��Ѵ�.
				//String line  = br.readLine();//8���� �����ڵ�
				//lines.add(line);//8���� �����ڵ�
				//lines.add(br.readLine());//8�� �����ڵ带 ���ٷ� ���� �ڵ�
				lines.add(line);//8��
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("���Ͽ���"+e.getMessage());
		} catch (IOException e) {
			System.out.println("�������Ͽ���"+e.getMessage());
		}
		return lines;
	}
	
	
	//HTML ������ �����ϴ� �޼���
	public static void writeFileLines() {
	}
}
