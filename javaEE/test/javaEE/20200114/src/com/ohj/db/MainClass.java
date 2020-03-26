package com.ohj.db;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MainClass {

	public static void main(String[] args) {
		DBClass dbc=new DBClass();
		//���� ���� ��ġ
		
		dbc.dbconnect();
		//��ü ������ ��ȸ�ϴ� �޼ҵ� ȣ��
		ResultSet rs =dbc.select();
		
	
		
		String uri = "c:/filetest/table.html";
		//�����ͺ��̽��� �����ϴ� �޼ҵ� ȣ��
		try {
			FileWriter fw =  new FileWriter (uri);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("<html>");
			bw.newLine();
			bw.write("<head>");
			bw.newLine();
			bw.write("<title>table</title>");
			bw.newLine();
			bw.write("</head>");
			bw.newLine();
			bw.write("<body>");
			bw.newLine();
			bw.write("<table border=1>");
			bw.newLine();
			bw.write("<tr><th>name</th><th>age</th><th>local</th><th>years</th><th>worker</th></tr>");
			try {
				while(rs.next()){//MYSQL���� ������ �ҷ��´�.(rs�� �������� ���� ���� ���� �޴� �Ű�����) ���� �ݺ������� ������ �κ�
					bw.write("<tr>");
					bw.write("<td>"+rs.getString("name")+"</td>");
					bw.write("<td>"+rs.getInt("age")+"</td>");
					bw.write("<td>"+rs.getString("local")+"</td>");
					bw.write("<td>"+rs.getInt("years")+"</td>");
					bw.write("<td>"+rs.getBoolean("worker")+"</td>");
					bw.write("</tr>");
					bw.newLine();
				}
			} catch (SQLException e) {
				System.out.println("����:"+e.getMessage());
			}
			bw.write("</table>");
			bw.write("</body>");
			bw.write("</html>");
			bw.close();//����ǰ� ������ ������.
		} catch (IOException e) {
			
		System.out.println("����"+e.getMessage());
		}

	}

}


/*1. mysql �����ͺ��̽��� ���� �� �� �ִ� jdbc ����̹� �ε�
1-1 mysql-connector-java-5.1.18-bin ������ ���� �۾����� ������Ʈ�� ���� bulid path �޴��� ���
1-2 Class.forName("����̹��̸�")�� �̿��Ͽ� ���� ����̹� �̸��� ����
2.����̹����� �����ϴ� Ŭ������ �ż��带 �̿��Ͽ� �����ͺ��̽��� ����(�����ͺ��̽� �ּ�/�����ͺ��̽���, ���Ӿ��̵�, ���Ӻ�й�ȣ�ʿ�)
����̹����� �����ϴ� Ŭ����:DriverManager.class
�ż��� : getConnection("�ּ�/db�̸�","���̵�","��й�ȣ")
DriverManager.getCinnection("�ּ�/db�̸�","���̵�","��й�ȣ")

***���� 1,2���� �ݵ�� ����ó���� �ʿ�***
1.ClassNotFoundException
2.AQLException
������ ���� Ŭ���� : DBClass�� dbConnect()���ο��� ó��*/


/*/�۾� 2. ���� �۾� 1�� ���������� ������ ��쿡�� �ش�.
 1. ���̺��� ��ü �����͸� ��ȸ : select*from emp_table
 2.�����ͺ����� ���̺� ������ ��ȸ�� ������ �����ϴ� �޼ҵ� �ʿ�
 2-1.������ ������ �� �ִ� �޼ҵ带 �����ϴ� Ŭ���� :  Statement.class
 	Statement Ŭ������ new�� �̿��Ͽ� ��ü������ �Ұ����ϰ�, �ݵ�� ���Ӽ����� ����� ������ �ִ� Connection ��ü�� ���Ͽ� ����
 	Statement stmt = conn.createStatement();
 
 2-1 ���� �� ��ȸ�ϴ� ������ �����ϴ� �޼ҵ� : executeQuery("������");
 	executeQuery()�� �ݵ�� ������� ResultSet ��ü�� ��ȯ
 	ResultSet rs = null;
 	rs = stmt.executeQuery(selectQuery);
 	
 ����, �����͸� ���� : delete from emo_table where name = 'AA';
 	�����͸� ����:update emp_table set name = 'SSSS' where age=10;
 	�����͸� �߰�: insert into emp_table values("AA",~~~);
 �̿� ���� ������ ������ ��� �ʿ��� �޼��� : executeUpdate("��������")
 executeUpdate()�޼ҵ�� ������ ���(���� Ƚ��)�� ������ ��ȯ
 int n = stmt.executeUpdate("��������");
 ============================================
 
 �۾� 3.��ȸ�� �����͸� HTML�� �ٲٴ� ��
 	1.���� ������ ������ ���� ���ο� HTML�ڵ带 ���´�.
 	1-1.���� ���ο� ���� �� �� �ִ� Ŭ����: FileWriter.Class
 		String uri = "c:/filetest/table.html";
 		FileWriter fw =  new FileWriter (uri);
 		or
 		FileWriter fw =  new FileWriter ("c:/filetest/table.html");
 		new �̿��Ͽ� ��ü ��������
 		��, ������ ���ϸ�, ��ΰ� �ݵ�� �ʿ�.
 	1-2. �� ������ ���� ���� ���ؼ� �ʿ��� Ŭ���� : BufferedWriter.class
 		BufferedWriter bw = new BufferedWriter(fw);	
 		new �̿��Ͽ� ��ü �������� 
 		��, ������ ���� ���� ��ü�� �ʿ�.
 		
 	1-3. ���� ���Ͽ� ���� ���� �޼��� : bw.write("��������");
 	1-4. ���� �ٲ��ִ� �޼��� : bw.nextLine();
 
 ===================================================
 HTML: �������� ���� ������ ǥ���� �� �ִ� ���
 1.HTML ����
<html>
 
 <head>
 		<title>�������� �ǿ� �������� ����</title>
 </head>
 
 <body>
 	�������� ���ο� �������� ����
 </body>
 
</html>
 
 1-3. ǥ���·� ǥ���� ���:<body>�� �����ٰ� ���´�.</body>
 	
 1-3-1.ǥ
 	<table>
 	</table>
 1-3-2.ǥ���ο� �� �� : <table>�̰����ٰ� ���´�.</table>
 	<tr>
 	</tr>
 	
 1-3-3 �� ���� ��ĭ : <tr>�̰� ���̿� ���´�.</tr>
 ����ǥ��
 <th>����</th>
 ������ǥ��
 <td>������</td>	
 	
 	
 	
 */