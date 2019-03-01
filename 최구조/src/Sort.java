
public class Sort {

	public void selectionSort(int[] a) {
		int i, j, min=0;
		for (i = 0; i < a.length - 1; i++) {
			min = i;
			for (j = i + 1; j < a.length; j++) {
				if (a[j] < a[min])
					min = j;
			}

			swap(a,min,i);
		}
		for(int k=0; k<a.length; k++)
		{
			System.out.print(a[k]+" ");
		}
	}

	public void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public void BubbleSort(int []a)
	{
		int i,j,temp,size;
		size=a.length;
		for(i=size-1; i>0; i--)
			for(j=0; j<i; j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		for(int k=0; k<size; k++)
			System.out.print(a[k]+" ");
	}

	public int partition (int a[],int begin, int end)
	{
		int pivot,temp,L,R;

		L=begin;
		R=end;
		pivot = (begin+end)/2;
		while(L<R)
		{
			while((a[L]<a[pivot])&&(L<R))
				L++;
			while((a[R]>=a[pivot])&&(L<R))
				R--;
			if(L<R)
			{
				temp = a[L];
				a[L]=a[R];
				a[R]=temp;

				if(R==pivot)
					return L;
			}
		}
		temp = a[pivot];
		a[pivot] = a[R];
		a[R]=temp;//LÀÌ¶û RÀÌ¶û ¸¸³­°æ¿ì
		return L;
	}

	public void QuickSort(int a[],int begin,int end)
	{
		if(begin<end)
		{
			int p;
			p = partition(a,begin,end);
			QuickSort(a,begin,p-1);
			QuickSort(a,p+1,end);
		}
	}

	public void insertionSort(int a[],int size)
	{
		int i,j,t,temp;
		for(i=1; i<size; i++)
		{
			temp=a[i];
			j=i;
			while((j>0) && a[j-1]>temp)
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;

		}
		for(int k=0; k<a.length; k++)
			System.out.print(a[k]+" ");
	}

	private int sorted[] = new int[30];
	public void merge(int a[],int m, int middle, int n)
	{

		int size = a.length;
		int i,j,k,t;
		i = m;
		j = middle+1;
		k=m;
		while(i<=middle && j<=n)
		{
			if(a[i] <= a[j])
				sorted[k] = a[i++];
			else
				sorted[k]=a[j++];
			k++;
		}
		if(i>middle)
		{
			for(t=j; t<=n; t++,k++)
				sorted[k] =a[t];
		}
		else {
			for(t=i; t<=middle; t++,k++)
				sorted[k] = a[t];
		}
		for(t=m; t<=n; t++)
			a[t]=sorted[t];

	}
	public void mergeSort(int a[],int m,int n)
	{
		int middle;
		if(m<n)
		{
			middle = (m+n)/2;
			mergeSort(a,m,middle);
			mergeSort(a,middle+1,n);
			merge(a,m,middle,n);
		}
	}


	public static void main(String args[])
	{
		int a[] = {5, 4, 2, 7, 1};
		int b[] = {8,7,4,2,1};
		int c[] = {2,1,5,8,6};
		int d[] = {8,1,2,9,5};
		int e[] = {5,2,7,4,1};
		Sort s = new Sort();
		s.selectionSort(a);
		System.out.println();
		s.BubbleSort(b);
		System.out.println();
		s.QuickSort(c, 0, 4);
		for(int i=0; i<c.length; i++)
			System.out.print(c[i]+" ");
		System.out.println();
		s.insertionSort(d, 5);
		s.mergeSort(e, 0, 4);
		System.out.println();
		for(int i=0; i<e.length; i++)
			System.out.print(e[i]+" ");
		
	}
}
