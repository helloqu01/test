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

	public FileReadWriteClass() {
	}

	// �ܺ� txt ������ �� ������ �о ArrayList�� ��ȯ�ϴ� �żҵ�
	public ArrayList<String> readTextLine(String uri) {
		ArrayList<String> lines = new ArrayList<String>();// add��ų ArrayList
		try {
			FileReader fr = new FileReader(uri);
			BufferedReader br = new BufferedReader(fr);// �� �� ������ �о��ִ� Ŭ����

			while (true) {// ���ѹݺ�
				String line = br.readLine();// ������ �� �� �д� ��
				if (line == null) {
					return lines;
				}
				// System.out.println(line);
				lines.add(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ERR readTextLine File ����� ����" + e.getMessage());

		} catch (IOException e) {
			System.out.println("ERR readTextLine ���� br.readLine();����" + e.getMessage());
		}
		return lines;// try ������ ������ �Ϸ� �Ǹ� ������� ������ ArrayList<String> lines = new
						// ArrayList<String>();�� �ۿ��ٰ� ���ش�.
	}

	public void createHTML(ResultSet rs) {
		String url = "c:/filetest/news.html";
		try {
			FileWriter fw = new FileWriter(url);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("<html>");
			bw.write("<head><title>naver news</head></title>");
			bw.write("<body>");
			bw.write("<table border=1>");
			bw.write("<tr><th>image</th><th>URL</th></tr>");

			while (rs.next()) {
				bw.write("<tr>");
				bw.write("<td><img src=./newsimages/" + rs.getString("imgname") + "></td>");
				
				bw.write("<td><a href=" + rs.getString("urlname") +">"+ rs.getString("urlname")+"</a></td>");
				bw.write("</tr>");
			}
			bw.write("</table>");
			bw.write("</body>");
			bw.write("</html>");
			bw.close();
		} catch (IOException e) {
			System.out.println("ERR FileWriter ����� ����" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("ERR ResultSet ������ ����" + e.getMessage());
		}

	}

}

