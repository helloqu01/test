package com.ohj.control;

public class MainClass {
	
	public static void main (String [] args) {
	
	  /*String[] code={"JP", "FR", "JP", "US", "CN", "DE", "KR", "JP", "DE","KR"};
		
	    System.out.println(code[0]);//���� �����Ͽ� �� �濡 ���� ������
		System.out.println(code.length);//�迭�� �Ѱ����� �˼� �ִ� ���(length) 10���� ������� ������ �ִ�.
		
		
		//�Ϻ�(jp)������ �ٹ�(code)�ϰ� �ִ� ����� �ο����� �˰� �ʹ�. ã�� �� ���� 1�� ������Ų��.count(int����)�������� ;�� ���� �ȵǸ� 0���� �־���Ѵ�. 
		//int count = 0;
		//count = count +1;
		
		//if���� ����ϴ� ��
		int count = 0;
		
		//���ڸ� ���� ���Ͽ� ���ų� �ٸ��� ��Ÿ ������ ==ǥ�ð� �ƴ϶� equals(�⺻������ �������ִ� '�żҵ�'��� �θ���.)�� �־� ������ �ٸ��� ���Ѵ�.
		// �ڵ� []�濡 jp�� true�� false�� ������� ��������.
		if(code[0].equals("JP")){ //true
			count=count+1;//������ ǥ���ϴ� ��(������ �� �� �ֵ���)
		}
		if(code[1].equals("JP")){ //false �� �κ��� ���� �Ұ��� ��
			count=count+1;
		}
		if(code[2].equals("JP")){ //true
			count=count+1;
		}
		if(code[3].equals("JP")){ //false
			count=count+1;
		}
		if(code[4].equals("JP")){ //false
			count=count+1;
		}
		if(code[5].equals("JP")){ //false
			count=count+1;
		}
		if(code[6].equals("JP")){ //false
			count=count+1;
		}
		if(code[7].equals("JP")){ //true
			count=count+1;
		}
		if(code[8].equals("JP")){ //false
			count=count+1;
		}
		if(code[9].equals("JP")){ //false
			count=count+1;
		}
		
		System.out.println(count);
		
		// ���� �ڵ�� ���� ���� �� ���� ���� �ڵ尡 ���� �ڵ�.(������) �ּ����� ������ ��������.
		
		//count=count+1;-> count++;�� ��Ÿ�� �� �ִ�.
		if(code[9].equals("JP")){ //false
			count=count++;
		}
		
		//�ݺ��� ���� (for��)
		*/
		String[] code={"JP", "FR", "JP", "US", "CN", "DE", "KR", "JP", "DE","KR"};
		int[] age={27,34,28,26,41,28,42,29,29,32};
		/*1�� ����� ������ ��
		int sum = 0;//������ ��Ű�� ��(�մ�������)
		//sum=sum+age[0];~~sum=sum+age[9];
		for(int a = 0; a < age.length; a++){//age  �迭�� ������ �־���ؼ� age�� �־�� �� 
			sum = sum+age[a];//??
		}
		
		System.out.println("��������� �� :"+sum);
		
		}*/
		
		
		//2�� ����("KR")�� �ٹ���� ��� ������ ��
		  int sum = 0;//�����Լ�
		  for(int m = 0; m < code.length; m++){//10�� �ݺ� ��Ű�� ��
			 if(code[m].equals("KR")){ //�˻�(for�ƴ� if) ���� KR�̶��(������ ��ٸ�)
				sum= sum+age[m];//�� age�� ���϶�(age�� m���� ���� �����Ͷ�)
		       }
		
		       }
		  System.out.println(sum);
		}
		
	}


	
