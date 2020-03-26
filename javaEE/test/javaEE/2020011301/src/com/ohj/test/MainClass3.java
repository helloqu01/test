package com.ohj.test;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass3 {

	public static void main(String[] args) {// 웹 문서 파일 만들기 
		// 3.파일에 데이터(한 줄씩 쓰기)
		//3-1.filewriter.Class -> write("문자열")
		//3-2 BufferedWriter.class=>newLine()줄 /write("문자열")
		//어느 경로에 어떤 파일명으로 
		String uri = "c:/filetest/basic.html";
		
		try {
			FileWriter fw=new FileWriter(uri);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("<html>");
			bw.newLine();
			bw.write("<body bgcolor='yellow'>");
			bw.newLine();
			bw.write("웹페이지 내부에 보여지는 글씨");
			bw.newLine();
			bw.write("<form action =  'test.html' method='get'>");
			bw.write("<input type = 'text' name='txt' />");		
			bw.write("<input type = 'submit' />");//띄어쓰기를 잘해야함
			bw.write("</form>");
			bw.newLine();
			bw.write("</body>");
			bw.newLine();
			bw.write("</html>");
			bw.close();
		} catch (IOException e) {
			
			System.out.println(e.getMessage());//파일 찾기를 실패할 경우
		}
		
	}

}
