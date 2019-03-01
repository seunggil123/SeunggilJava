package 실습2;
import java.util.Random;

public class week1_time {

	public static void main(String[] args) {

		long start,finish; //시작 시간, 종료 시간, 실행 시간
		double duration=0.0; // 프로그램 수행 시간
		int list_size = 100000; // 리스트 크기 조절
		int[] list = new int[list_size];
		RandomList(list);
		
		// 1) 입력 데이터 생성 : list에 랜덤 데이터 입력

		start = System.currentTimeMillis();
		SelectionSortTime(list);
		// 2) 수행 할 알고리즘(선택 정렬 메서드 호출)
		
		finish = System.currentTimeMillis();
		duration = (finish - start)/1000.0;
		System.out.println(duration);
		// 3) 시간 출력		
	}

	/**
	 * 
	 *  지정된 배열에 랜덤수를 중복없이 배정
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
	 * 선택 정렬 시간 측정 메서드
	 * 리스트의 숫자를 오름차순으로 정렬
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
			for(j=i+1; j<array.length; j++) // j=다음 비교할 대상
			{
				if(min > array[j]) //만약 min이 array[j]보다 크면
				{
					min = array[j]; //min은 array[j]가 된다.
					minIndex = j; // min의 index는 j가 된다.(j번째)

				}
			}
			array[minIndex] = array[i]; //array[minIndex]는 array[i]가 되고
			array[i] = min; //array[i] 는 min(작은수)이 된다.
		}
	}

	
}
