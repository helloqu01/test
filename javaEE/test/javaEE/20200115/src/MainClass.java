import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		//String uri = "c:/filetest/.txt";
		FileReadWriteClass frwc = new FileReadWriteClass();
		//ArrayList<String> lines = frwc.readTextLine(uri);
		//System.out.println(lines.size()); Ȯ���ڵ�
		//System.out.println(lines.get(0)); Ȯ���ڵ�
		
		DBReadWriteClass dbrw = new DBReadWriteClass();
		ResultSet rs=dbrw.selectData();
		/*try {
			System.out.println(rs.next());
		} catch (SQLException e) {
			System.out.println("ERR ResultSet ��ȸ ���� ����"+e.getMessage());
		}
		//dbrw.insertData(lines);//DBReadWriteClass�� ������ �ִ� �޼ҵ带 ȣ��*/
		
		frwc.createHTML(rs);

		
	}
}
