package com.ohj.emp;

public class DateClass {

	InfoClass[] ic =new InfoClass[14];
	public DateClass(){//외부로 부터 전달 받은 값을 나타냄

		//식별번호, 사원이름, 직책, 입사일, 급여, 성과급, 부서식별번호
		ic[0] = new InfoClass(1001, "송민호", "사원", "2007-03-01", 300, 0, 20);
		ic[1] = new InfoClass(1002, "이영민", "대리", "2007-04-02", 250, 80, 30);
		ic[2] = new InfoClass(1003, "김민우", "과장", "2005-02-10", 500, 100, 30);
		ic[3] = new InfoClass(1004, "장희재", "부장", "2003-09-02", 600, 0, 20);
		ic[4] = new InfoClass(1005, "오종호", "과장", "2005-04-07", 450, 200, 30);
		ic[5] = new InfoClass(1006, "최형우", "부장", "2003-10-09", 480, 0, 30);
		ic[6] = new InfoClass(1007, "윤가람", "부장", "2004-01-08", 520, 0, 10);
		ic[7] = new InfoClass(1008, "이명희", "차장", "2004-03-08", 500, 0, 30);
		ic[8] = new InfoClass(1009, "송종영", "사장", "1996-10-04",1000, 0, 20);
		ic[9] = new InfoClass(1010, "황영호", "과장", "2005-04-07", 500, 0, 10);
		ic[10] = new InfoClass(1011, "김현정", "사원", "2007-03-01", 280, 0, 30);
		ic[11] = new InfoClass(1012, "강정혜", "사원", "2007-08-09", 300, 0, 20);
		ic[12] = new InfoClass(1013, "박민훈", "부장", "2002-10-09", 560, 0, 20);
		ic[13] = new InfoClass(1014, "조인성", "사원", "2007-11-09", 250, 0, 10);

	}

}
