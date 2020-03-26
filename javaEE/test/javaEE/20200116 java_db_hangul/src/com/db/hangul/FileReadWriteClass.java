package com.db.hangul;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReadWriteClass {
	public FileReadWriteClass() {
	}
	
	//외부 텍스트 파일을 줄단위로 읽는 메서드
	public static  ArrayList<String> readFileLines(String url) {//1번 String url
		ArrayList<String> lines = new ArrayList<String>();//4번
		try {
			FileReader fr = new FileReader(url);//2번
			BufferedReader br = new BufferedReader(fr);//3번 예외처리 없음(try,catch)
			
			while(true){
				String line  = br.readLine();//8번
				if(br.readLine()==null){
					return lines;
				}
				//System.out.println(br.readLine());//5번 첫번째 라인만 확인 catch를 추가한다.
				//String line  = br.readLine();//8번의 과거코드
				//lines.add(line);//8번의 과거코드
				//lines.add(br.readLine());//8번 과거코드를 한줄로 줄인 코드
				lines.add(line);//8번
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일에러"+e.getMessage());
		} catch (IOException e) {
			System.out.println("리드파일에러"+e.getMessage());
		}
		return lines;
	}
	
	
	//HTML 파일을 생성하는 메서드
	public static void writeFileLines() {
	}
}
