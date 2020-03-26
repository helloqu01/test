package com.db.hangul;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class DBReadWriteClass {
	private static Connection conn=null;//11�� ����̽��� ������ �����ϴٴ� ���� ������ �ִ�. �����ͺ��̽��� ���� �Ҷ� ���� �Ź� �ʿ��ϴ�.
	
	public DBReadWriteClass() {//�⺻ ������
	}
	//mySQL ����̹� �ε� �� db ���� �޼���
	public static void connectMySQL() {//12��
		try {
			Class.forName("com.mysql.jdbc.Driver");//13��  ����ó�� �ʿ�
			System.out.println("mysql ����̹� ����");//14��
			String url = "jdbc:mysql://localhost:3306/lms_db";//17�� mysql ����̹� ����
			conn=DriverManager.getConnection(url,"root","920424");//16�� ����ó�� �߰�
		} catch (ClassNotFoundException e) {
			System.out.println("mysql ����̹� ����"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("������ Ŀ��Ʈ ����"+e.getMessage());
		}
		
	}
	
	//������ ���� �޼���(insert into~)
	public static void dataInsert( ArrayList<String> lines) {//18��  ArrayList<String> lines�Է�
		//�������� ���� �ʿ� �������� void�� �����Ѵ�.
		
		String[] words = null;//19��
		words=lines.get(0).split(", ");//20��
		//System.out.println(words.length);//21�� �������� ������ Ȯ���Ѵ�
		//0			1				2	3	4	5
		//1292001, 900424-1825409, �豤��, 3, ����, 920
		String name = ChangeEncoding.toLatin(words[2]);//23��
		int y = Integer.parseInt(words[3]);
		String addr = ChangeEncoding.toLatin(words[4]);//24��
		
/**�Ʒ���insert���� ���ѹ��(���� ����ǥ ����)�� ����
 * �������ο� �����ͺκ� ������ ����� ��� (Ư�� ���ڿ� �κ�),
 * �������� �����ͺκ��� ?�� ó���� ��, ���߿� �޼ҵ带 ���Ͽ� 
 * ?��ġ�� �����͸� ���� �� �� �ִ�. 
 * **/		
		
		String queryInsert="insert into stu_table values ('"+words[0]+"','"+words[1]+"','"+name+"',"+y+",'"+addr+"','"+words[5]+"')";//25��
		String newQueryInsert="insert into stu_table values(?,?,?,?,?,?)";//34�� ?�� �����͸� �� �� �ִ�.
		//System.out.println(queryInsert);//26��//����Ǵ� ���� Ȯ�� insert into stu_table values('1292001','900424-1825409','��?������?',3,'������?','920')
		
		try {
			
			//Statement stmt = conn.createStatement();//27�� ����ó��
			PreparedStatement pstmt = conn.prepareStatement(newQueryInsert);//35�� ��ü�� ���� �ɶ� �̸� ������ �ִ�.
			pstmt.setString(1, words[0]);//36��
			pstmt.setString(2, words[1]);
			pstmt.setString(3, name);
			pstmt.setInt(4, y);
			pstmt.setString(5, addr);
			pstmt.setString(6, words[5]);
			//int n=stmt.executeUpdate(queryInsert);//29��
			int n=pstmt.executeUpdate();//37��	
			
			
			if(n>0){
					System.out.println("������ insert ����");//28��//�ѱ��� �� ���� �� Ȯ��
				}
			
		} catch (SQLException e) {
			System.out.println("������ insert ����"+e.getMessage());
		}
	}
	
	//��ü ������ ��ȸ �޼���(select*from~)
	public static void dataSelectAll() {
		String querySelect = "select*from stu_table";//30��
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(querySelect);//31��
			
			ResultSetMetaData rsmd = rs.getMetaData();//32��
			System.out.println("�ʵ� ����:"+rsmd.getColumnCount());
			
			for(int i=1;i<rsmd.getColumnCount()+1;i++){//33��
				System.out.println(rsmd.getColumnName(i)+"\t");//�̸���
				System.out.println(rsmd.getColumnTypeName(i));//Ÿ�Ը�
			}
			/*while(rs.next()){//32��
				System.out.println(rs.getString("stu_id")+"\t");
				System.out.println(rs.getString("stu_resident_id")+"\t");
				String name = ChangeEncoding.toUnicode(rs.getString("stu_name"));//�ѱ۷� �ٲٴ� ��
				System.out.println(name+"\t");
				System.out.println(rs.getInt("stu_years"));
				String addr= ChangeEncoding.toUnicode(rs.getString("stu_address"));//�ѱ۷� �ٲٴ� ��
				System.out.println(addr);
				System.out.println(rs.getString(" dept_id"+"\t"));
			}*/
			
		} catch (SQLException e) {
			System.out.println("������ Select ����"+e.getMessage());
		}
	}
	//�ֹι�ȣ�� ������ ��ȸ �޼���(select*from~where~)
	public static void dataSelectOne() {
		String querySelect = "select*from~where~";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(querySelect);
		} catch (SQLException e) {
			System.out.println("������ Select ����"+e.getMessage());
		}
			
	}
	
	//��ü ������ ���� �޼���(delete from~)
	public static void dataDeleteAll() {
	}
	//�ֹι�ȣ ������ ���� �޼���(delete from~where~)
	public static void dataDeleteOne() {
	}
	//��� ������ ���� �޼���(update~set~)
	public static void dataUpdateAll() {
	}
	//�ֹι�ȣ�� ������ ���� �޼���(update~set~where)
	public static void dataUpdateOne() {
	}
}
