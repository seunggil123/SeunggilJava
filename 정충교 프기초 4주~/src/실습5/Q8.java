package 실습5;
import java.util.Scanner;

import javax.sound.midi.Synthesizer;
public class Q8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("삼각형을 그리는 프로그램입니다.");
		System.out.println("삼각형의 크기를 얼마로 할까요? ");
		int howMuch = input.nextInt();
		int i;
		int j;
//
//		for(i=1; i<=howMuch; i++)
//		{
//			for(j=0; j<i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		System.out.println();

		//		for(i=howMuch; i>=1; i--)
		//		{ 
		//			for(j=1; j<=i; j++)
		//			{
		//				System.out.print("*");
		//			}
		//			System.out.println();
		//		}
		//		

//		for(i= howMuch; i>=1; i--)
//		{
//			for(j=0; j< i; j++)
//			{
//				System.out.print(" ");
//
//			}
//			for(; j <=howMuch; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		for(i=1; i<=howMuch; i++)
		{
			for(j=1; j< i; j++)
			{
				System.out.print("+");

			}
			for(; j <=howMuch; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

//		for(i= howMuch; i>=1; i--) 
//		{
//			for(i=0; ) 
//			{	
//				//+		
//
//			}
//			for(j=0; j<howMuch; j++)
//			{
//				System.out.print("*");
//				//*
//			}
//		}


	}

}
