package mewifesync.ohj;

public class MeWifeSyncMain {
	
	public static Bank myBank = new Bank();//�����������//5��
		
	
	

	public static void main(String[] args) {
		System.out.println("����:"+myBank.getMoney());//5��
		Mesync m = new Mesync();//8��
		wifesync w = new wifesync();//9��
		m.start();
		
		try {
			Thread.sleep(200);// 0.2�ʿ� ����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		w.start();
	}

}
