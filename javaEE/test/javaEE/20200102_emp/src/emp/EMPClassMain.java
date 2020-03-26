package emp;

public class EMPClassMain {
	
	public static void main (String[] args){
		
		EMPClass emp = new EMPClass();//타입은 이름과 같다.
		
		
		emp.Sum(emp.age,"나이"); //1번
		emp.Sum(emp.pay,"급여");
		
		System.out.println("나이 합:"+emp.sum_return(emp.age));//2번
		System.out.println("급여 합:"+emp.sum_return(emp.pay));
		
		
		int[] r3 =  emp.test();//3번
		System.out.println(r3[0]+" "+r3[1]);
		
		
		ResultDate result =  emp.test2();//4번
		System.out.println(result.r1);
		System.out.println(result.r2);
		System.out.println(result.r3);
		
		
		
		
		
		
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////

		emp.sum1();//매서드 1번 반환하지 않기 때문에(return) 변수에 결과값을 대입하여도 반환되지 않아 오류가 뜬다.
		
		
		int r = emp.sum2();//매서드 2번
		System.out.println(r);// r값에 입력시키고 r r값을 불러온다.
		System.out.println("결과를 바로 출력하는 방법 : "+ emp.sum2());//결과값을 바로 출력만 하고 싶을 때는 이 방법을 쓰도록 한다.
		
		
		emp.sum3(12, 13);// 매서드 3번 이 것을 이용하려면 어떤 값을 넣어줘야한다. 
		
		
		double r2 = emp.div(12.4f, 55); // 매서드 4번 
		System.out.println(r2);
		
		
		
		System.out.println(r+r2);// 결과값을 나중에 쓰는 예시 r과 r2의 결과값을 나중에 불러왔다.
		
		
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		
		
		/*//1번 문제 월급이 400 이상인 인원 수
		//월급 : emp의 pay 배열을 이용
		//400 이상 : emp.pay[0]>= 400
		//사람의 인원 수 : int count = 0;
		//pay배열의 전체 데이터 검색 : for(;;){}
		//400과 비교 : if(){}
		
		int count = 0;//선언
		for(int a = 0;a<emp.pay.length;a++){//int를 선언 해주고; pay 배열의 최대값보다 작다.(큰 금액)
			
			if(emp.pay[a] >= 400){
				count=count+1;//count++; 동일
				
			}
		}
		
		System.out.println("월급이 400 이상인 사람의 인원 수 :"+count);
		
		//2번 문제 성별이 여자인 사람의 월급의 합
		// gender배열
		// 성별이 여자 :  emp.gender[0]=='f' char 이기 때문에
		//월급 pay배열
		//합 : int sum = 0;
		//데이터 검색 : for(;;){}
		//비교 : if(){}
		
		
		int count2 = 0;
		for(int b = 0; b<emp.gender.length;b++){ //배열을 돌아서 확인해라 // 
			if(emp.gender[b]=='f'){//만약 f면
				
				count2 = count2+emp.pay[b];//그 수를 더하라
			}
		}
		System.out.println("성별이 여자인 월급의 합 :"+count2);
		// for(){} 내에서 선언 된 변수는 for문이 종료 되면 자동 소멸
		//따라서 for문 밖에서는 사용이 불가.
		// 특정 범위(지역)에서만 사용 되는 변수:지역변수라 호칭;ex)int a = 0,int b = 0; for문 내에서만 사용하는 변수를 지정해주는 것이 좋다.
		
		// 3번 문제 성별이 남자인 사람들의 월급 합과 평균연령
		
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
		double avg = sum2/(count3*1.0);//평균을 적으려면 가장 긴 타입인 double을 적어야한다.
		
		System.out.println("남자의 월급의 합 : "+sum2);
		System.out.println("남자 평균 연령은 : "+avg);
		
		
	  /*for(int d = 0; d<emp.age.length;d++){
			if(emp.gender[d]=='m'){
				count4 = (count4+emp.age[d])/2;
			}
		}
		System.out.println("남자 평균 연령은 : "+ count4);*/
		
		// 문제 4 독일에 근무하는 사원들의 평균 급여
		
//		int sum = 0;
//		int paysum2 = 0;
//		for(int a = 0; a < emp.code.length;a++){
//			if(emp.code[a].equals("DE")){
//			sum = sum+emp.pay[a];
//			count++;
				
//			}
//		}
//	double avg2 = sum/(count*1.0);
//	System.out.println("독일 사원의 평균 급여는 : "+avg2);*
	
	
	
	}

}
