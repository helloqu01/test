import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReadWriteClass {
	public FileReadWriteClass() {
	}
	
	public ArrayList<String> readTextLine(String uri)//2
	{
		ArrayList<String> lines = new ArrayList<String>();//5 add시킬 ArrayList
		try {
			FileReader fr = new FileReader(uri);//3
			BufferedReader br = new BufferedReader(fr);//4 BufferedReader 한 줄 통째로 입력 받는 방법
			
			while(true){//6
				String line = br.readLine();
				if(line==null){
					return lines;
				}
				lines.add(line);//7
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일리더 오류"+e.getMessage());
		} catch (IOException e) {

			System.out.println("리드라인 오류");
		}
		
		return null;
	}
}
