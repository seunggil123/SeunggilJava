package �ǽ�15;

public class Quick {
	int count=0;

	public int partition(int []arr, int begin, int end)
	{	

		int pivot,temp,L,R;

		L=begin;
		R=end;
		pivot=(begin+end)/2;
		while(L<R)
		{
			while((arr[L]<arr[pivot]) && (L<R)) {
				L++;
				count++;
			}
			while((arr[R]>=arr[pivot]) && (L<R)) {
				R--;
				count++;
			}
			if(L<R) //L�� R�� ���� �ش�Ǵ� ���Ҹ� ã���� ��  L // PIVOT // R �� ����
			{
				temp = arr[L];
				arr[L] = arr[R];
				arr[R] = temp;
				count++;
				if(L==pivot)
					return L;
			} //L�� R�� ��ȯ�� �� �ٽ� L���� R���� ����
		}
		//L�� R�� ���� ��� -> PIVOT�� R�� ��ȯ(���� L�� R�� ���� ����)
		
		
			temp=arr[pivot];
			arr[pivot] = arr[R];
			arr[R] = temp;
			count++;
			return L; //L�� ��ȯ
		
	}

	public void Quick(int arr[],int begin,int end)
	{
		int [] a= new int[arr.length];
		for(int i=0; i<arr.length; i++)
			a[i] = arr[i];
		QuickSort(a,begin,end);
	}
	public void QuickSort(int arr[],int begin,int end)
	{
		if(begin<end)
		{
			int p;
			p = partition(arr,begin,end); //����
			QuickSort(arr,begin,p-1); //���� �κ� ����
			QuickSort(arr,p+1,end); //������ �κ� ����
		}

	}

	public void print_count()
	{
		System.out.println("���� Ƚ�� : " + count);
		System.out.println();
	}

}
