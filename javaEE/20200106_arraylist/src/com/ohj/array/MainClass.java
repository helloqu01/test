package com.ohj.array;

import java.util.ArrayList;

public class MainClass {
		public static void main(String[] args) {
			DataClass dc = new DataClass();
			for(int i =0;i<dc.empArr.size();i++){
				System.out.println(dc.empArr.get(i).eName);
			}
//InfoClass ic = new InfoClass("181234-3345678");
//System.out.println(ic.age);
//TestClass tc = new TestClass();

//ArrayList<TestClass> a = new ArrayList<TestClass>();//예약을 해놨기 때문에 따로 설정해줄 필요가 없음
//a.add(tc);
//int s = a.size();//방개수를 아는 방법
//System.out.println(s);
//Object t = a.get(0);
//TestClass t2 = (TestClass)a.get(0);
		}

}

/*​

배열 : 주로 여러개의 값을 저장 할때

배열의 특징 : 동일한 데이터 타입만 저장 가능

초기 인덱스(방)의 개수는 수정 불가능

초기에 인덱스(방)의 갯수를 설정

ex) TestClass[] tArr= new TestClass[3];

​

ArrayList : 외부클래스로 존재(ArrayList.Class)

이것을 사용하려면 반드시 import가 필요(import java.util.ArrayList)

내부 메소드를 통하여 갯수가 정해지고 수정가능, 따라서 객체생성이 필수(new ArrayList())

ArrayList는 주로 객체들을 저장할 때 사용

타양한 타입의 데이터를 한번에 보관 할 수있다(오브젝트 파일로 추가되기 때문에 가능하다)

ex)ArrayList a = new ArrayList();

a.add(new TestClass);

a.add(true);

a.add(1123);

a.add(12.5);

a.add('abcd);

단 저장된 값은 오브젝트 타입으로 저장된다.

따라서 데이터를 사용 할 경우 원래 타입으로 변환해야 한다.

예 TestClass t =(TestClass)a.get(0);

​

만약 동일한 타입의 객체들을 저장할 경우에는 미리 타입을 예약한다.(배열과 ArrayList의 차이점)

ex) ArrayList<TestClass> a = new ArrayList<TestClass>();

a.add(new TestClass());//테스트 클래스 타입으로 저장 됨.

TestClass tt = a.get(0);//테이터 타입 변환 필요 없음.

​

arrayList의 주요 메소드

1. add; // 맨 마지막 위치에 데이터 추가

2. get(인덱스번호);//지정한 위치의 데이터 추출

3. remove(인덱스번호)//지정한 위치의 데이터를 제거하고 그 데이터를 반환.

4. size() // 데이터의 갯수를 반환

​

ArrayList에 데이터를 추가하거나 삭제할 경우, size()는 자동으로 바뀐다.

ex) ArrayList<TestClass> a= new ArrayList<TestClass>();

a.add(new testClass); // Size()=>1

a.add(new testClass); // Size()=>2

a.add(new testClass); // Size()=>3

​

a.remove(0); //size()=>2

이 때 제거된 데이터 위치로 다른 데이터들이 한칸씩 이동된다.

​

​

​

*/