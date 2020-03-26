package com.ohj.array;

import java.util.ArrayList;

public class DataClass {
	ArrayList<EmployeeClass> empArr = new ArrayList<EmployeeClass>();//임포트 해줘야 함
	
	
	public DataClass(){
		empArr.add(new EmployeeClass(1001, "송민호", "사원", "2007-03-01", 300, 0, 20));
		empArr.add(new EmployeeClass(1002, "이영민", "대리", "2007-04-02", 250, 80, 30));
		empArr.add(new EmployeeClass(1003, "김민우", "과장", "2005-02-10", 500, 100, 30));
		empArr.add(new EmployeeClass(1004, "장희재", "부장", "2003-09-02", 600, 0, 20));
		empArr.add(new EmployeeClass(1005, "오종호", "과장", "2005-04-07", 450, 200, 30));
		
		empArr.add(new EmployeeClass(1006, "최형우", "부장", "2003-10-09", 480, 0, 30));
		empArr.add(new EmployeeClass(1007, "윤가람", "부장", "2004-01-08", 520, 0, 10));
		empArr.add(new EmployeeClass());
	}
	
}
