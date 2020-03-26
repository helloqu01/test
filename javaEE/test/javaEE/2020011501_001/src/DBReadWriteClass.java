import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBReadWriteClass {

	public DBReadWriteClass() {
	}
	
	public void insertData(){
		
		
	}
	
	public void connectMTSQL(String dbname){
		String driverName = "com.mysql.jdbc.Driver";//드라이버 명칭은 고정
		String dbURL = "jdbc:mysql://localhost:3306/";//127.0.0.1 로컬호스트 번호
		String adminID = "root";
		String adminPW = "920424";
		
		Connection mysqlConnect=null;
		try {
			Class.forName(driverName);//MYSQL드라이버로드
			mysqlConnect = DriverManager.getConnection(dbURL+dbname,adminID,adminPW);//db에 접속
		} catch (ClassNotFoundException e) {
			
		} catch (SQLException e) {
			
		}
	}
	
	public void selectData(){
		
		
	}
}
