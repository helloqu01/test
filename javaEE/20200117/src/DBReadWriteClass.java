import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.Statement;

import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

public class DBReadWriteClass {

private static Connection conn = null;//데이터 베이스 접속

public DBReadWriteClass(){

}

/**mysql 드라이버 로딩 db접속 메소드**/

public static void connectMySQL(){

try {

Class.forName("com.mysql.jdbc.Driver");

System.out.println("드라이버 성공");

String url = "jdbc:mysql://localhost:3306/pop_db";

conn=DriverManager.getConnection(url,"root","920424");

} catch (ClassNotFoundException e) {

System.out.println("com.mysql.jdbc.Driver 오류"+e.getMessage());

} catch (SQLException e) {

System.out.println("데이터 커넥트 에러"+e.getMessage());

}

}
/**데이터를 삽입**/

public static void dataInsert(ArrayList<String> lines){

try {

String[] words= null;

int count =0;

for(int i=0;i<lines.size();i++){

words = lines.get(i).split(" ,");

String area = ChangeEncoding.toLatin(words[0]);

int menage = Integer.parseInt(words[1]);

int korea_men = Integer.parseInt(words[2]);

int korea_woman = Integer.parseInt(words[3]);

int foreigner_man = Integer.parseInt(words[4]);

int foreigner_woman = Integer.parseInt(words[5]);

double area_pop = Double.parseDouble(words[6]);

int over = Integer.parseInt(words[7].trim());
String queryInsert="insert into pop_table values ('"+area+"','"+menage+"','"+korea_men+"','"+korea_woman+"','"+foreigner_man+"','"+foreigner_woman+"','"+area_pop+"','"+over+"')";

//System.out.println(queryInsert);

Statement stmt = conn.createStatement();

int n = stmt.executeUpdate(queryInsert);//들어가라고 명령하는것

count = count +n; 

}

System.out.println(count + " 데이터가 입력됬습니다");

} catch (SQLException e) {

System.out.println("dataInsert 에러"+e.getMessage());

}

}

}