package mewifesync.ohj;

public class wifesync  extends Thread{//7번
	
	public wifesync (){

	}

	public void run() {
		synchronized (MeWifeSyncMain.myBank){
			MeWifeSyncMain.myBank.minusMoney(1000);//출금 처리 시간 0.2초
		}
		
		System.out.println("minusMoney(1000):"+MeWifeSyncMain.myBank.getMoney());

	}


}
