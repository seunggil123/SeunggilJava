package �ǽ�2;

public class week1_count {

	public static void main(String[] args) {
		
		int list_size = 100000; // ����Ʈ ũ�� ����6
		int count=0;
		int[] list = new int[list_size];
		week1_time.RandomList(list);
		
		// 1) �Է� ������ ���� : list�� ���� ������ �Է�
		
		count = SelectionSortCount(list);
		
		// 2) ���� �� �˰���(���� ���� �޼��� ȣ��)
		
		System.out.println(count);
		// 3) ���� Ƚ�� ���		
		
	}
	
	/**
	 * ���� ���� ���� Ƚ�� ���� �޼���
	 * @param array
	 * return
	 * 
	 */

	public static int SelectionSortCount(int[] array)
	{
		int min;
		int minIndex;
		int i,j;
		int comparisonCount =0;

		for(i=0; i<array.length; i++)
		{
			min = array[i];
			minIndex = i;
			for(j=i+1; j<array.length; j++)
			{
				if(min > array[j])
				{	
					comparisonCount++;
					min = array[j];
					minIndex = j;
				}
			}
			array[minIndex] = array[i];
			array[i] = min;

		}	
		return comparisonCount;
	}


}
