package 실습15;

public class Insert {
	
	public void insertionSort(int a[], int size)
	{
		int temp;
		int j;
		int count=0;
		for(int i=1; i<size; i++)
		{
			temp = a[i];
			j=i;
			while((j>0) && (a[j-1]>temp))
			{
				a[j] = a[j-1];
				j--;
				count++;
			}
			
			a[j] = temp;
			count++;
		}
		
		System.out.println("연산 횟수 : "+count);
		System.out.println();
		
	}
}
