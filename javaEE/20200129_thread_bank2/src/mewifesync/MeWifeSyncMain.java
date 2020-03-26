package mewifesync;

public class MeWifeSyncMain {
	
	public static Bank myBank = new Bank();//은행업무개시//5번 
		
	
	

	public static void main(String[] args) {
		System.out.println("����:"+myBank.getMoney());//5번 
		Mesync m = new Mesync();//8번 
		wifesync w = new wifesync();//9번 
		m.start();
		
		try {
			Thread.sleep(200);// 0.2초에 도착 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		w.start();
	}

}
