package sync.ohj;

public class SyncMain {
	
	public static BankSync myBank = new BankSync();//�����������//5��
		
	
	

	public static void main(String[] args) {
		System.out.println("����:"+myBank.getMoney());//5��
		Me m = new Me();//8��
		wife w = new wife();//9��
		m.start();
		
		try {
			Thread.sleep(200);// 0.2�ʿ� ����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		w.start();
	}

}
