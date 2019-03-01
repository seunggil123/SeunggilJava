package 실습8;

import java.util.Scanner;

public class ReverseQ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("정수를 차례로 입력하시오: ");
		System.out.println("입력을 마치려면 'q', 혹은 'Q'를 입력하시오: ");

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
				// str을 정수형으로 변환
				a[i]=b;
				i++;
			}
		}
		System.out.println("배열을 역순으로 출력: ");
		int c;
		for(c=i-1; c>=0; c--)
			System.out.print(a[c]+" ");

	}

}
