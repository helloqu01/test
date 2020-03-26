package com.db.hangul;

import java.util.ArrayList;

public class MainClass {

public static void main(String[] args) {

String url_stu ="c:/filetest/student.txt";//6번

String url_prof ="c:/filetest/professor.txt";//6번

ArrayList<String> lines = FileReadWriteClass.readFileLines(url_stu);

//7번(결과값)FileReadWriteClass.readFileLines(url_prof); ->92001, 590327-1839240, 이태규, 920, 교수, 1997)

//9번 ArrayList<String> lines = 추가

//System.out.println(lines.size());//10번 몇 줄 인지 확인

DBReadWriteClass.connectMySQL();//15번 mysql 드라이버 성공

DBReadWriteClass.dataInsert(lines);//22번 호출해서 몇조각 났는지 확인한다.

DBReadWriteClass.dataSelectAll();

}
}