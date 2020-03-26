import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		//String uri = "c:/filetest/.txt";
		FileReadWriteClass frwc = new FileReadWriteClass();
		//ArrayList<String> lines = frwc.readTextLine(uri);
		//System.out.println(lines.size()); 확인코드
		//System.out.println(lines.get(0)); 확인코드
		
		DBReadWriteClass dbrw = new DBReadWriteClass();
		ResultSet rs=dbrw.selectData();
		/*try {
			System.out.println(rs.next());
		} catch (SQLException e) {
			System.out.println("ERR ResultSet 조회 실패 오류"+e.getMessage());
		}
		//dbrw.insertData(lines);//DBReadWriteClass가 가지고 있는 메소드를 호출*/
		
		frwc.createHTML(rs);

		
	}
}
