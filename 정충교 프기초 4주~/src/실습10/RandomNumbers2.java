package ½Ç½À10;

public class RandomNumbers2 {

	public static void main(String[] args) {
		
		final int SIZE = 20;
		final int MAX = 10;
		int [] intArray;
		
		intArray = makeRandomArray(SIZE,MAX);
		printArray(intArray,MAX);
		
		
	}
	
	public static int[] makeRandomArray(int n, int max)
	{
		int [] randomArray = new int[n];
		for(int i=0; i<n; i++)
		{
			randomArray[i]=(int)(max*Math.random());
		}
		return randomArray;
	}
	
	public static void printArray(int [] a, int n)
	{
		for(int i=0; i<n; i++)
			System.out.print(a[i]+ " ");
	}

}
