package �ǽ�10;

import java.util.Scanner;

public class ReadString {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("���ڿ� �Է�: ");
		String str = input.next();
		char[] ch= new char[10];


		try
		{	

			for(int i=0; i<str.length(); i++)
			{
				ch[i] = str.charAt(i); //���� �迭�� �ֱ�
			}

		}
		catch(ArrayIndexOutOfBoundsException e) // ���ڱ��� > �迭ũ�� ����
		{	
			System.out.println("--���� �߻���--");
			System.out.println(e);
			System.out.println("�迭�� ũ�⸦ �ʰ��߽��ϴ�");
		}
		
		/*
		 *  try - catch �� �� ����ϰ� ���� ������ ����� 
		 */
		System.out.println("--����ó��--");
		System.out.print("�迭�� ����� ���ڿ�: ");
		for(int i=0; i<10; i++)
			System.out.print(ch[i]);
		for(int j=0; j<10-str.length(); j++)
			System.out.print("��");

	}
}





