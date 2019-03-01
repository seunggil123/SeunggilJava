package �ǽ�3;
import java.util.*;
public class week3_1 {
	public static int[] list;

	public static void main(String[] args) {
		int list_size = 5000+1; // ������ ���� Ȯ��
		int count = 0;
		list = new int[list_size];
		RandomList(list); //list[] �� ���� ������ �Է�
		SelectionSortCount(list); //list�� �ִ� �����͸� ���� ����

		System.out.println(ListInsertDeleteCount(list)); // �󵵼� ���
	}

	/*
	 * �Է� ������ ���� �޼ҵ�
	 */
	public static int[] RandomList(int[] list){
		int tmp = 0;
		Random rnd = new Random();
		for(int i = 0; i<list.length-1; i++)
			list[i] = i;
		for(int i = 0; i<list.length-1; i++){
			int dst = rnd.nextInt(list.length-1);
			tmp = list[i];
			list[i] = list[dst];
			list[dst] = tmp;
		}
		return list; 
	}

	/*
	 * ���� ���� �޼ҵ�
	 */
	public static int[] SelectionSortCount(int[] array){
		int min;
		int minIndex;
		int i,j;
		for(i=0; i<array.length-1; i++){
			min = array[i];
			minIndex = i;
			for(j=i+1; j<array.length-1; j++)
			{
				if(min>array[j])
				{
					min = array[j];
					minIndex=j;
				}
			}
			array[minIndex] = array[i];
			array[i] = min;
		}
		return list;
	}

	public static int ListInsertDeleteCount(int[] array){
		int count = 0;
		Random rnd = new Random();
		for(int i = 0; i<100; i++) //100�� �ݺ�
		{ 
			int dst = rnd.nextInt(array.length-1);
			for(int j=0;j<array.length-1;j++) // dst �ڸ��� Ž��
			{	
				if(j == dst)
				{
					for(int k=array.length-1; k>j; k--)
					{
						array[k] = array[k-1];
						count++;
					}
					array[j] = dst;

				}

			}	
			for(int j=0; j<array.length-1;j++) {
				if(j==dst)
				{
					for(int k=dst; k<array.length-1; k++)
					{	
						array[k] = array[k+1];
						count++;
					}
				}
				// dst ��ġ���� ����
				// count++
			}
			if(array[array.length-1] == array[array.length-2])
				array[array.length-1]=0;
		}

		count = count / 200; //����/���� ��� �󵵼� ���
		return count;
	}


}
