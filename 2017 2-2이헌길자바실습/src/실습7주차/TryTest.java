package 실습7주차;

import java.util.Scanner;

public class TryTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean done= false;

		while(!done)
		{	
			System.out.println("Character 타입으로 변환할 숫자를 입력하시오: ");
			
			char[] ch = new char[3];
			try
			{

				String str = input.nextLine();
				String [] s = str.split(" ");
				
				for(int i=0; i<s.length; i++)
				{
					ch[i] = (char)Integer.parseInt(s[i]);
				}
				
				System.out.print("결과: ");
				
				for(int i=0; i<ch.length; i++)
				{
					System.out.print(ch[i]+" ");
					
				}
				System.out.println();
				
			}

			catch(NumberFormatException e)
			{
				System.out.println("Error : Integer 타입이 아닙니다.");
			}
			catch(ArrayIndexOutOfBoundsException F)
			{
				
				System.out.println("Error: 배열초과");
			}
		}
	}
}
