package �ǽ�6����;

public class AutoBoxingUnBoxing {
	public static void main(String[] args) {
		int i = 10;  // �⺻��
		
		/**
		 * Auto boxing
		 * �⺻Ÿ���� ���� �ڵ����� Wrapper ��ü�� ��ȯ
		 * ex) int - > Interger
		 * i = 10 -> Integer intObject = 10 �⺻�� -> ������(����Ŭ����)
		 **/
		
		Integer intObject = i; // auto boxing
		System.out.println("intObject = " + intObject);
		
		/**
		 * Wrapper ��ü�� �ڵ����� �⺻Ÿ���� ������ ��ȯ
		 * Integer intObject= 10 (������) -> int i = 10
		 * ����Ŭ������ ����ϴ� ������ �⺻Ÿ���� ���� �ڹ�Ŭ������ Ȱ���� �� �ֵ��� 
		 * �ϱ����ؼ�
		 **/
		
		i = intObject + 10; // auto unboxing
		System.out.println("i = " + i);
	}
}