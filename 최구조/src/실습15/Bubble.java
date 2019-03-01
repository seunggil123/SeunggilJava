package 실습15;

public class Bubble {
	
	public void BubbleSort(int []arr)
	{
		int size = arr.length;
		int [] a = new int[size];
		for(int i=0; i<size; i++)
			a[i] = arr[i];
		int cmp_count=0; //비교연산
		int move=0; //이동
		for(int i=size-1; i>0; i--)
		{
			for(int j=0; j<i; j++)
			{	
				cmp_count++;
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					move++;
				}
			}
		}
		System.out.println("비교 연산 : "+cmp_count);
		System.out.println("이동 : "+move);
		System.out.println("총연산 : "+(cmp_count+move));
		System.out.println();
		
	}
}
