package java_file_mysql_html;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

	public class DBClass {
		Connection conn = null;//getConnection의 변수
		public DBClass() {
			
		}
		// DB접속 메소드(드라이버 로드 및 DB 접속까지 처리)
		public void connectDB() {
			String driverName = "com.mysql.jdbc.Driver";//드라이버 명칭은 고정
			String dbURL = "jdbc:mysql://localhost:3306/";//127.0.0.1 로컬호스트 번호
			String dbname = "newstable";
			String adminID = "root";
			String adminPW = "920424";
			try {
				Class.forName(driverName);// 드라이버 로딩
				System.out.println(driverName+"드라이버 로드 성공");
				this.conn = DriverManager.getConnection(dbURL+dbname, adminID, adminPW);//드라이버들을 관리해주는 클래스 명 getConnection 변수를 선언 시켜줘야함
				System.out.println("DB 접속 성공");
			} catch (SQLException e) {
				System.out.println("ERR connect:" + e.getMessage());
			} catch (ClassNotFoundException e) {
				System.out.println("ERR mySQL Driver Load:" + e.getMessage());
			}
		}
		
		public void insertData(ArrayList<String> lines){
			String insert = "insert into naver_news_table(imgname,urlname) values(words[1],words[2])";
			try {
				Statement stmt =  this.conn.createStatement();
				int n=0;
				for(int i=0;i<lines.size();i++){
					String[] words = lines.get(i).split(", ");
					System.out.println(words[1]+"\t");
					System.out.println(words[2]);
					insert = "insert into naver_news_table(imgname,urlname) values('" +words[1]+"','"+words[2]+"')"; 
					n=stmt.executeUpdate(insert);				}
			} catch (SQLException e) {
				System.out.println("ERR insert into 오류"+e.getMessage());
			}
		}
		
		public ResultSet selectData(){
			this.conn
			return null;
		}
}
