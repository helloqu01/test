package java_file_mysql_html;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

	public class DBClass {
		Connection conn = null;//getConnection�� ����
		public DBClass() {
			
		}
		// DB���� �޼ҵ�(����̹� �ε� �� DB ���ӱ��� ó��)
		public void connectDB() {
			String driverName = "com.mysql.jdbc.Driver";//����̹� ��Ī�� ����
			String dbURL = "jdbc:mysql://localhost:3306/";//127.0.0.1 ����ȣ��Ʈ ��ȣ
			String dbname = "newstable";
			String adminID = "root";
			String adminPW = "920424";
			try {
				Class.forName(driverName);// ����̹� �ε�
				System.out.println(driverName+"����̹� �ε� ����");
				this.conn = DriverManager.getConnection(dbURL+dbname, adminID, adminPW);//����̹����� �������ִ� Ŭ���� �� getConnection ������ ���� ���������
				System.out.println("DB ���� ����");
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
				System.out.println("ERR insert into ����"+e.getMessage());
			}
		}
		
		public ResultSet selectData(){
			this.conn
			return null;
		}
}
