package com.ohj.member;

import java.util.ArrayList;//외부클래스를 가져오는 것 JRE
import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		
//랜덤 코드//////////////////////////////////////////////////////
		ArrayList lottoNumber = new ArrayList();
		for(int i=0; i<46;i++){
			lottoNumber.add(i);
		}
		
		Random rnd =  new Random();//임의의 정수를 위한 객체
		ArrayList sixNumber=new ArrayList();//임의의 수 6개 저장
		for(int i=0; i<6;i++){//중복되지않는 임의의 수 6개 추출
			int index = rnd.nextInt(lottoNumber.size());
			Object n = lottoNumber.remove(index);
			sixNumber.add(n);
		}
		
		for(int i=0; i<sixNumber.size();i++){//추출된 6개 숫자 출력
			System.out.println(sixNumber.get(i)+",");
		}
		
//////////////////////////////////////////////////////////////		
		
		/*ArrayList lottoNumber = new ArrayList();
		for(int i=0; i<46;i++){
			lottoNumber.add(i);
		}
		
		//lottNember[0]=>1   0번 방에는 1번
		//lottNember[1]=>2   1번 방에는 2번
		//lottNember[44]=>45 44번 방에는 45번
		
		Random rnd =  new Random();
		int index = rnd.nextInt(lottoNumber.size());//-> 사이즈는 45개 
		//lottoNumber.size()->45
		//rnd.nextInt(lottoNumber.size())=> 0~44
		
		Object n = lottoNumber.remove(index);//중복값은 get이 아니고 remove로 값을 제거
		System.out.println(n);
		System.out.println(lottoNumber.size());
		
		index = rnd.nextInt(lottoNumber.size());
		n = lottoNumber.remove(index);//중복값은 get이 아니고 remove로 값을 제거
		System.out.println(n);
		System.out.println(lottoNumber.size());*/
		
	}

}
