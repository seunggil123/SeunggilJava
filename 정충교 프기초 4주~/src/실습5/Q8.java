package �ǽ�5;
import java.util.Scanner;

import javax.sound.midi.Synthesizer;
public class Q8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("�ﰢ���� �׸��� ���α׷��Դϴ�.");
		System.out.println("�ﰢ���� ũ�⸦ �󸶷� �ұ��? ");
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
