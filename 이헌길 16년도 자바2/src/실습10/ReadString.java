package 실습10;

import java.util.Scanner;

public class ReadString {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("문자열 입력: ");
		String str = input.next();
		char[] ch= new char[10];


		try
		{	

			for(int i=0; i<str.length(); i++)
			{
				ch[i] = str.charAt(i); //문자 배열에 넣기
			}

		}
		catch(ArrayIndexOutOfBoundsException e) // 문자길이 > 배열크기 예외
		{	
			System.out.println("--예외 발생시--");
			System.out.println(e);
			System.out.println("배열의 크기를 초과했습니다");
		}
		
		/*
		 *  try - catch 문 다 통과하고 난뒤 나오는 내용들 
		 */
		System.out.println("--사후처리--");
		System.out.print("배열에 저장된 문자열: ");
		for(int i=0; i<10; i++)
			System.out.print(ch[i]);
		for(int j=0; j<10-str.length(); j++)
			System.out.print("★");

	}
}





