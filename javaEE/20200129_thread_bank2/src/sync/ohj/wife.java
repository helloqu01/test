package sync.ohj;

public class wife  extends Thread{//7번 
	
	public wife (){

	}

	public void run() {
		SyncMain.myBank.minusMoney(1000);//출금 처리시간 0.2초 
		System.out.println("minusMoney(1000):"+SyncMain.myBank.getMoney());

	}


}
