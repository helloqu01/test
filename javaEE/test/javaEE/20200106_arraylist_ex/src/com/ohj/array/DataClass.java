package com.ohj.array;

import java.util.ArrayList;

public class DataClass {
	ArrayList<EmployeeClass> empArr = new ArrayList<EmployeeClass>();//����Ʈ ����� ��
	
	
	public DataClass(){
		empArr.add(new EmployeeClass(1001, "�۹�ȣ", "���", "2007-03-01", 300, 0, 20));
		empArr.add(new EmployeeClass(1002, "�̿���", "�븮", "2007-04-02", 250, 80, 30));
		empArr.add(new EmployeeClass(1003, "��ο�", "����", "2005-02-10", 500, 100, 30));
		empArr.add(new EmployeeClass(1004, "������", "����", "2003-09-02", 600, 0, 20));
		empArr.add(new EmployeeClass(1005, "����ȣ", "����", "2005-04-07", 450, 200, 30));
		
		empArr.add(new EmployeeClass(1006, "������", "����", "2003-10-09", 480, 0, 30));
		empArr.add(new EmployeeClass(1007, "������", "����", "2004-01-08", 520, 0, 10));
		empArr.add(new EmployeeClass());
	}
	
}
