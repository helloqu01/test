package thread_ex;

public class ThreadClass extends Thread {//��Ʈ�� Ű + Thread  Ŭ���ϸ� Thread.class�� ���´�.
	
	String name= null;
	
	
	public ThreadClass () {// �⺻������
	}
	
	public ThreadClass (String n) {// �ܺΰ��� ���� �޴� ������(ThreadClass t1=  new ThreadClass("t1");)
		this.name=n;
	}
	
	// �ݵ�� run()�� �ʿ�
	public void run(){// ���� ������ (Thread�κ��� ��� ���� �żҵ�)
		for(int i=0;i<50;i++){	//���� ���� ���� ������
			System.out.println(name+":"+i);//0~49���� ���
		}
	}
	
	
	
	
	
	
	
	
	
	
	

	  /* // �Ʒ� �����ڵ��� Overloading�� �����ڵ�
	   
	   public ThreadClass(Runnable target) {
	      super(target);
	      // Runnable �������̽��� �������� ��ü�� ���� �޴� ������
	   }

	   public ThreadClass(String name) {
	      super(name);
	      // ������ �̸��� ���� �޴� ������
	   }

	   public ThreadClass(ThreadGroup group, Runnable target) {
	      super(group, target);
	      // ������ �׷�� Runnable �������̽��� �����޴� ��ü�� ���޹޴� ������
	   }

	   public ThreadClass(ThreadGroup group, String name) {
	      super(group, name);
	      // ������ �׷�� ������ �̸��� ���� �޴� ������
	   }

	   public ThreadClass(Runnable target, String name) {
	      super(target, name);
	      // Runnable �������̽��� �����޴� ��ü�� ������ �̸��� ���޹޴� ������
	   }

	   public ThreadClass(ThreadGroup group, Runnable target, String name) {
	      super(group, target, name);
	      // ������ �׷�� Runnable �������̽��� �����޴� ��ü, ������ �̸��� ���޹޴� ������
	   }

	   public ThreadClass(ThreadGroup group, Runnable target, String name, long stackSize) {
	      super(group, target, name, stackSize);
	      // ������ �׷�� Runnable �������̽��� �����޴� ��ü, ������ �̸�
	      // �۾��� �ʿ��� �޸� (����) ũ�⸦ ���޹޴� ������
	   }*/
}
