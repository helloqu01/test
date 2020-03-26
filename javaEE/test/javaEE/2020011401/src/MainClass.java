import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainClass {

	public static void main(String[] args) {
		DBClass dbc = new DBClass();
		dbc.dbconnect();
		String uri = "c://filetest/newstable.html";
		ResultSet rs = dbc.select();
		
		try {
			FileWriter fw = new FileWriter(uri);
			BufferedWriter bw= new BufferedWriter(fw);
			
			bw.write("<html>");
			bw.newLine();
			bw.write("<head>");
			bw.newLine();
			bw.write("<title>newstable</title>");
			bw.newLine();
			bw.write("</head>");
			bw.newLine();
			bw.write("<body>");
			bw.newLine();
			bw.write("<table border=1>");
			bw.newLine();
			try {
				while(rs.next()){
					bw.write("<tr>");
					bw.write("<td>"+rs.getString("name")+"</td>");
					bw.write("<td>"+rs.getString("pic")+"</td>");
					bw.write("<td>"+rs.getString("site")+"</td>");
					bw.write("<td>"+rs.getString("topic")+"</td>");
					bw.write("</tr>");
				}
			} catch (SQLException e) {

				System.out.println("오류"+e.getMessage());
			}
			
			bw.newLine();
			bw.write("</table>");
			bw.write("</body>");
			bw.write("<html>");
		} catch (IOException e) {
			System.out.println("오류:"+e.getMessage());
		}
		

	}

}
