package com.ohj.string;

public class MainClass {//String에 대해 자세히 들어가기

	public static void main(String[] args) {
		
		
		String str1 = "Java";
		
		//기존 문자열을 all 소문자로 반환
		System.out.println(str1.toLowerCase());
		
		//기존 문자열을 all 대문자로 반환
		System.out.println(str1.toUpperCase());
		
		//지정 문자의 index 번호를 반환
		System.out.println(str1.indexOf('v'));
		
		//지정 index의 문자를 반환
		System.out.println(str1.charAt(2));
		
		//지정된 문자열로 시작하는지 (boolean)
		System.out.println(str1.startsWith("j"));
		
		//지정된 문자열로 끝나는지(boolean)
		System.out.println(str1.endsWith("a"));
		
		//지정된 문자열을 포함하는지(boolean)
		System.out.println(str1.contains("a"));
		
		//지정된 인덱스로 부터 모두 반환
		System.out.println(str1.substring(1));
		
		//지정한 첫번째 인덱스부터 두번째 인덱스 직전까지의 문자들을 반환
		System.out.println(str1.substring(1,3));
		
		
		System.out.println("----------------------------");
		
		String str2 = "	Ja	va	";
		
		//문자열의 양쪽 공백을 제거
		System.out.println("*"+str2.trim()+"*");
		
		//지정된 문자로 분리하여 배열로 전환한다.
		String[] s = str2.split("");
		System.out.println(s.length);
		
		//두개의 문자열 비교(boolean)
		if(str1.equals(str2)){
			System.out.println(true);
		}
		
		System.out.println("----------------------------");
		
		String str3;//이렇게 선언하게 되면 String이 안에 들어가지 않기 때문에 프린트 할 수 없다.(매소드 사용불가)
		
		System.out.println("----------------------------");
		
		String str4 = "";
		//문자열 변수의 값이 있는지(boolean)
		System.out.println(str4.isEmpty());
		
		System.out.println("----------------------------");
		String str5 = null;//실행 후, null point 에러 발생
		System.out.println(str5.isEmpty());
		
		
		
	}

}
