package 실습15;

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
			if(L<R) //L과 R이 각각 해당되는 원소를 찾았을 때  L // PIVOT // R 의 형태
			{
				temp = arr[L];
				arr[L] = arr[R];
				arr[R] = temp;
				count++;
				if(L==pivot)
					return L;
			} //L과 R을 교환한 뒤 다시 L증가 R감소 실행
		}
		//L과 R이 만난 경우 -> PIVOT과 R을 교환(현재 L과 R은 만난 상태)
		
		
			temp=arr[pivot];
			arr[pivot] = arr[R];
			arr[R] = temp;
			count++;
			return L; //L을 반환
		
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
			p = partition(arr,begin,end); //분할
			QuickSort(arr,begin,p-1); //왼쪽 부분 집합
			QuickSort(arr,p+1,end); //오른쪽 부분 집합
		}

	}

	public void print_count()
	{
		System.out.println("연산 횟수 : " + count);
		System.out.println();
	}

}
