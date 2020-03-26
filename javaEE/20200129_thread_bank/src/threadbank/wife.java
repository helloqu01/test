package threadbank;

public class wife  extends Thread{//7번 
	
	public wife (){

	}

	public void run() {
		NotSyncMain.myBank.minusMoney(1000);//츌금 처리 시간은 0.2초 
		System.out.println("minusMoney(1000):"+NotSyncMain.myBank.getMoney());

	}


}
