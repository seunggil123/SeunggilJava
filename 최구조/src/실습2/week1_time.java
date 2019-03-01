package �ǽ�2;
import java.util.Random;

public class week1_time {

	public static void main(String[] args) {

		long start,finish; //���� �ð�, ���� �ð�, ���� �ð�
		double duration=0.0; // ���α׷� ���� �ð�
		int list_size = 100000; // ����Ʈ ũ�� ����
		int[] list = new int[list_size];
		RandomList(list);
		
		// 1) �Է� ������ ���� : list�� ���� ������ �Է�

		start = System.currentTimeMillis();
		SelectionSortTime(list);
		// 2) ���� �� �˰���(���� ���� �޼��� ȣ��)
		
		finish = System.currentTimeMillis();
		duration = (finish - start)/1000.0;
		System.out.println(duration);
		// 3) �ð� ���		
	}

	/**
	 * 
	 *  ������ �迭�� �������� �ߺ����� ����
	 *  @param list
	 *  @return
	 */
	public static int[] RandomList(int[] list)
	{
		int tmp = 0;
		Random rnd = new Random();

		for(int i=0; i< list.length; i++)
			list[i] = i;
		for(int i=0; i<list.length; i++)
		{
			int dst = rnd.nextInt(list.length); 
			tmp = list[i];
			list[i] = list[dst];
			list[dst] = tmp;
		}
		return list;
	}
	/**
	 * ���� ���� �ð� ���� �޼���
	 * ����Ʈ�� ���ڸ� ������������ ����
	 * @param array
	 */

	public static void SelectionSortTime(int[] array)
	{
		int min;
		int minIndex;
		int i,j;

		for(i=0; i<array.length; i++)
		{
			min = array[i];
			minIndex = i;
			for(j=i+1; j<array.length; j++) // j=���� ���� ���
			{
				if(min > array[j]) //���� min�� array[j]���� ũ��
				{
					min = array[j]; //min�� array[j]�� �ȴ�.
					minIndex = j; // min�� index�� j�� �ȴ�.(j��°)

				}
			}
			array[minIndex] = array[i]; //array[minIndex]�� array[i]�� �ǰ�
			array[i] = min; //array[i] �� min(������)�� �ȴ�.
		}
	}

	
}
