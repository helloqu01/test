import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		String url_pop = "c:/Filetest/population_in_Seoul_edit.txt";
		
		ArrayList<String> line= FileReadWriteClass.readFileLines(url_pop);//���� �о������� Ȯ�� ���α�,72654 ,75611 ,77978 ,4064 ,5167 ,2.11,25425 
		
		//System.out.println(line.size());//12�ٷ� Ȯ��
		
		DBReadWriteClass.connectMySQL();//�α���
		
		DBReadWriteClass.dataInsert(line);// ���� Ȯ��
		
	}
}
