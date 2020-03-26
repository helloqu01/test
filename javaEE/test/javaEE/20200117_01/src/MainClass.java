import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		String url_pop = "c:/Filetest/population_in_Seoul_edit.txt";
		
		ArrayList<String> line= FileReadWriteClass.readFileLines(url_pop);//한줄 읽어지는지 확인 종로구,72654 ,75611 ,77978 ,4064 ,5167 ,2.11,25425 
		
		//System.out.println(line.size());//12줄로 확인
		
		DBReadWriteClass.connectMySQL();//로그인
		
		DBReadWriteClass.dataInsert(line);// 조각 확인
		
	}
}
