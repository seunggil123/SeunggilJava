package �ǽ�8;

public class RandomNumbers2 {

	public static void main(String[] args) {

		final int SIZE =10;
		int [] a = new int[SIZE];

		for(int i=0; i<a.length; i++)
			a[i] = (int)(99*Math.random());

		System.out.println("100���� ���� ���� ����");
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
		System.out.println("���ҵ� �� �ּҰ�: " + min);
		System.out.println("���ҵ� �� �ִ밪: " + max);
		System.out.println("���ҵ��� ��հ� : " + sum/SIZE);
		



	}



}
