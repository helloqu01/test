package com.ohj.string;

public class MainClass {//String�� ���� �ڼ��� ����

	public static void main(String[] args) {
		
		
		String str1 = "Java";
		
		//���� ���ڿ��� all �ҹ��ڷ� ��ȯ
		System.out.println(str1.toLowerCase());
		
		//���� ���ڿ��� all �빮�ڷ� ��ȯ
		System.out.println(str1.toUpperCase());
		
		//���� ������ index ��ȣ�� ��ȯ
		System.out.println(str1.indexOf('v'));
		
		//���� index�� ���ڸ� ��ȯ
		System.out.println(str1.charAt(2));
		
		//������ ���ڿ��� �����ϴ��� (boolean)
		System.out.println(str1.startsWith("j"));
		
		//������ ���ڿ��� ��������(boolean)
		System.out.println(str1.endsWith("a"));
		
		//������ ���ڿ��� �����ϴ���(boolean)
		System.out.println(str1.contains("a"));
		
		//������ �ε����� ���� ��� ��ȯ
		System.out.println(str1.substring(1));
		
		//������ ù��° �ε������� �ι�° �ε��� ���������� ���ڵ��� ��ȯ
		System.out.println(str1.substring(1,3));
		
		
		System.out.println("----------------------------");
		
		String str2 = "	Ja	va	";
		
		//���ڿ��� ���� ������ ����
		System.out.println("*"+str2.trim()+"*");
		
		//������ ���ڷ� �и��Ͽ� �迭�� ��ȯ�Ѵ�.
		String[] s = str2.split("");
		System.out.println(s.length);
		
		//�ΰ��� ���ڿ� ��(boolean)
		if(str1.equals(str2)){
			System.out.println(true);
		}
		
		System.out.println("----------------------------");
		
		String str3;//�̷��� �����ϰ� �Ǹ� String�� �ȿ� ���� �ʱ� ������ ����Ʈ �� �� ����.(�żҵ� ���Ұ�)
		
		System.out.println("----------------------------");
		
		String str4 = "";
		//���ڿ� ������ ���� �ִ���(boolean)
		System.out.println(str4.isEmpty());
		
		System.out.println("----------------------------");
		String str5 = null;//���� ��, null point ���� �߻�
		System.out.println(str5.isEmpty());
		
		
		
	}

}
