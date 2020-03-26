package com.ohj.test;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass4 {

	public static void main(String[] args) {// 웹 문서 파일 만들기 
		// 3.파일에 데이터(한 줄씩 쓰기)
		//3-1.filewriter.Class -> write("문자열")
		//3-2 BufferedWriter.class=>newLine()줄 /write("문자열")
		//어느 경로에 어떤 파일명으로 
		String uri = "c:/filetest/main.java";
		
		try {
			FileWriter fw=new FileWriter(uri);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("public class Main{");
			bw.newLine();
			bw.write("public static void main(String[] args) {");
			bw.newLine();
			bw.write("System.out.println(\"출력\");");
			bw.newLine();
			bw.write("}");
			bw.newLine();
			bw.write("}");
			bw.close();
		} catch (IOException e) {
			
			System.out.println(e.getMessage());//파일 찾기를 실패할 경우
		}
		
	}

}
