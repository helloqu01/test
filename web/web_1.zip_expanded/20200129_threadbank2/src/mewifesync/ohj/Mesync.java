package mewifesync.ohj;

public class Mesync extends Thread{//6��
	public Mesync() {

	}
	
	public void run() {
		synchronized (MeWifeSyncMain.myBank) {//10��//synchronized ����ȭ �۾�
			MeWifeSyncMain.myBank.saveMoney(3000);//�Ա� ó�� �ð� 3��
		}
		System.out.println("saveMoney(3000):"+MeWifeSyncMain.myBank.getMoney());

	}


}
