package 현자바;

import java.util.Scanner;

public class dictionary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n;
		n=input.nextInt();

		String [] str = new String[n];

		for(int i=0; i<str.length; i++)
		{	
			System.out.println("문자입력");
			str[i] = input.next();
		}	

		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-1; j++)
			{
				int length;
				if(str[j].length() < str[j+1].length())
					length = str[j].length();
				else
					length = str[j+1].length();
				//비교를 몇개 할건지 -> 길이가 짧은 문자수만큼 비교 5,3비교 -> 3번비교

				boolean flag = false;
				//flag = true -> 정렬실행

				for(int k=0; k<length;k++)
				{
					if(str[j].charAt(k) > str[j+1].charAt(k))
					{
						flag = true;
						break;
					}
					else if(str[j].charAt(k) < str[j+1].charAt(k))
						break;

					if((k==length-1) && (str[j].length() > str[j+1].length()))
					{
						flag = true;
					}
					// ex) str[0] = abcd , str[1] =abc 면 str[0] = abc , str[1] =abcd를 만들어주는 코드
				}

				if(flag)
				{
					String temp = str[j];
					str[j] = str[j+1];
					str[j+1] = temp;
				}
			}
		}
		for(int i=0; i<str.length; i++)
		{
			System.out.print(str[i]+" ");
		}
	}
}


