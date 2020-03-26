package com.ohj.emp;

public class MainClass {

	public static void main(String[] args) {	
		
		String [] h;
		String names="";
		String hd="";
		for(int i =0; i<ic.length;i++){
			
		}
		
/////////////////////////////////////////////////////////////////////////////		
		/*String s="public-static-void-main";
		String[] r = s.split("-");
		System.out.println(r.length);
		
		String s1="public-static-void-main";
		String[] r1 = s.split("-");
		System.out.println(r.length);
		
		String s2="public-static-void-main";
		String[] r2 = s.split("-");
		System.out.println(r.length);
		
		String s3="public-static-void-main";
		String[] r3 = s.split("-");
		System.out.println(r.length);*/
		
		
//////////////////////////////////////////////////////////////////////////////		
		/*DateClass dc = new DateClass();
		for(int i=0; i<dc.ic.length;i++){
			if(dc.ic[i].job.equals("사원")){
				System.out.println("사원의 이름은 : "+dc.ic[i].eName);
			}
		}*/
	
//////////////////////////////////////////////////////////////////////////////	
		/*int[] n={10,15,33,5,7,20};
		int temp=0;//최대값0,최저나이값200(이 나이까지 생존하지 못하므로)
		
		for(int i=0;i<n.length;i++){
			if(temp<n[i]){
				temp=n[i];
			}
		}
		System.out.println(temp);*/
/////////////////////////////////////////////////////////////////////////////
		
		/*//최고 값을 찾는 방법.
		int[] n={10,15,33,5,7,20};
		int temp=0;
		
		if(temp<n[0]){//템프가 n[0]보다 작으면       //(0<10)이기 때문에 10을 갖게 된다. temp =10
			temp=n[0];//템프에 n[0]값을 넣는다.
		}
		if(temp<n[1]){//템프가 n[1]보다 작으면	//(10<15)이기 때문에 15를 갖게 된다. temp =15
			temp=n[1];//템프에 n[1]값을 넣는다.
		}
		if(temp<n[2]){//템프가 n[2]보다 작으면	//(15<33)이기 때문에 33를 갖게 된다. temp =33
			temp=n[2];//템프에 n[2]값을 넣는다.
		}
		if(temp<n[3]){//템프가 n[3]보다 작으면	//(33<5) 
			temp=n[3];//템프에 n[3]값을 넣는다.
		}
		if(temp<n[4]){//템프가 n[4]보다 작으면	//(33<7) 
			temp=n[4];//템프에 n[4]값을 넣는다.
		}
		if(temp<n[5]){//템프가 n[5]보다 작으면 	//(33<20)
			temp=n[5];//템프에 n[5]값을 넣는다.
		}
		//for문은 똑같은 규칙이 있어야 한다. 불규칙에는 if*/
				
		
//////////////////////////////////////////////////////////////////////////		
		
	
		/*DataClass dc = new DataClass();//객체 생성, 어딘가에 저장되에 잇는 것을 끌어온다.
		
		OperClass oc = new OperClass();
		oc.avgHireDate(dc.ic);//OperClass에서 재직연수 매소드를 가져온다.*/
		
				
///////////////////////////////////////////////////////////////////////////		
		
		
		/*System.out.println(dc.ic[13].commision);//데이터가 잘 들어갔는지 확인한다.
		int sum=0; String hd; String[] s;
		for(int i=0;i<dc.ic.length;i++){
		//String hd =dc.ic[0].hireData;
		//System.out.println(hd);
		hd =dc.ic[i].hireData;
			
		//String[]s=hd.split("-");// 쪼개는 것 "2007-03-01"-> "2007","03","01"
		//System.out.println(s[0]);
		//System.out.println(s[1]);
		//System.out.println(s[2]);
		s=hd.split("-");
		
		//System.out.println(2020+s[0]);//숫자+문자=문자열
		//int y = Integer.parseInt(s[0]);//문자열로 되어있는 숫자를 숫자로 바꿔주는 것 ex) "2007"=>2007
		//System.out.println(2020-y); //숫자와 문자는 -를 할 수 없지만 문자를 숫자로 바꾸면 -를 할 수 있다.
		sum = sum+(2020-Integer.parseInt(s[0]));
		
		}
		//평균 재직연수를 구하라
		double avg = sum/(dc.ic.length*1.0);
		System.out.println(avg);*/
		}

	}


