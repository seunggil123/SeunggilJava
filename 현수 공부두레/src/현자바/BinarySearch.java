package 현자바;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		int num=input.nextInt();

		int[] a = new int[num];

		/*
		 * 숫자정렬
		 */
		for(int i=0; i<a.length; i++)
		{
			a[i] = input.nextInt();
		}

		for(int i=0; i<a.length-1; i++){
			for(int j=0; j<a.length-1; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}

		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.print("찾으려는값 입력: ");
		int key = input.nextInt();
		
		if(binarySearch(a,num,key)==-1)
		{	
			System.out.println("찾으려는 값이 없습니다.");
		}
		else
			System.out.println("탐색 완료");
		

	}
	static int binarySearch(int[] x, int num, int key)
	{
		int low=0; //배열의 최소 인덱스
		int high=num-1;//배열의 최대 인덱스 
		int mid;//중앙인덱스

		while(high>=low)
		{
			mid= (high+low)/2;
			if(key == mid)
				return mid; //키를 발견
			if(key < x[mid])
				high=mid-1; // 키가 mid인덱스보다 작으면 high를 1줄인다.
			else
				low=mid+1; // 키가 mid인덱스보다 크다면 low를 1증가시킨다.
		}
		return -1; //못찾을시

	}
}
