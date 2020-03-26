package com.ohj.emp;

public class OperClass {//매소드를 저장하는 클래스
	
	public OperClass(){ // 기본생성자
	}

	public void avgHireDate(InfoClass[] ic){//평균을 구하는 메소드

		int sum=0; String hd; String[] s;

		for(int i=0;i<ic.length;i++){

			//String hd =dc.ic[0].hireData;
			//System.out.println(hd);
			hd =ic[i].hireData;
			//String[]s=hd.split("-");// 쪼개는 것 "2007-03-01"-> "2007","03","01"
			//System.out.println(s[0]);
			//System.out.println(s[1]);
			//System.out.println(s[2]);
			s=hd.split("-");
			//System.out.println(2020+s[0]);//숫자+문자=문자열
			//int y = Integer.parseInt(s[0]);//문자열로 되어있는 숫자를 숫자로 바꿔주는 것 ex) "2007"=>2007
			//System.out.println(2020-y); //숫자와 문자는 -를 할 수 없지만 문자를 숫자로 바꾸면 -를 할 수 있다.
			sum = sum+(2020-Integer.parseInt(s[0]));
		}//for ED

		//평균 재직연수를 구하라
		double avg = sum/(ic.length*1.0);
		System.out.println(avg);
	}
}