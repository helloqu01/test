import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBReadWriteClass {

	public DBReadWriteClass() {
	}
	
	public void insertData(){
		
		
	}
	
	public void connectMTSQL(String dbname){
		String driverName = "com.mysql.jdbc.Driver";//����̹� ��Ī�� ����
		String dbURL = "jdbc:mysql://localhost:3306/";//127.0.0.1 ����ȣ��Ʈ ��ȣ
		String adminID = "root";
		String adminPW = "920424";
		
		Connection mysqlConnect=null;
		try {
			Class.forName(driverName);//MYSQL����̹��ε�
			mysqlConnect = DriverManager.getConnection(dbURL+dbname,adminID,adminPW);//db�� ����
		} catch (ClassNotFoundException e) {
			
		} catch (SQLException e) {
			
		}
	}
	
	public void selectData(){
		
		
	}
}
