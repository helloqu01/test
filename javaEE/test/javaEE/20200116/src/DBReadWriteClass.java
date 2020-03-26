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
			String line = lines.get(i);//���� ���� �� ��������
			String[] words = line.split(",");//�и��Ͽ�����
			float f = Float.parseFloat(line);
			double d=Double.parseDouble(line);
			String queryInsert = "insert into crime_table2 (a,b,c,d,e,f,g,h,i,j,k,l,n,m,o) values('"+words[1]+"','"+words[2]+"',"
					+ "'"+words[3]+"','"+words[4]+"','"+words[5]+"','"+words[6]+"','"+words[7]+"','"+words[8]+"','"+words[9]+"','"
					+words[10]+"','"+words[11]+"','"+words[12]+"','"+words[13]+"','"+words[14]+"')";
			double n =stmt.executeUpdate(queryInsert);//��������
			if(n>0){
				System.out.println(i+"�����ͻ��� ����");
			}
		}
		
	} catch (SQLException e) {
		System.out.println("sql ���� ����");
	}finally{//13
		try {
			mysqlConnect.close();
		} catch (SQLException e) {
			System.out.println("���̿���ť�� Ŀ��Ʈ Ŭ���� ����");
		}
	}
	}
	
	
	
	Connection mysqlConnect = null;
	public void connectMySQL(String dbname){//8
		String driverName = "com.mysql.jdbc.Driver";//����̹� ��Ī�� ����
		String dbURL = "jdbc:mysql://localhost:3306/";//127.0.0.1 ����ȣ��Ʈ ��ȣ
		String adminID = "root";
		String adminPW = "920424";
		
		try {
			Class.forName(driverName);//9 forName ����̹� �ε�
			mysqlConnect = DriverManager.getConnection(dbURL+dbname,adminID,adminPW);//10 DriverManager.getConnection �� ����
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("������� ����"+e.getMessage());
		}
	}
	
	
	
	public ResultSet selectData(){//14
		this.connectMySQL("crime_db2");
		ResultSet rs = null;//16
		try {
			Statement stmt = mysqlConnect.createStatement();//15 Statement ��ü�� ����
			rs=stmt.executeQuery("select * from crime_table");//18 ResultSet�� int�� ��ü ����� �ޱ�
		} catch (SQLException e) {
			System.out.println("insertData ����"+e.getMessage());
		}
		return rs;//17
	}
	
}
