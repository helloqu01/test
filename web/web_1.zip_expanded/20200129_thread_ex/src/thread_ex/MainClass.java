package thread_ex;

public class MainClass {

	public static void main(String[] args) {//실제 주(메인) 스레드(일종의 독립 프로세스)

		System.out.println("main() 스레드 시작");
		
		RunnableClass r = new RunnableClass();
		Thread t1 = new Thread(r);
		t1.start();
		
		
		//ThreadClass t1=  new ThreadClass("t1");// 순차적으로 실행 되지않고 각자 방향으로 실행된다.
		//t1.start();// t1의 run()구동
		//ThreadClass t2=  new ThreadClass("t2");
		//t2.start();// t2의 run()구동
		//try {//예외처리
		//	t1.join();// t1과 t2가 일을 마친 다음에 
		//	t2.join();// t1과 t2가 일을 마친 다음에 
		//} catch (InterruptedException e) {
		//	System.out.println(e.getMessage());
		//}
		
		//FakeThread f1=  new FakeThread ("f1");// 가짜 스레드이기 때문에 순차적으로 시작된다.
		//f1.start();

		//FakeThread f2=  new FakeThread ("f2");
		//f2.start();
		
		
		System.out.println("main() 스레드 종료");
		
	}

}
