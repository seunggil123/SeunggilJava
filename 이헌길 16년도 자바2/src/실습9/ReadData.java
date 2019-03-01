package 실습9;

import java.util.Scanner;

public class ReadData {
	public static int readInt()
	{
		Scanner input = new Scanner(System.in);
		boolean correct;
		boolean negative = false;
		String number;
		do
		{
			correct = true;
			number = input.next();
			if(number.charAt(0)=='-')
			{
				negative = true;
				number = number.substring(1, number.length());
			}
			for(int i=0; i<number.length(); i++)
			{
				if(!Character.isDigit(number.charAt(i)))
						{
							correct = false;; 
							System.out.println("Input error, reenter: ");
							break;
						}
			}
		}while(!correct);
		
		if(negative)
			return -Integer.parseInt(number);
		return Integer.parseInt(number);
	}
	
	public static double readDouble()
	{
		Scanner input = new Scanner(System.in);
		boolean correct;
		boolean negative = false;
		String number;
		int decimalPlace; // 소수점의 인덱스
		do
		{
			correct = true;
			number = input.next();
			if(number.charAt(0) == '-')
			{
				negative = true;
				number=number.substring(1, number.length());
			}
			decimalPlace = number.indexOf("."); //소수점이 없다면 -1
			/**
			 * 소수점까지의 문자들이 숫자인지 검증한다.
			 * 소수점이 존재하지 않거나 첫 번째 문자가 소수점이면
			 * 이 루프는 건너뛴다.
			 */
			for(int i=0; i< decimalPlace; i++)
				if(!Character.isDigit(number.charAt(i)))
				{
					correct = false;
					System.out.println("Input error, reenter: ");
					break;
				}
		}while(!correct);
		if(negative)
			return -Double.parseDouble(number);
		return Double.parseDouble(number);
	}

	
	
	
	
	
	



}















