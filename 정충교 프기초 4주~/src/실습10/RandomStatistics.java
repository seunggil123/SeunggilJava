package �ǽ�10;

public class RandomStatistics {

	public static void main(String[] args) {
		System.out.println("100���� ���� ���� ���� ");
		final int SIZE =10;
		int [] array = new int[SIZE];

		writeRandomNumbers(array,SIZE);
		
		System.out.println("���ҵ� �� �ּҰ�: "+min(array));
		System.out.println("���ҵ� �� �ִ밪: "+max(array));
		System.out.println("���ҵ��� ��հ�: "+average(array));


	}

	public static void writeRandomNumbers(int[] a, int n)
	{
		
		for(int i=0; i<10; i++)
		{	
			a[i]=(int)(100*Math.random());;
			System.out.println(a[i]);
		}
		
	}

	public static int min(int[] a)
	{
		int min=a[0];


		for(int i=0; i<10; i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		return min;
	}
	public static int max(int[] a)
	{
		int max=a[0];


		for(int i=0; i<10; i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}

	public static double average(int[] a)
	{
		int sum=0;
		double average;
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];

		}
		average = sum/a.length;
		return average;
	}
}
