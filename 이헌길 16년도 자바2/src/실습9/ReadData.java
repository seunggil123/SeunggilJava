package �ǽ�9;

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
		int decimalPlace; // �Ҽ����� �ε���
		do
		{
			correct = true;
			number = input.next();
			if(number.charAt(0) == '-')
			{
				negative = true;
				number=number.substring(1, number.length());
			}
			decimalPlace = number.indexOf("."); //�Ҽ����� ���ٸ� -1
			/**
			 * �Ҽ��������� ���ڵ��� �������� �����Ѵ�.
			 * �Ҽ����� �������� �ʰų� ù ��° ���ڰ� �Ҽ����̸�
			 * �� ������ �ǳʶڴ�.
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















