package com.ohj.emp;
public class MainClass {

	   public static void main(String[] args) {

	      DateClass dc = new DateClass();
	      //OperClass oc = new OperClass(); // 1. 객체 생성해주고
	      //oc.avgHireData(dc.ic); // 2. operclass에 선언해놓은것을 여기로 불러옴
	                        // 주의할점은 main에서 일단 코드를 먼저 만들어 놓고 그 다음에
	                        // operclass를 만들어서 옮기는 식으로 해야 한다.

	      // System.out.println(dc.ic[13].commission); -->데이터 확인용
	      // 진짜 데이터가 확인이 되는지 먼저 점검 한 후에 코딩을 시작해야 한다.

	      
	      // 2007년에 입사한 사람 (내가 해결한 코드)
	      
	      String hd;
	      String[] s;
	      int year;
	      int year2;
	      
	      for (int i = 0; i < dc.ic.length; i++) {
	         hd = dc.ic[i].hireData;
	         s = hd.split("-");
	         int y=Integer.parseInt(s[0]);
	         year=y;
	         year2=1995;
	         
	         year2=y+1;
	         
	         if(y<=year2){
	            System.out.println(y+"년 입사자 : "+dc.ic[i].eName);
	         }else if(year2<2008){
	            System.out.println("연산 종료");
	         }
	         /*
	          if(y==2005){
	            System.out.println("2005 입사자 : "+dc.ic[i].eName);
	         }
	         if(y==2004){
	            System.out.println("2004 입사자 : "+dc.ic[i].eName);
	         }
	         if(y==2003){
	            System.out.println("2003 입사자 : "+dc.ic[i].eName);
	         }
	         if(y==2002){
	            System.out.println("2002 입사자 : "+dc.ic[i].eName);
	         }
	         if(y==1996){
	            System.out.println("1996 입사자 : "+dc.ic[i].eName);
	         }
	         */
	         
	      }
	      
	      
	      /*
	      int dn;
	      String en;
	      
	      
	      for(int i=0; i<dc.ic.length;i++){
	         dn=dc.ic[i].deptNo;
	         if(dn==30){
	            System.out.println("30 부서 인원 : "+dc.ic[i].eName);
	         }
	      }
	      
	      for(int i=0; i<dc.ic.length;i++){
	         en=dc.ic[i].job;
	         if(en.equals("과장")){
	            System.out.println("과장 직급자 : "+dc.ic[i].eName);
	         }
	      }
	      */
	   }
	}
