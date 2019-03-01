package 실습10;

public class ArrayReturn2 {

	public static void main(String[] args) {

		int[] array;

		array = makeArray();
		printArray(array,10);
		System.out.println();
		
		
		for(int i=1; i<=10; i++)
		{
			printArray(array,i);
			System.out.println();
		
		}
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

	public static int[] makeArray(int n)
	{
		int [] a = new int [n];
		for(int i=0; i<n; i++)
		{
			a[i] = i*i;
		}

		return a; //다중정의(오버로딩)
	}
}
