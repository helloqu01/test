package threadbank;

public class Me extends Thread{//6번 
	public Me() {

	}
	
	public void run() {
		NotSyncMain.myBank.saveMoney(3000);//입금처리시간은 3초
		System.out.println("saveMoney(3000):"+NotSyncMain.myBank.getMoney());

	}


}
