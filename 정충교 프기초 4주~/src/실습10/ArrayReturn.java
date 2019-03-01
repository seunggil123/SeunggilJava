package ½Ç½À10;

public class ArrayReturn {

	public static void main(String[] args) {
	
	int[] array;
	
		array = makeArray();
	
		
		
		
	}
	
	public static int[] makeArray()
	{
		int [] a = new int [10];
		for(int i=0; i<10; i++)
		{
			a[i] = i*i;
		}
		
		return a;
	}
	
	public static void printArray(int [] a, int n)
	{
		for(int i=0; i<n; i++)
			System.out.print(a[i]+ " ");
	}

	





}
