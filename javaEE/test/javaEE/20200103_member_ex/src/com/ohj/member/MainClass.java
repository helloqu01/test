package com.ohj.member;

import java.util.ArrayList;//�ܺ�Ŭ������ �������� �� JRE
import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		
//���� �ڵ�//////////////////////////////////////////////////////
		ArrayList lottoNumber = new ArrayList();
		for(int i=0; i<46;i++){
			lottoNumber.add(i);
		}
		
		Random rnd =  new Random();//������ ������ ���� ��ü
		ArrayList sixNumber=new ArrayList();//������ �� 6�� ����
		for(int i=0; i<6;i++){//�ߺ������ʴ� ������ �� 6�� ����
			int index = rnd.nextInt(lottoNumber.size());
			Object n = lottoNumber.remove(index);
			sixNumber.add(n);
		}
		
		for(int i=0; i<sixNumber.size();i++){//����� 6�� ���� ���
			System.out.println(sixNumber.get(i)+",");
		}
		
//////////////////////////////////////////////////////////////		
		
		/*ArrayList lottoNumber = new ArrayList();
		for(int i=0; i<46;i++){
			lottoNumber.add(i);
		}
		
		//lottNember[0]=>1   0�� �濡�� 1��
		//lottNember[1]=>2   1�� �濡�� 2��
		//lottNember[44]=>45 44�� �濡�� 45��
		
		Random rnd =  new Random();
		int index = rnd.nextInt(lottoNumber.size());//-> ������� 45�� 
		//lottoNumber.size()->45
		//rnd.nextInt(lottoNumber.size())=> 0~44
		
		Object n = lottoNumber.remove(index);//�ߺ����� get�� �ƴϰ� remove�� ���� ����
		System.out.println(n);
		System.out.println(lottoNumber.size());
		
		index = rnd.nextInt(lottoNumber.size());
		n = lottoNumber.remove(index);//�ߺ����� get�� �ƴϰ� remove�� ���� ����
		System.out.println(n);
		System.out.println(lottoNumber.size());*/
		
	}

}
