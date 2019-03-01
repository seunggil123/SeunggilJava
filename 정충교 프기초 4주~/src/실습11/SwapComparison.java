package ½Ç½À11;

public class SwapComparison {
	
	public static void swap(int[] a, int i, int j)
	
	{
		int temp;
		a[0] = a[i];
		a[1] = a[j];
		
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}
	
	public static void swap(int x, int y)
	{
		int temp;
		
		temp=x;
		x=y;
		y=temp;
		
		
	}
	
	public static void main(String[] args)
	{
		int [] anArray = new int[2];
		
		anArray[0] = 10;
		anArray[1] = 20;
		swap(anArray,0,1);
		System.out.println("anArray[0] = " + anArray[0] + ", anArray[1] = " + anArray[1]);
		
		anArray[0] = 10;
		anArray[1] = 20;
		swap(anArray[0],anArray[1]);
		System.out.println("anArray[0] = " + anArray[0] + ", anArray[1] = " + anArray[1]);
		
	}
	
	
}
