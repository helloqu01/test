package phone_ex;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {//8��

		SamsungClass s = new SamsungClass();
		LGClass lg = new LGClass();
		AppleClass iphone = new AppleClass();
		
		//�迭�� ArrayList
		ArrayList<Object> obj = new ArrayList<Object>();
		obj.add(s);
		obj.add(lg);
		obj.add(iphone);
		
		SamsungClass s1=(SamsungClass)obj.get(0);
		//<Object>() ����Ÿ������ �ᵵ �ǳ� �ݵ�� SamsungClass s1=(SamsungClass)obj.get(0);(����ȯ)�� ������� ����� �������� ��� �� �� �ִ�.
		
		ArrayList<phone> phones = new ArrayList<phone>();
		phones.add(s);
		phones.add(lg);
		phones.add(iphone);
		//<phone>(); �� �����ϸ� get(0).call ���� ������ �ҷ��ͼ� ��� �� �� �ִ�.(����ȯ ��ų �ʿ䰡 ����)
		phones.get(0).call("010-1234-5678");
		
	}

}
