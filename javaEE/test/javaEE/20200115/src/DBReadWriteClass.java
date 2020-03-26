import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;//��Ʈ��+����Ʈ+o

public class DBReadWriteClass {

	public DBReadWriteClass() {
	}

	public void insertData(ArrayList<String>lines){
		//String line = lines.get(0);
		//System.out.println(line);// ù��° �����Ͱ� �������� Ȯ��(����Ź�, nsd16500796.gif, http://newsstand.naver.com/032, ����)
		//String[]words = line.split(", ");//�����͸� ()�������� ����Ʈ���ش�
		//System.out.println(words[1]+"_"+words[1].length());//���� ���� �˷��ش�.(���̺� ���� �� ���)
		//System.out.println(words[2]+"_"+words[1].length());
		
		//String queryInsert = "insert into news_table (imgname,urlname) values('"+words[1]+"','"+words[2]+"')";// �ڹٴ� ���⸦ �� �ؾ��Ѵ�. mysql�� �˾Ƽ� �����Ѵ�.
		//String data = words[1]+","+words[2]+")";
		//System.out.println(queryInsert+data);//insert into news_table (imgname,urlname) values(nsd16500796.gif,http://newsstand.naver.com/032)
	
	//���ڿ� �и� �� ������ �׽�Ʈ �غ� ��
	//���� ���̺� ������ ���Կ���
		this.connectMYSQL("naver_db");//insertData���� connectMYSQL�� �������ش�. ���ο� �� �ʿ� ��������.
		try {
			Statement stmt =mysqlConnect.createStatement();
			//System.out.println("SQL���� ����");
			
			for(int i=0;i<lines.size();i++){
				String line = lines.get(i);// �� �� ���ڿ� ������ ����
				String[]words = line.split(", ");//����� ���ڿ� �и��Ͽ� ����
				String queryInsert = "insert into news_table (imgname,urlname) values('"+words[1]+"','"+words[2]+"')";// �ڹٴ� ���⸦ �� �ؾ��Ѵ�. mysql�� �˾Ƽ� �����Ѵ�.
				int n=stmt.executeUpdate(queryInsert);//���� ����
				if(n>0){
					System.out.println(i+"������ ���� ����");//������ ���Կ���Ȯ��
				}
			}
			//int n=stmt.executeUpdate(queryInsert);
			//if(n>0){
				//System.out.println("������ ���Լ���");
			//}else{
				//System.out.println("������ ���Խ���");
			//}
		} catch (SQLException e) {
			System.out.println("ERR SQL ���� ����"+e.getMessage());
		}finally{//���� : try{}������ ���� ���, catch(){} ��������
			
			try {
				mysqlConnect.close();//�ڿ����� �����ִ� �޼ҵ�(.close();)
			} catch (SQLException e) {
				System.out.println("ERR mysqlConnect.close(); ����"+e.getMessage());
			}
			
		}
	}
		
	Connection mysqlConnect=null;
	public void connectMYSQL(String dbname){//�����ͺ��̽� �̸��� �ٲ�� ������ �� �żҵ带 ������ �� ȣ�� ���� ����((String dbname)
		String driverName = "com.mysql.jdbc.Driver";//����̹� ��Ī�� ����
		String dbURL = "jdbc:mysql://localhost:3306/";//127.0.0.1 ����ȣ��Ʈ ��ȣ
		String adminID = "root";
		String adminPW = "920424";
		
		try {
			Class.forName(driverName);
			//System.out.println("mysql ����̹� �ε� ����");
			mysqlConnect=DriverManager.getConnection(dbURL+dbname,adminID,adminPW);
			//System.out.println("db���Ӽ���");
			
		} catch (ClassNotFoundException e) {
			System.out.println("ERR mysql ����̹� �ε� ����"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("ERR db���� ����"+e.getMessage());
		}
	}
	
	
	public  ResultSet selectData(){
		this.connectMYSQL("naver_db");
		ResultSet rs = null;
		try {
			Statement stmt =  mysqlConnect.createStatement();
			rs = stmt.executeQuery("select * from news_table");
		} catch (SQLException e) {
			System.out.println("ERR selectData���� ����"+e.getMessage());
		}
		return rs;
	}
	
}
