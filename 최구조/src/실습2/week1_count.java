package 실습2;

public class week1_count {

	public static void main(String[] args) {
		
		int list_size = 100000; // 리스트 크기 조절6
		int count=0;
		int[] list = new int[list_size];
		week1_time.RandomList(list);
		
		// 1) 입력 데이터 생성 : list에 랜덤 데이터 입력
		
		count = SelectionSortCount(list);
		
		// 2) 수행 할 알고리즘(선택 정렬 메서드 호출)
		
		System.out.println(count);
		// 3) 연산 횟수 출력		
		
	}
	
	/**
	 * 선택 정렬 연산 횟수 측정 메서드
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
