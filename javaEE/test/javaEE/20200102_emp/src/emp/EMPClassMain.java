package emp;

public class EMPClassMain {
	
	public static void main (String[] args){
		
		EMPClass emp = new EMPClass();//Ÿ���� �̸��� ����.
		
		
		emp.Sum(emp.age,"����"); //1��
		emp.Sum(emp.pay,"�޿�");
		
		System.out.println("���� ��:"+emp.sum_return(emp.age));//2��
		System.out.println("�޿� ��:"+emp.sum_return(emp.pay));
		
		
		int[] r3 =  emp.test();//3��
		System.out.println(r3[0]+" "+r3[1]);
		
		
		ResultDate result =  emp.test2();//4��
		System.out.println(result.r1);
		System.out.println(result.r2);
		System.out.println(result.r3);
		
		
		
		
		
		
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////

		emp.sum1();//�ż��� 1�� ��ȯ���� �ʱ� ������(return) ������ ������� �����Ͽ��� ��ȯ���� �ʾ� ������ ���.
		
		
		int r = emp.sum2();//�ż��� 2��
		System.out.println(r);// r���� �Է½�Ű�� r r���� �ҷ��´�.
		System.out.println("����� �ٷ� ����ϴ� ��� : "+ emp.sum2());//������� �ٷ� ��¸� �ϰ� ���� ���� �� ����� ������ �Ѵ�.
		
		
		emp.sum3(12, 13);// �ż��� 3�� �� ���� �̿��Ϸ��� � ���� �־�����Ѵ�. 
		
		
		double r2 = emp.div(12.4f, 55); // �ż��� 4�� 
		System.out.println(r2);
		
		
		
		System.out.println(r+r2);// ������� ���߿� ���� ���� r�� r2�� ������� ���߿� �ҷ��Դ�.
		
		
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		
		
		/*//1�� ���� ������ 400 �̻��� �ο� ��
		//���� : emp�� pay �迭�� �̿�
		//400 �̻� : emp.pay[0]>= 400
		//����� �ο� �� : int count = 0;
		//pay�迭�� ��ü ������ �˻� : for(;;){}
		//400�� �� : if(){}
		
		int count = 0;//����
		for(int a = 0;a<emp.pay.length;a++){//int�� ���� ���ְ�; pay �迭�� �ִ밪���� �۴�.(ū �ݾ�)
			
			if(emp.pay[a] >= 400){
				count=count+1;//count++; ����
				
			}
		}
		
		System.out.println("������ 400 �̻��� ����� �ο� �� :"+count);
		
		//2�� ���� ������ ������ ����� ������ ��
		// gender�迭
		// ������ ���� :  emp.gender[0]=='f' char �̱� ������
		//���� pay�迭
		//�� : int sum = 0;
		//������ �˻� : for(;;){}
		//�� : if(){}
		
		
		int count2 = 0;
		for(int b = 0; b<emp.gender.length;b++){ //�迭�� ���Ƽ� Ȯ���ض� // 
			if(emp.gender[b]=='f'){//���� f��
				
				count2 = count2+emp.pay[b];//�� ���� ���϶�
			}
		}
		System.out.println("������ ������ ������ �� :"+count2);
		// for(){} ������ ���� �� ������ for���� ���� �Ǹ� �ڵ� �Ҹ�
		//���� for�� �ۿ����� ����� �Ұ�.
		// Ư�� ����(����)������ ��� �Ǵ� ����:���������� ȣĪ;ex)int a = 0,int b = 0; for�� �������� ����ϴ� ������ �������ִ� ���� ����.
		
		// 3�� ���� ������ ������ ������� ���� �հ� ��տ���
		
		int sum2 = 0;
		int paysum = 0;
		int count3 = 0;
		for(int c = 0; c<emp.gender.length; c++){
			if(emp.gender[c]=='m'){
				sum2 = sum2+emp.pay[c];
				paysum = paysum+emp.age[c];
				count3++;
			}
		}
		double avg = sum2/(count3*1.0);//����� �������� ���� �� Ÿ���� double�� ������Ѵ�.
		
		System.out.println("������ ������ �� : "+sum2);
		System.out.println("���� ��� ������ : "+avg);
		
		
	  /*for(int d = 0; d<emp.age.length;d++){
			if(emp.gender[d]=='m'){
				count4 = (count4+emp.age[d])/2;
			}
		}
		System.out.println("���� ��� ������ : "+ count4);*/
		
		// ���� 4 ���Ͽ� �ٹ��ϴ� ������� ��� �޿�
		
//		int sum = 0;
//		int paysum2 = 0;
//		for(int a = 0; a < emp.code.length;a++){
//			if(emp.code[a].equals("DE")){
//			sum = sum+emp.pay[a];
//			count++;
				
//			}
//		}
//	double avg2 = sum/(count*1.0);
//	System.out.println("���� ����� ��� �޿��� : "+avg2);*
	
	
	
	}

}
