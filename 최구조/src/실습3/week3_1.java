package 실습3;
import java.util.*;
public class week3_1 {
	public static int[] list;

	public static void main(String[] args) {
		int list_size = 5000+1; // 삽입할 공간 확보
		int count = 0;
		list = new int[list_size];
		RandomList(list); //list[] 에 랜덤 데이터 입력
		SelectionSortCount(list); //list에 있는 데이터를 선택 정렬

		System.out.println(ListInsertDeleteCount(list)); // 빈도수 출력
	}

	/*
	 * 입력 데이터 생성 메소드
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
	 * 선택 정렬 메소드
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
		for(int i = 0; i<100; i++) //100번 반복
		{ 
			int dst = rnd.nextInt(array.length-1);
			for(int j=0;j<array.length-1;j++) // dst 자리를 탐색
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
				// dst 위치에서 삭제
				// count++
			}
			if(array[array.length-1] == array[array.length-2])
				array[array.length-1]=0;
		}

		count = count / 200; //삽입/삭제 평균 빈도수 계산
		return count;
	}


}
