import java.sql.ResultSet;

public class MainClass {
	public static void main(String[] args) {
		String uri = "c:/filetest/crime_in_Seoul_final.txt";//1
		
		FileReadWriteClass frwc = new FileReadWriteClass();
		DBReadWriteClass dbrw = new DBReadWriteClass();
		ResultSet rs=dbrw.selectData();
		
		
		
	}
}
