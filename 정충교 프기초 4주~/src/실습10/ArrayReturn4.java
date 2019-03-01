package 실습10;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ArrayReturn4 {

	public static void main(String[] args) throws FileNotFoundException
	{

		int [] array;


		Scanner file = new Scanner(new File("data3.txt"));
		int asize = file.nextInt();
		System.out.print("배열1: "+"   ");
		
		int [] a = new int[asize];
		for(int i=0; i<a.length; i++)
		{		
			a[i]=file.nextInt();
			System.out.print(a[i]+"   ");
		}
		System.out.println();
		file.close();
		
		file = new Scanner(new File("data4.txt"));
		int bsize =file.nextInt();
		System.out.print("배열2: "+"   ");
		
		int [] b = new int[bsize];
		for(int i=0; i<b.length; i++)
		{		
			b[i]=file.nextInt();
			System.out.print(b[i]+"  ");
		}
		System.out.println();
		file.close();
	
		System.out.print("연결된 배열: ");
		array=catArrays(a,b);
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+"   ");
	
	
	}
	
	public static int[] catArrays(int[] a1, int[] a2)
	{
		int count = a1.length+a2.length;
		int [] array = new int[count];
		for(int i=0; i<a1.length; i++)
		{
			array[i] = a1[i];
		}
		for(int i=0; i<a2.length; i++)
		{
			array[i+a1.length]=a2[i];
		}
	return array;
	
	}
	
}
