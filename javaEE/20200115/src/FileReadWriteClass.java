import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

​public class FileReadWriteClass {

public FileReadWriteClass() {

}

// 외부 txt 파일을 줄 단위로 읽어서 ArrayList로 반환하는 매소드

public ArrayList<String> readTextLine(String uri) {

ArrayList<String> lines = new ArrayList<String>();// add시킬 ArrayList

try {

FileReader fr = new FileReader(uri);

BufferedReader br = new BufferedReader(fr);// 한 줄 단위로 읽어주는 클래스
while (true) {// 무한반복

String line = br.readLine();// 실제로 한 줄 읽는 것

if (line == null) {

return lines;

}

// System.out.println(line);

lines.add(line);

}

} catch (FileNotFoundException e) {

System.out.println("ERR readTextLine File 입출력 오류" + e.getMessage());

} catch (IOException e) {

System.out.println("ERR readTextLine 내부 br.readLine();오류" + e.getMessage());

}

return lines;// try 구문은 실행이 완료 되면 사라지기 때문에 ArrayList<String> lines = new

// ArrayList<String>();를 밖에다가 써준다.

}

public void createHTML(ResultSet rs) {

String url = "c:/filetest/news.html";

try {

FileWriter fw = new FileWriter(url);

BufferedWriter bw = new BufferedWriter(fw);

bw.write("<html>");

bw.write("<head><title>naver news</head></title>");

bw.write("<body>");

bw.write("<table border=1>");

bw.write("<tr><th>image</th><th>URL</th></tr>");

while (rs.next()) {

bw.write("<tr>");

bw.write("<td><img src=./newsimages/" + rs.getString("imgname") + "></td>");

bw.write("<td><a href=" + rs.getString("urlname") +">"+ rs.getString("urlname")+"</a></td>");

bw.write("</tr>");

}

bw.write("</table>");

bw.write("</body>");

bw.write("</html>");

bw.close();

} catch (IOException e) {

System.out.println("ERR FileWriter 입출력 오류" + e.getMessage());

} catch (SQLException e) {

System.out.println("ERR ResultSet 데이터 오류" + e.getMessage());

}

}

}
