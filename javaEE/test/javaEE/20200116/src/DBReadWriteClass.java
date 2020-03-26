import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBReadWriteClass {
	public DBReadWriteClass(){
	}
	public void insertData(ArrayList<String> lines){
	try {
		Statement stmt = mysqlConnect.createStatement();//11
		for(int i=0;i<lines.size();i++){//12
			String line = lines.get(i);//한줄 문자 열 추출저장
			String[] words = line.split(",");//분리하여저장
			float f = Float.parseFloat(line);
			double d=Double.parseDouble(line);
			String queryInsert = "insert into crime_table2 (a,b,c,d,e,f,g,h,i,j,k,l,n,m,o) values('"+words[1]+"','"+words[2]+"',"
					+ "'"+words[3]+"','"+words[4]+"','"+words[5]+"','"+words[6]+"','"+words[7]+"','"+words[8]+"','"+words[9]+"','"
					+words[10]+"','"+words[11]+"','"+words[12]+"','"+words[13]+"','"+words[14]+"')";
			double n =stmt.executeUpdate(queryInsert);//쿼리실행
			if(n>0){
				System.out.println(i+"데이터삽입 성공");
			}
		}
		
	} catch (SQLException e) {
		System.out.println("sql 쿼리 오류");
	}finally{//13
		try {
			mysqlConnect.close();
		} catch (SQLException e) {
			System.out.println("마이에스큐엘 커넥트 클로즈 오류");
		}
	}
	}
	
	
	
	Connection mysqlConnect = null;
	public void connectMySQL(String dbname){//8
		String driverName = "com.mysql.jdbc.Driver";//드라이버 명칭은 고정
		String dbURL = "jdbc:mysql://localhost:3306/";//127.0.0.1 로컬호스트 번호
		String adminID = "root";
		String adminPW = "920424";
		
		try {
			Class.forName(driverName);//9 forName 드라이버 로드
			mysqlConnect = DriverManager.getConnection(dbURL+dbname,adminID,adminPW);//10 DriverManager.getConnection 로 연결
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 오류"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("디비접속 오류"+e.getMessage());
		}
	}
	
	
	
	public ResultSet selectData(){//14
		this.connectMySQL("crime_db2");
		ResultSet rs = null;//16
		try {
			Statement stmt = mysqlConnect.createStatement();//15 Statement 객체를 형성
			rs=stmt.executeQuery("select * from crime_table");//18 ResultSet나 int로 객체 결과를 받기
		} catch (SQLException e) {
			System.out.println("insertData 오류"+e.getMessage());
		}
		return rs;//17
	}
	
}
