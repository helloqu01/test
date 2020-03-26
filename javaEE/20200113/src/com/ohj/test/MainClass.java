package com.ohj.test;

import java.io.File;

public class MainClass {

public static void main(String[] args) {

//1. 파일 다루기(File.class)==>예외처리가 없다.(내부데이터 건들이지 않는다.파일 자체를 건들인다.) new File("경로") 

File f =new File("c:/windows");

//C:\Users\USER\Desktop\mysql-essential-5.1.60-win32

System.out.println("읽을 수 있는지:"+f.canRead());

System.out.println("쓸 수 있는 지"+f.canWrite());

System.out.println("폴더 인지:"+f.isDirectory());//폴더 인지 아닌지 확인시켜주는 것

System.out.println("파일인지"+f.isFile());//파일인지 아닌지 확인 시켜주는 것

System.out.println("마지막 수정 날짜를 10진수로:"+f.lastModified());//맨 마지막 수정된 날짜를 10진수로 알려줌

//1578873452925:1970.1.1 00:00:00 부터 현재까지의 시간을 10진수로

System.out.println("파일의 크기:"+f.length());

System.out.println("폴더일 경우 내부 폴더 및 파일 이름들"+f.list());//폴더일 경우에 String으로 반환시켜주는 것

String[] file_list=f.list();

for(int i=0;i<file_list.length;i++){

System.out.println(file_list[i]);

}

String uri="c:/windows";

String[] file_list2=f.list();

for(int i=0;i<f.length();i++){

File f2 = new File(uri+file_list2[i]);

if(f2.isDirectory()){

System.out.println("폴더:"+file_list2[i]);

}else{

System.out.println("파일:"+file_list2[i]);

}

}

}
}
