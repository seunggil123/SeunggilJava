package �ǽ�7����;

import java.util.Scanner;

public class TryTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean done= false;

		while(!done)
		{	
			System.out.println("Character Ÿ������ ��ȯ�� ���ڸ� �Է��Ͻÿ�: ");
			
			char[] ch = new char[3];
			try
			{

				String str = input.nextLine();
				String [] s = str.split(" ");
				
				for(int i=0; i<s.length; i++)
				{
					ch[i] = (char)Integer.parseInt(s[i]);
				}
				
				System.out.print("���: ");
				
				for(int i=0; i<ch.length; i++)
				{
					System.out.print(ch[i]+" ");
					
				}
				System.out.println();
				
			}

			catch(NumberFormatException e)
			{
				System.out.println("Error : Integer Ÿ���� �ƴմϴ�.");
			}
			catch(ArrayIndexOutOfBoundsException F)
			{
				
				System.out.println("Error: �迭�ʰ�");
			}
		}
	}
}
