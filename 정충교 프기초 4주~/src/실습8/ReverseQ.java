package �ǽ�8;

import java.util.Scanner;

public class ReverseQ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("������ ���ʷ� �Է��Ͻÿ�: ");
		System.out.println("�Է��� ��ġ���� 'q', Ȥ�� 'Q'�� �Է��Ͻÿ�: ");

		int [] a = new int[100];
		String str;
		
		int i=0;
		boolean done = false;
		while(!done)
		{
			str = input.next();
			

			if(str.equalsIgnoreCase("q"))
				done = true;
			else
			{

				int b=Integer.parseInt(str); 
				// str�� ���������� ��ȯ
				a[i]=b;
				i++;
			}
		}
		System.out.println("�迭�� �������� ���: ");
		int c;
		for(c=i-1; c>=0; c--)
			System.out.print(a[c]+" ");

	}

}
