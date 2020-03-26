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
		ArrayList<String> lines = new ArrayList<String>();//5 add��ų ArrayList
		try {
			FileReader fr = new FileReader(uri);//3
			BufferedReader br = new BufferedReader(fr);//4 BufferedReader �� �� ��°�� �Է� �޴� ���
			
			while(true){//6
				String line = br.readLine();
				if(line==null){
					return lines;
				}
				lines.add(line);//7
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("���ϸ��� ����"+e.getMessage());
		} catch (IOException e) {

			System.out.println("������� ����");
		}
		
		return null;
	}
}
