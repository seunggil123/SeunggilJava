package ½Ç½À8;

public class ArrayAdd {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		
		for(int i=0; i<a.length; i++)
			a[i] = (int)(9*Math.random());
		
		for(int i=0; i<b.length; i++)
			b[i] = (int)(9*Math.random());
		
		for(int i=0; i<c.length; i++)
			c[i] = a[i]+b[i];
		
		printArray(a);
		printArray(b);
		printArray(c);
		
	}

	public static void printArray(int [] array)
	{
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+" ");
			System.out.println();
	}
}
