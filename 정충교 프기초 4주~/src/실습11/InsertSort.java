package �ǽ�11;

import java.util.Scanner;

public class InsertSort {

	public static void insert(int[] x, int i)
	{
		int temp;
		for(int k=0; k<i; k++)
		{
			if(x[k] > x[k+1])
			{
				temp = x[k];
				x[k] = x[k+1];
				x[k+1] = temp;
			}
			
		}
	}
	
	public static void insertionSort(int[] x, int n)
	{
		insert(x,n);
		for(int k=0; k<n; k++)
		{
			System.out.print(x[k]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int []numbers = new int[1000];
		int size;
		
		System.out.println("������ ������? ");
		size = input.nextInt();
		System.out.println(size + "���� ������ �Է��Ͻÿ�: ");
	
		for(int i=0; i<size; i++)
		{
			
			numbers[i] = input.nextInt();
		}
		
		insertionSort(numbers,size);
		
	}

}
