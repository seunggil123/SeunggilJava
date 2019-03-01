package 실습6주차;

import java.util.Scanner;

public class ReadData2 {

	public static String readString()
	{
		/*
		 * ASCII코드 활용
		 */
		Scanner input = new Scanner(System.in);
		String str1;
		String str2 = "";

		char str3;
		String str4="";
		

		str1 = input.next(); 

		for(int i=0; i<str1.length(); i++)
		{
			if(Character.isLetter(str1.charAt(i))) 
			{
				str2 = str2 + str1.charAt(i);
			}
		}
		
		for(int j=0; j<str2.length(); j++)
		{
			if(str2.charAt(j)>='a' && str2.charAt(j) <= 'z')
			{
				str3 = str2.charAt(j);
				str3 = (char)(str2.charAt(j)-32);
				str4 = str4 + str3;
			}
		}
		
		return str4;
		
		
	
	
	}
	
	










}



