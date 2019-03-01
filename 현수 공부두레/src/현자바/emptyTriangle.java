package ÇöÀÚ¹Ù;

import java.util.Scanner;

public class emptyTriangle {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int a = num;
		
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=a-1; j++)
			{	
				System.out.print(" ");
				
			}
			a--;
			
			for(int k=1; k<=2*i-1; k++)
			{
				if(k == 1 || k % 2 ==1)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=num/2; i++)
		{
			for(int j=1; j<=((2*num-1)/2)-1; j++)
				System.out.print(" ");
			for(int k=1; k<=3; k++)
				System.out.print("*");
			System.out.println();
		}
		
	}
	
	
}
