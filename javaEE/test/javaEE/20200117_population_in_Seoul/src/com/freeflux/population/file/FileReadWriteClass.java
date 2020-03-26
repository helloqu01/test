package com.freeflux.population.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FileReadWriteClass {
	public FileReadWriteClass (){
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
	
	public static void HtmlClass(ResultSet rs){
		String url = "c:/filetest/coutable.html";
		FileWriter fw;
		try {
			fw = new FileWriter(url);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("<html>");
			bw.newLine();
			bw.write("<head><title>course_data</title></head>");
			bw.newLine();
			bw.write("</body>");
			bw.newLine();
			bw.write("<table border=1>");
			bw.write("<tr><th>classcode</th><th>subject</th><th>hour</th></tr>");
			while(rs.next()){
				bw.write("<tr>");
				bw.write("<td><a>"+rs.getString("classcode")+"</a></td>");
				bw.write("<td><a>"+rs.getString("subject")+"</a></td>");
				bw.write("<td><a>"+rs.getString("hour")+"</a></td>");
				bw.write("</tr>");
			}
			
			bw.newLine();
			bw.write("</body>");
			bw.newLine();
			bw.write("</html>");
			bw.close();
			
		} catch (IOException e) {
			System.out.println("���ϸ��� ����"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("rs.next"+e.getMessage());
		}
		
	}
	

}
