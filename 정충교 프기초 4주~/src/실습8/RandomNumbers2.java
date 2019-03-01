package 실습8;

public class RandomNumbers2 {

	public static void main(String[] args) {

		final int SIZE =10;
		int [] a = new int[SIZE];

		for(int i=0; i<a.length; i++)
			a[i] = (int)(99*Math.random());

		System.out.println("100보다 작은 정수 난수");
		for(int i=0; i<SIZE; i++)
			System.out.println(a[i]);

		int max=a[0];

		int min=a[0];

		int sum=0;

		for(int i=0; i<SIZE; i++)
		{
			if(max<a[i])
			{	
				max = a[i];
			}
			if(min>a[i])
			{
				min = a[i];
			}
			sum=sum+a[i];
			
		}
		System.out.println("원소들 중 최소값: " + min);
		System.out.println("원소들 중 최대값: " + max);
		System.out.println("원소들의 평균값 : " + sum/SIZE);
		



	}



}
