package com.ohj.string;

import java.util.ArrayList;

public class MainClass {//String�� ���� �ڼ��� ����

	public static void main(String[] args) {
		
		/* ���� 1. ���� str ������ �� "HTML5"�� "���̺긮���"��� �ܾ ��� ����Ǵ� ��
		      ���� Ƚ���� resultNum�̶�� �迭������ �����Ͽ� ���
		
		1.�˻�Ű���� ������ ���� String keyword1="HTML5";
							String keyword2="���̺긮���";
		2.��ü �����͸� ����("")�������� �и�
		String[] split = dc.newsList.get(0).news.split("");
		2-1. dc: DataClass dc = new DataClass()'
		2-2. newClass : ArrayList<NewsClass> newList = new ArratList<NewsList>();
		2-3. get(0) : ArrayList ���� �����͸� �����ϴ� �޼ҵ�(���� add()�� ��ü�� 1���̹Ƿ�)
		2-4 news: NewsClass ��ü�� ��� ����(�� ���� ����� ���ڿ��� ����)
		2-5. split("") :  ��ü ��翡 �ܾ���� ����� ���� �Ǿ� �����Ƿ�
		2-6 String[] split = :  String �� split()�� ��ȯ ���°� String �迭�̹Ƿ�
		3. Ű���带 ã�� ������ 1�� ���� ��ų �迭 ����,Ű���尡 �� ���̹Ƿ� �迭�� ũ��(����)�� �ΰ��� ���� �� 1�� �����ؾ��ϹǷ� �ʱⰪ�� 0���� ����
		resultNum[0]:"HTML5"�� ã�� ������ 1������(resultNum[0]++)==(resultNum[0]=resultNum[0]+1;)
		resultNum[1]:"���̺긮���"�� ã�� ������ 1������
		int[] resultNum={0,0};
		4.�и��� �ܾ��� Ű���带 �񱳰˻�
		for(int i=0;i<Spilit.length;i++{
			if(split[i].contains(keyword1)){//"HTML5"
			resultNum[0]++;
		}
		}
		for(int i=0;i<Spilit.length;i++{
			if(split[i].contains(keyword2)){//"���̺긮���"
			resultNum[1]++;
		}
		}
		5.�˻���� ���
		syso(keyword1+":"+resultNum[0]);
		syso(keyword2+":"+resultNum[1]);*/
		
			DataClass dc= new DataClass();
			
			
			String keyword1="HTML5";
			String keyword2="���̺긮���";
			String[] split = dc.newsList.get(0).news.split(" ");
			
			int[] resultNum=new int[2];
			resultNum[0]=0;
			resultNum[1]=0;
			
			//int[] resultNum={0,0};
			for(int i=0;i<split.length;i++){
				if(split[i].contains(keyword1)){//"HTML5"
				resultNum[0]++;
				}
				
				if(split[i].contains(keyword2)){//"HTML5"
				resultNum[1]++;
				}
			}
				
				System.out.println(keyword1+":"+resultNum[0]);
				System.out.println(keyword2+":"+resultNum[1]);
	
			//���� 2. ���� str �����͸� ��� ����(space����)���� 
			//      resultStr ���������Ͽ� ���
			//�������� �������� �Ҷ� �̰��� ����.
	
			String[] resultStr = new String[split.length];
			int index = split.length-1;
			
			for(int i=0;i<resultStr.length;i++){
				resultStr[i]=split[index];
				index--;
			}
			//���� ���
			for(int i=0;i<resultStr.length;i++){
			System.out.println(resultStr[i]);
			}
		
		}

	
}

			
			
		
		
		


