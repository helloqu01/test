package com.ohj.emp;

public class EMPClass { // 클래스 선언
	int[] age = { 27, 34, 28, 26, 41, 28, 42, 29, 29, 32 };
	char[] gender = { 'f', 'm', 'f', 'm', 'm', 'f', 'm', 'm', 'f', 'm' };
	int[] pay = { 460, 200, 250, 300, 300, 200, 350, 200, 400, 440 };
	String[] code = { "JP", "FR", "JP", "US", "CN", "DE", "KR", "JP", "DE", "KR" };
	/**1. 나이,성별, 급여, 나라 별 값을 배열로 선언해준다. ***/
	
	public EMPClass() { // 기본 생성자 : 생성자 이름은 클래스 이름과 같아야한다. void 같은 것을 붙이면 안된다.
		System.out.println("EMPClass 생성자 내부");
		}

// 생성자 안에 들어가면 안된다.

	public void Sum(int[] a, String str) {// 2. 1번 : 배열 형태의 값과 스트링 형태의 값을 매개변수로 받는다.
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s = s + a[i];
		}
		System.out.println(str + "의 합" + s);
	}// 섬 메소드 끝 

	public int sum_return(int[] a) {// 2번
		int s = 0;
		for (int i = 0; i < a.length; i++) {
				s = s + a[i];
			}

		return s;

	}

	public int[] test() {// 3번
		int a = 10;
		int b = 20;
		int[] r = { a, b };
		return r;
	}

	public ResultDate test2() {// 4번 test2 를 불러오려면 ResultDate test2로 불러줘야한다. 
		int a = 10;
		float b = 20;
		String s = "ABC";
		
		ResultDate rd = new ResultDate();// 클래스를 만들어줘서 가져옴

		rd.r1 = a;
		rd.r2 = b;
		rd.r3 = s;

		return rd;

	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void sum1() { // 매서드 1번 만들어지지만 실행은 되지 않는 것// 누군가 사용하고 싶다고 호출 해줘야 함
		int n = 10 + 20;
		System.out.println("합:" + n);
	}

	public int sum2() { // 매서드 2번
		int n = 10 + 20;
		return n;
	}

	public void sum3(int a, int b){ //매서드 3번
		int n = a+b;
		System.out.println("전달 받은 값의 합 :"+ n);
	}

	public double div(float f1,int a){ // 매서드 4번
		double d = f1/a;
		return d;
		}
}
// 문제 1 월급이 400 이상인 사람의 인원수
// 문제 2 성별이 여자인 사람들의 월급 합
// 문제 3 성별이 여자인 사람들의 월급 합과 평균연령
// 문제 4 독일에 근무하는 사원들의 평균 급여