package com.ohj.books;

public class MainClass {

	public static void main(String[] args) {
		DateClass dc = new DateClass();//����ŸŬ�������� �� �ԷµǾ����� Ȯ��2��°
		
		//dc�� �� å�� ������ ����(ic�迭)
		//int sum = dc.ic[0].price+dc.ic[1].price;//�� å�� ������ ���ϱ�
		int sum=0;//��ü å �����ϱ�
		for(int i=0;i<dc.ic.length;i++){
			sum= sum+dc.ic[i].price;
		}
		System.out.println(sum);
		
		for(int i=0; i<dc.ic.length;i++){// ��ü ���� �����߿��� ���ǻ簡 ����� å�� ������ ���
			if(dc.ic[i].press.equals("���")){//����̶�� ���ڰ� ��Ȯ�� ���Ե� �ڷḸ ������ �´�.
				System.out.println(dc.ic[i].title);
			}
		}
		for(int i=0; i<dc.ic.length;i++){// ��ü ���� �����߿��� ���ǻ簡 ����� å�� ������ ���
			if(dc.ic[i].press.contains("���")){//����̶�� ���ڸ� �����ϴ� �ڷḦ ������ �´�.(contains)
				System.out.println(dc.ic[i].title);
			}
		}
	}

}
