
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import java.util.ArrayList;//컨트롤+쉬프트+o


public class DBReadWriteClass {

public DBReadWriteClass() {

}

public void insertData(ArrayList<String>lines){

//String line = lines.get(0);

//System.out.println(line);// 첫번째 데이터가 나오는지 확인(경향신문, nsd16500796.gif, http://newsstand.naver.com/032, 종합)

//String[]words = line.split(", ");//데이터를 ()기준으로 떨어트려준다

//System.out.println(words[1]+"_"+words[1].length());//길이 값을 알려준다.(테이블 만들 때 사용)

//System.out.println(words[2]+"_"+words[1].length());

//String queryInsert = "insert into news_table (imgname,urlname) values('"+words[1]+"','"+words[2]+"')";// 자바는 띄어쓰기를 잘 해야한다. mysql은 알아서 이해한다.

//String data = words[1]+","+words[2]+")";

//System.out.println(queryInsert+data);//insert into news_table (imgname,urlname) values(nsd16500796.gif,http://newsstand.naver.com/032)

//문자열 분리 및 쿼리문 테스트 준비 끝

//실제 테이블에 데이터 삽입예정

this.connectMYSQL("naver_db");//insertData에서 connectMYSQL을 실행해준다. 메인에 갈 필요 없음으로.

try {

Statement stmt =mysqlConnect.createStatement();

//System.out.println("SQL쿼리 성공");

for(int i=0;i<lines.size();i++){

String line = lines.get(i);// 한 줄 문자열 추출후 저장

String[]words = line.split(", ");//저장된 문자열 분리하여 저장

String queryInsert = "insert into news_table (imgname,urlname) values('"+words[1]+"','"+words[2]+"')";// 자바는 띄어쓰기를 잘 해야한다. mysql은 알아서 이해한다.

int n=stmt.executeUpdate(queryInsert);//쿼리 실행

if(n>0){

System.out.println(i+"데이터 삽입 성공");//데이터 삽입여부확인

}

}

//int n=stmt.executeUpdate(queryInsert);

//if(n>0){

//System.out.println("테이터 삽입성공");

//}else{

//System.out.println("데이터 삽입실패");

//}

} catch (SQLException e) {

System.out.println("ERR SQL 쿼리 오류"+e.getMessage());

}finally{//실행 : try{}문제가 없을 경우, catch(){} 실행종료

try {

mysqlConnect.close();//자원해제 시켜주는 메소드(.close();)

} catch (SQLException e) {

System.out.println("ERR mysqlConnect.close(); 오류"+e.getMessage());

}

}

}

Connection mysqlConnect=null;

public void connectMYSQL(String dbname){//데이터베이스 이름만 바뀌기 때문에 이 매소드를 전달할 때 호출 받을 예정((String dbname)

String driverName = "com.mysql.jdbc.Driver";//드라이버 명칭은 고정

String dbURL = "jdbc:mysql://localhost:3306/";//127.0.0.1 로컬호스트 번호

String adminID = "root";

String adminPW = "920424";

try {

Class.forName(driverName);

//System.out.println("mysql 드라이버 로드 성공");

mysqlConnect=DriverManager.getConnection(dbURL+dbname,adminID,adminPW);

//System.out.println("db접속성공");

} catch (ClassNotFoundException e) {

System.out.println("ERR mysql 드라이버 로드 오류"+e.getMessage());

} catch (SQLException e) {

System.out.println("ERR db접속 오류"+e.getMessage());

}

}

public ResultSet selectData(){

this.connectMYSQL("naver_db");

ResultSet rs = null;

try {

Statement stmt = mysqlConnect.createStatement();

rs = stmt.executeQuery("select * from news_table");

} catch (SQLException e) {

System.out.println("ERR selectData내부 오류"+e.getMessage());

}

return rs;

}
}

