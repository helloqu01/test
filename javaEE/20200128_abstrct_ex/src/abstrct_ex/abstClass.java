package abstrct_ex;

public abstract class abstClass {

	int a =10;//멤버변수 
	
	static final int MAX = 100;//클래스 (static) 상수 (final)
	
	public abstClass (){//기본 생성자 
		
	}
	
	public void sum(){//일반메소드 선언 {} 가능 
		System.out.println(a+MAX);
	}
	
	public abstract double div(int a, int b); //추상메소드 선언 {}는 불가능 하다 
	
}
