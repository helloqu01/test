package sync.ohj;

public class BankSync {//4번
	private int money =  100000;//예금잔액
	
	public int getMoney(){
		return this.money;// 잔액 조회
	}
	
	public void setMoney(int money){ //입출금 결과에 따른 잔액 변ㄱㅇ
		this.money =  money;
		}
	
	public synchronized void saveMoney(int save){// synchronized 1방법
		int m= this.getMoney();
		
		try {
			Thread.sleep(3000);//입금처리 기간은 3초
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		this.saveMoney(m+save);//현잔액+입금액-> 잔액변경
	}
	
	public void minusMoney(int minus){//출금처리 메서드
		synchronized (this) {//this =minusMoney synchronized 2방법
			int m= this.money;
			
			try {
				Thread.sleep(200);// 출금 처리 기간은 0.2초
			} catch (InterruptedException e) {
							e.printStackTrace();
			}
			this.saveMoney(m - minus); //현 잔액 - 출금액=> 잔액변경
		}
		
	}
	
	

}
