package ½Ç½À5;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;


public class File_Calc extends Calc 
{

	
	public int file_add(String file_name) throws FileNotFoundException
	{
		int sum=0;
		int num=0;
		Scanner input = new Scanner(new File(file_name));
		while(input.hasNextInt())
		{
			num=input.nextInt();
			sum=sum+num;
			
		}
		return sum;
	}
	
	public void file_list(String file_name)  throws FileNotFoundException
	{
		int num;
		Scanner input = new Scanner(new File(file_name));
		while(input.hasNextInt())
		{
			num = input.nextInt();
			System.out.print(num+" ");
		}
			
	}
	
}
