package �ǽ�6����;

import java.util.Scanner;

public class ReadData {

	public static String readString()
	{
		/*
		 * �޼ҵ�Ȱ��
		 */
		Scanner input = new Scanner(System.in);
		String str1;
		String str2 = "";
		
		char str3;
		char str4;
		String str = "";
		
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
			str3 = str2.charAt(j);
			str4 = Character.toUpperCase(str3);
			str = str + str4;
		}
		
		return str;
	}
}
//newStr2 = str2.replace('t', 'T'); // t -> T�� ��ü
//
//char str3 = str2.charAt(0); //ù����
//char a= Character.toUpperCase(str3); // ù���� �빮�ڷ�
//
//String str4 = a + newStr2.substring(1, newStr2.length());
//
//return str4;
