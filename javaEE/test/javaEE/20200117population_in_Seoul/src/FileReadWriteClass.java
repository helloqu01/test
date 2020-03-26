import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReadWriteClass {

	public FileReadWriteClass() {
	}
	
	/**외부 텍스트 파일을 줄단 위로 읽는 메서드
	 * 전체 데이터 입력
	 * @return **/
	public static ArrayList<String> readFileLines(String url){
		ArrayList<String> lines = new ArrayList<String>();
		try {
			FileReader fr = new FileReader(url);
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			
			String line = null;
			while(true){
			line = br.readLine(); // 한 줄 저장
			if(line==null){//null 값이 되기 전까지
				return lines; //저장된 데이터를 보내라
			}
				lines.add(line);//저장
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("ERR FileReader 에러 " +e.getMessage());
		} catch (IOException e) {
			System.out.println("br.readLine()"+e.getMessage());
		}
		return lines;
		
	}
}
