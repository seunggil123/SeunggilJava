package �ǽ�15;

public class Bubble {
	
	public void BubbleSort(int []arr)
	{
		int size = arr.length;
		int [] a = new int[size];
		for(int i=0; i<size; i++)
			a[i] = arr[i];
		int cmp_count=0; //�񱳿���
		int move=0; //�̵�
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
		System.out.println("�� ���� : "+cmp_count);
		System.out.println("�̵� : "+move);
		System.out.println("�ѿ��� : "+(cmp_count+move));
		System.out.println();
		
	}
}
