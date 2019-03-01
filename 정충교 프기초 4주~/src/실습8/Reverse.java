package 실습8;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("정수 10개를 차례로 입력하시오: ");
		int [] a = new int[10];
		int i;
		for(i=0; i<a.length; i++)
		{
			a[i]=input.nextInt();
		}
		System.out.println("배열을 역순으로 출력: ");
		for(i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i] +" ");
		}
	}

}
