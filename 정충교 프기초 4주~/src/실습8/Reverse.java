package �ǽ�8;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("���� 10���� ���ʷ� �Է��Ͻÿ�: ");
		int [] a = new int[10];
		int i;
		for(i=0; i<a.length; i++)
		{
			a[i]=input.nextInt();
		}
		System.out.println("�迭�� �������� ���: ");
		for(i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i] +" ");
		}
	}

}
