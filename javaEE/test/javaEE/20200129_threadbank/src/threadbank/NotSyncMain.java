package threadbank;

public class NotSyncMain {
	
	public static Bank myBank = new Bank();//은행업무개시//5번
		
	
	

	public static void main(String[] args) {
		System.out.println("원금:"+myBank.getMoney());//5번
		Me m = new Me();//8번
		wife w = new wife();//9번
		m.start();
		
		try {
			Thread.sleep(200);// 0.2초에 도착
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		w.start();
	}

}
