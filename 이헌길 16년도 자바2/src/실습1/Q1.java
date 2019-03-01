package 실습1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("문자열 입력: ");
		String str = input.nextLine();
		System.out.println("숫자 입력: ");
		int count = input.nextInt();

		char[] array = new char[str.length()];
		int i,j;

		for(i=0; i<array.length; i++)
			array[i]= str.charAt(i);

		int index;
		index=(array.length-count);
		char[] back = new char[count];
		char[] front = new char[index];

		for(i=0; i<count; i++)
		{	
			back[i]=array[index];
			index++;
		}
		index=0;
		for(j=0; j<array.length-count; j++)
		{
			front[j]=array[index];
			index++;
		}

		char[] done = new char[array.length];

		for(i=0; i<back.length; i++)
			done[i]=back[i];
		j=0;
		for(; i<array.length; i++, j++ )
		{	
			
			done[i]=front[j];
		}
		PrintArray(done);

	}
	public static void PrintArray(char[] array)
	{	
		int i;
		for(i=0; i<array.length; i++)
			System.out.print(array[i]+" ");
	}
	



}



