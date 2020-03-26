package sync.ohj;

public class Me extends Thread{//6번 
	public Me() {

	}
	
	public void run() {
		SyncMain.myBank.saveMoney(3000);//입금처리시간 3초 
		System.out.println("saveMoney(3000):"+SyncMain.myBank.getMoney());

	}


}
