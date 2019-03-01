package 실습10;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ArrayReturn3 {

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File("data1.txt"));

		
		int [] a = new int [10];
		int [] b = new int [10];
		System.out.print("배열 1: " +"     ");
		for(int i=0; i<10; i++)
		{
			a[i]=file.nextInt();
			System.out.print(a[i]+"    ");
		}

		System.out.println();
		file.close();
		
		System.out.print("배열 2: "+"     ");
		file = new Scanner(new File("data2.txt"));
		for(int i=0; i<10; i++)
		{
			b[i] = file.nextInt();
			System.out.print(b[i]+"   ");
		}

		file.close();
		System.out.println();
	
		
		System.out.print("배열 3: "+"     ");
		
		int []c = new int [10];
		c=addArray(a,b);
		for(int i=0; i<10; i++)
		{
			System.out.print(c[i]+"   ");
			
		}
		

	}
	
	public static int[] addArray(int[] a1, int[] a2)
	{
		int sum=0;
		int []a = new int[10];
		for(int i=0; i<10; i++)
		{
			sum=a1[i]+a2[i];
			a[i]=sum;
		}
		return a;
		
	}
}
