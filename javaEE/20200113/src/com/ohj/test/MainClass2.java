package com.ohj.test;

import java.io.BufferedReader;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.IOException;

public class MainClass2 {

public static void main(String[] args) {

// 파일 내부(데이터:텍스트)읽기 FileReader.class(로컬 파일들을 다룰때 pc에 있는 파일을 다룰때)

//2-1. 글자 한개씩 byte단위로 읽기 FileReader.class=>read() => (char)byte형반환 시켜줘야 함 

//2-2. 한 줄씩 읽기 BufferedReader.class=>readLine()=>String

// 1.fileReader객체를 먼저 생성 : new FileReader("읽을 파일의 경로 및 파일");

// 2.BufferedReader객체를 만든다 : new BufferedReader(FileReader객체);

//*FileReader.Class의 부모 클래스=>File.class

//*~~inputStream.class:네트워크를 통해 데이터를 읽을 때(인터넷을 통해서) 

//C:\Users\USER\workspace\20200113\src\com\ohj\MainClass2.java

String uri="C:/Users/USER/workspace/20200113/src/com/ohj/MainClass2.java";

try {//강제 종료를 막아주는 기능

FileReader f1=new FileReader("c:/filetest/memo.txt");

BufferedReader br=new BufferedReader(f1);

String line="";

while((line=br.readLine())!= null){

//line=br.readLine();

//if(line==null){//EOF: end of file(즉, 문서의 끝)

// break;

//}

System.out.println(line);

}

//System.out.println(br.readLine());//읽을 때도 예외처리가 들어간다. 첫번째 줄이 나옴

//System.out.println(br.readLine());//두번째 줄이 나옴

} catch (IOException fnfe) {//FileNotFoundException 클래스명//IOException예외처리가 더들어감/IOException는 FileNotFoundException보다 조상

System.out.println(fnfe.getMessage());//파일 찾기를 실패할 경우

}

}

}