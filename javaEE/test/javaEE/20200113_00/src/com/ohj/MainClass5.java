package com.ohj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass5 {

	public static void main(String[] args) {
		String driver_name="com.mysql.jdbc.Driver";
		String db_url="jdbc:mysql://localhost:3306/testdb";
		//ERR connect:Unknown database 'testdb6' �����ͺ��̽����� �� �� �Ǿ��� ���
		String dc_id="root";
		String db_pw="920424";
		//ERR connect:Access denied for user 'root'@'localhost' (using password: YES)��й�ȣ�� ���̵� �� �� �Է����� ���
		
		Connection conn=null;//java.sql ���� ������� ����޴� ��(���� �ڿ����� �� �ʿ�)
		
		try {
			Class.forName(driver_name); //1��° �ش� ����̹� �ε����ֱ�
			System.out.println(" mySQL Driver Load ����");
			
			conn=DriverManager.getConnection(db_url,dc_id,db_pw);//2��° ����̹��޴����� �����ּ�, ���̵�, ��й�ȣ�� ���� �α���
			System.out.println("DB ���� ����");//mysql���� �α����ؼ� �����ͺ��̽��� ����� �ش�.
			
			Statement stmt= conn.createStatement();//java.sql ����Ʈ ��Ų��. db����� ������ ��ü
			
			/*String insert = "insert into test values('abc','123')";//������ db ���
			int n=stmt.executeUpdate(insert);//db����� ���� �����ϴ� �޼ҵ�
			//������ ������ ������ ��ȯ.
			System.out.println(n+"�� �� �����߽��ϴ�.");
			
			String delete = "delete from test";
			int k = stmt.executeUpdate(delete);
			System.out.println(k+"���� ���� �߽��ϴ�.");*/
			
			/*//id�� ghi�� pw ���� 111�� ����
			//update���̺�� set �����ʵ�='���氪' where �˻��ʵ� = '�˻���'
			String update = "update test set pw ='111' where id='ghi'";
			int m = stmt.executeUpdate(update);
			System.out.println(m+"���� �����Ǿ����ϴ�.");*/
			
			/*//���̺� ������ ��ȸ(����)
			//selsct*from ���̺��
			String select = "select*from test";
			ResultSet rs = stmt.executeQuery(select);//executeQuery() ��ȯŸ��  ResultSet
			rs.next();//���� �ٷ� �������� ���������͸� �����ٷ� ���� / ���� �ٷ� �� �� ������ true
			System.out.println(rs.getString("id"));//re.get������Ÿ��("�ʵ��")
			rs.next();//���� �ٷ� ��������
			System.out.println(rs.getString("pw"));*/
			
			String select = "select*from test";
			ResultSet rs = stmt.executeQuery(select);//executeQuery()
			while(rs.next()){
				System.out.println(rs.getString("id"+"\t"));
				System.out.println(rs.getString("pw"));
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("ERR mySQL Driver Load:"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("ERR connect:"+e.getMessage());
		}
		
		
		
	}//main(String[] args) end

}//class MainClass5 end

//select �ʵ����Ʈ from ���̺��
//insert into ���̺�� (�ʵ����Ʈ) values(�����͸���Ʈ)
//delete from ���̺��

//ex)) select * from test <= test ���̺��� ��� ������ ��ȸ(����)
//		select id from test <== test ���̺��� ���̵� ���� ��ȸ
//select pw from test => test ���̺��� ����� ��ȸ
//select id,pw from test=>test ���̺� ���̵�� ����� ��ȸ

//insert into test (id) values('ccc')<= test���̺��� ���̵� �ʵ忡�� ccc���ڿ��� ����
//insert into test (pw) values('111')<= test���̺��� pw �ʵ忡�� ccc���ڿ��� ����
//insert into test (id,pw) values('dd','11')<= test���̺��� ���̵�,��� �ʵ� dd,11���ڿ��� ����

//insert into test (pw,id) values('22','ee')<= test���̺��� ���̵�,��� �ʵ� '22','ee'���ڿ��� ����
//insert into test values('22','ee')<= test���̺� ������ ������ �ʵ� ������� ������ ����

//delete from test <- ��� ���̺� ������ ����

