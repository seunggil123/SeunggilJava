package ½Ç½À8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class FileInFileOut {

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input = new Scanner(new File("integers.txt"));
		PrintWriter output = new PrintWriter("reversed_integers.txt");
		
		int [] a = new int[10];
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = input.nextInt();
		}
		
		for(int i=a.length-1; i>=0; i--)
		{
			output.print(a[i]+" ");
		}
		
		input.close();
		output.close();
	}

}
