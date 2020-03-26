package com.ohj.extend.pkg;
// 다른 패키지에 있는 클래스를 사용할경우 반드시 import
import com.ohj.extend.ParentClass;

public class OtherClass extends ParentClass {

		public  OtherClass() {
			System.out.println("OtherClass 생성자 내부");

		}
		public void ParentMethod() {//어디서든 호출가능
			int s =100;
			System.out.println("OtherClass PatrentMethod 내부"+100);
			//부모로 부터 받은 메소드를 자식이 고쳐서 쓸 수 있다. 이와 같은 기법을 override라고 부른다.
			//자식클래스는 부모로부터 물려받은 메소드의 {}내부만 수정 가능하다.
	}
}
