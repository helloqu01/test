package emp;

public class EMPClass { // Ŭ���� ����
	
	int[] age = {27,34,28,26,41,28,42,29,29,32};
	char[] gender = {'f','m','f','m','m','f','m','m','f','m'};
	int[] pay = {460,200,250,300,300,200,350,200,400,440};
	String[] code={"JP", "FR", "JP", "US", "CN", "DE", "KR", "JP", "DE","KR"};
	
	public EMPClass(){ // �⺻ ������ : ������ �̸��� Ŭ���� �̸��� ���ƾ��Ѵ�. void ���� ���� ���̸� �ȵȴ�.
		
		System.out.println("EMPClass ������ ����");
		
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// ������ �ȿ� ���� �ȵȴ�.
	public void Sum(int[] a,String str){//1��
		int s = 0;
		for(int i = 0; i<a.length; i++){
			s=s+a[i];
		}
		System.out.println(str+"�� ��"+ s);
	}
	
	
	public int sum_return(int[]a){//2��
		int s = 0;
		for(int i =0; i<a.length;i++){
			s=s+a[i];
		}
		return s;
	}
	
	public int[] test(){//3��
		int a = 10;
		int b = 20;
		int[] r = {a,b};
		return r;
	}
	
	public ResultDate test2(){//4��
		int a = 10;
		float b = 20;
		String s = "ABC"; 
		ResultDate rd = new ResultDate();//Ŭ������ ������༭ ������
		rd.r1=a;
		rd.r2=b;
		rd.r3=s;
		return rd;
		
	}
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void sum1(){ // �ż��� 1�� ����������� ������ ���� �ʴ� ��// ������ ����ϰ� �ʹٰ� ȣ�� ����� ��
		int n = 10+20;
		System.out.println("��:"+n);
	}
	
	
	
	public int sum2(){ // �ż��� 2��
		int n = 10+20;
		return n;
	}

	
	
	public void sum3(int a, int b){ //�ż��� 3��
		int n = a+b;
		System.out.println("���� ���� ���� �� :"+ n);
	}
	
	
	
	public double div(float f1,int a){ // �ż��� 4��
		double d = f1/a;
		return d;
	}


}














// ���� 1 ������ 400 �̻��� ����� �ο���

// ���� 2 ������ ������ ������� ���� ��

// ���� 3 ������ ������ ������� ���� �հ� ��տ���

// ���� 4 ���Ͽ� �ٹ��ϴ� ������� ��� �޿�