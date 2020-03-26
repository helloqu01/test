package thread_ex;

public class FakeThread {
	
	String name = null;
	
	public FakeThread (){
	}
	public FakeThread (String n){
		this.name=n;
	}
	public void run(){
		for(int i=0;i<50;i++){	
			System.out.println(name+":"+i);
		}
	}
	
	public void start(){
		run();
	}
}
