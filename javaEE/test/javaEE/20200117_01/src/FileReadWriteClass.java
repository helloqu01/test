import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReadWriteClass {

	public FileReadWriteClass() {
	}
	
	/**�ܺ� �ؽ�Ʈ ������ �ٴ� ���� �д� �޼���
	 * ��ü ������ �Է�
	 * @return **/
	public static ArrayList<String> readFileLines(String url){
		ArrayList<String> lines = new ArrayList<String>();
		try {
			FileReader fr = new FileReader(url);
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			
			String line = null;
			while(true){
			line = br.readLine(); // �� �� ����
			if(line==null){//null ���� �Ǳ� ������
				return lines; //����� �����͸� ������
			}
				lines.add(line);//����
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("ERR FileReader ���� " +e.getMessage());
		} catch (IOException e) {
			System.out.println("br.readLine()"+e.getMessage());
		}
		return lines;
		
	}
}
