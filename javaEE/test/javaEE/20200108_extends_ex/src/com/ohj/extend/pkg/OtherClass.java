package com.ohj.extend.pkg;
// �ٸ� ��Ű���� �ִ� Ŭ������ ����Ұ�� �ݵ�� import
import com.ohj.extend.ParentClass;

public class OtherClass extends ParentClass {

		public  OtherClass() {
			System.out.println("OtherClass ������ ����");

		}
		public void ParentMethod() {//��𼭵� ȣ�Ⱑ��
			int s =100;
			System.out.println("OtherClass PatrentMethod ����"+100);
			//�θ�� ���� ���� �޼ҵ带 �ڽ��� ���ļ� �� �� �ִ�. �̿� ���� ����� override��� �θ���.
			//�ڽ�Ŭ������ �θ�κ��� �������� �޼ҵ��� {}���θ� ���� �����ϴ�.
	}
}
