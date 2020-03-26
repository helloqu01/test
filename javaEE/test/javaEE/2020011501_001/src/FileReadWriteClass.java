import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReadWriteClass {

	public FileReadWriteClass() {
	}
	
	public ArrayList<String>readTextLine(String uri){
		ArrayList<String> lines = new ArrayList<String>();
		try {
			FileReader fr = new FileReader(uri);
			BufferedReader br = new BufferedReader(fr);
			
			while(true){
				String line = br.readLine();
				if(line==null){
					return lines;
				}
			}
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
		return lines;
		
	}
}
