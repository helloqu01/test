package abstrct_ex;

public abstract class abstClass {

	int a =10;//�������
	
	static final int MAX = 100;//Ŭ����(static) ���(final)
	
	public abstClass (){//�⺻������
		
	}
	
	public void sum(){// �Ϲݸ޼ҵ� ����{}����
		System.out.println(a+MAX);
	}
	
	public abstract double div(int a, int b); // �߻� �ż��� ����/{} �Ұ����ϴ�.
	
}
