package phone_ex;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {//8번

		SamsungClass s = new SamsungClass();
		LGClass lg = new LGClass();
		AppleClass iphone = new AppleClass();
		
		//배열과 ArrayList
		ArrayList<Object> obj = new ArrayList<Object>();
		obj.add(s);
		obj.add(lg);
		obj.add(iphone);
		
		SamsungClass s1=(SamsungClass)obj.get(0);
		//<Object>() 예약타입으로 써도 되나 반드시 SamsungClass s1=(SamsungClass)obj.get(0);(형변환)을 시켜줘야 선언된 변수들을 사용 할 수 있다.
		
		ArrayList<phone> phones = new ArrayList<phone>();
		phones.add(s);
		phones.add(lg);
		phones.add(iphone);
		//<phone>(); 로 선언하면 get(0).call 등의 변수를 불러와서 사용 할 수 있다.(형변환 시킬 필요가 없음)
		phones.get(0).call("010-1234-5678");
		
	}

}
