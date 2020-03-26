package com.ohj.classes;

public class TestClass {
	// 사람의 정보를 넣어주는 클래스
	// 전체 데이터를 보관하는 배열
	InfoClass[] ic = new InfoClass[10];// 10개의 방을 만든다.

//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public TestClass() {
		ic[0]=new InfoClass(  "A"   ,    28  ,               "KR" ,         1  ,      "정규");
		ic[1]=new InfoClass( "B"   ,    31  ,               "JP"  ,        3  ,     "비정규");
		ic[2]=new InfoClass(   "C"   ,    28  ,               "JP"  ,        1  ,      "정규");
		ic[3]=new InfoClass(  "D"  ,     29 ,                "KR"  ,        2  ,      "정규");
		ic[4]=new InfoClass( "E"   ,    28 ,                "US"  ,        2  ,     "비정규");
		ic[5]=new InfoClass( "F"   ,    32  ,               "US"  ,        5  ,      "정규");
		ic[6]=new InfoClass(  "G"  ,     28  ,               "KR" ,         1  ,     "비정규");
		ic[7]=new InfoClass(  "H"  ,     29  ,              "EU"  ,        2   ,    "비정규");
		ic[8]=new InfoClass(  "I"   ,    33  ,               "EU"  ,        6  ,      "정규");
		ic[9]=new InfoClass( "J"   ,    28  ,               "KR"  ,        1  ,     "비정규");
		
		// InfoClass ic2 = new InfoClass( "A",28, "KR", 1, "정규");
		// 생성자 내부에서 불러옴(info에서 가져옴)salaryOperator();
	}	
///////////////////////밖에 선언 하기!!!!!!!!///////////////////////////////////////////////////////////
	public int[] total() {
		// 전 사원의 총 수입 배열(총 수입 = 총 연봉+총 생활비)
		int[] totalArray = new int[10];

		for (int i = 0; i < ic.length; i++) {// 전사원
			// 근무 (재직)기간 내의 총 생활비 변수(월 생활비*12*재직년수)
			int costOfliving = 0;

			// 근무 (재직)기간 내의 총 연봉 변수(연봉*재직년수)
			int total = 0;

			total = ic[i].salary * ic[i].years;

			if (ic[i].local.equals("US")) {
				costOfliving = 70 * 12 * ic[i].years;
			}

			if (ic[i].local.equals("JP")) {
				costOfliving = 50 * 12 * ic[i].years;
			}

			if (ic[i].local.equals("EU")) {
				costOfliving = 100 * 12 * ic[i].years;

			}

			totalArray[i] = total + costOfliving;

		                                   }

		return totalArray;
	}

}// TestClass END
