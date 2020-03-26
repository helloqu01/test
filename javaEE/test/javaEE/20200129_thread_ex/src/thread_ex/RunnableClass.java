package thread_ex;

public class RunnableClass implements Runnable{

	public RunnableClass (){
		
	}
	
	
	
	
	

	@Override
		public void run(){//runnable 인터페이스에 의해 강제 재정의
			for(int i=0;i<20;i++){	
				try {
					Thread.sleep(1000);//예외처리 1000=>1초
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("Runnable"+":"+i);
			}
		}
		
	

}
