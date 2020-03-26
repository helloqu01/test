package mewifesync.ohj;

public class Mesync extends Thread{//6번
	public Mesync() {

	}
	
	public void run() {
		synchronized (MeWifeSyncMain.myBank) {//10번//synchronized 동기화 작업
			MeWifeSyncMain.myBank.saveMoney(3000);//입금 처리 시간 3초
		}
		System.out.println("saveMoney(3000):"+MeWifeSyncMain.myBank.getMoney());

	}


}
