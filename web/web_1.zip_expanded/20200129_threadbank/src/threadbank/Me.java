package threadbank;

public class Me extends Thread{//6��
	public Me() {

	}
	
	public void run() {
		NotSyncMain.myBank.saveMoney(3000);//�Ա� ó�� �ð� 3��
		System.out.println("saveMoney(3000):"+NotSyncMain.myBank.getMoney());

	}


}
