package ½Ç½À9;
import java.util.*;
public class SortDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number,size;
		
		System.out.println("Enter the number of data items: ");
		size = input.nextInt();
		
		Integer[] list = new Integer[size];
		System.out.println("Enter data: ");
		for(int i=0; i<size; i++)
		{
			System.out.print(": ");
			number = input.nextInt();
			list[i]= number;
		}
		
//		SelectionSort.sort(list,size);
		
		System.out.println("The sorted data is: ");
		for(int i=0; i < size; i++)
			System.out.println(list[i]);
		
		
		
	}

}
