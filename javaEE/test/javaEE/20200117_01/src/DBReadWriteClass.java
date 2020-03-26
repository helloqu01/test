import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

public class DBReadWriteClass {
	
	private static Connection conn = null;//������ ���̽� ����

	public DBReadWriteClass(){

	}
	
	/**mysql ����̹� �ε� db���� �޼ҵ�**/
	
	public static void connectMySQL(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� ����");
			String url = "jdbc:mysql://localhost:3306/pop_db";
			conn=DriverManager.getConnection(url,"root","920424");
		} catch (ClassNotFoundException e) {
			System.out.println("com.mysql.jdbc.Driver ����"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("������ Ŀ��Ʈ ����"+e.getMessage());
		}
	}

	/**�����͸� ����**/
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
				int n =  stmt.executeUpdate(queryInsert);//����� ����ϴ°�
				count = count +n;	
			}
			System.out.println(count + " �����Ͱ� �Է���ϴ�");
		
		} catch (SQLException e) {
			System.out.println("dataInsert ����"+e.getMessage());
		}
	}
}
