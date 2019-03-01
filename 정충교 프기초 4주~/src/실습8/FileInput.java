package ½Ç½À8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileInput {

	public static void main(String[] args) throws FileNotFoundException

	{
		Scanner input = new Scanner(new File("integers.txt"));
		
		int [] numbers = new int[10];

		for(int i=0; i<numbers.length; i++)
		{
			numbers[i] = input.nextInt();
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
		
		for(int i=numbers.length-1; i>=0;i-- )
		{
			System.out.print(numbers[i]+" ");
		}
		System.out.println();

		input.close();
	}

}
