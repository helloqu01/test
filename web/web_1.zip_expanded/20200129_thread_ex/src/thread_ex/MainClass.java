package thread_ex;

public class MainClass {

	public static void main(String[] args) {//���� ��(����) ������(������ ���� ���μ���)

		System.out.println("main() ������ ����");
		
		RunnableClass r = new RunnableClass();
		Thread t1 = new Thread(r);
		t1.start();
		
		
		//ThreadClass t1=  new ThreadClass("t1");// ���������� ���� �����ʰ� ���� �������� ����ȴ�.
		//t1.start();// t1�� run()����
		//ThreadClass t2=  new ThreadClass("t2");
		//t2.start();// t2�� run()����
		//try {//����ó��
		//	t1.join();// t1�� t2�� ���� ��ģ ������ 
		//	t2.join();// t1�� t2�� ���� ��ģ ������ 
		//} catch (InterruptedException e) {
		//	System.out.println(e.getMessage());
		//}
		
		//FakeThread f1=  new FakeThread ("f1");// ��¥ �������̱� ������ ���������� ���۵ȴ�.
		//f1.start();

		//FakeThread f2=  new FakeThread ("f2");
		//f2.start();
		
		
		System.out.println("main() ������ ����");
		
	}

}
