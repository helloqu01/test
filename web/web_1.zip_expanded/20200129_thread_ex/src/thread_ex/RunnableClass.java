package thread_ex;

public class RunnableClass implements Runnable{

	public RunnableClass (){
		
	}
	
	
	
	
	

	@Override
		public void run(){//runnable �������̽��� ���� ���� ������
			for(int i=0;i<20;i++){	
				try {
					Thread.sleep(1000);//����ó�� 1000=>1��
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("Runnable"+":"+i);
			}
		}
		
	

}
