package 실습4;

import java.util.*;

public class week4_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("크기 입력 : ");
		int size = input.nextInt();

		int[][] mat = new int[size][size];
		int count = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int row = i;
				int cul = j;
				if (i == 0)// 첫행
				{
					mat[i][j] = cul + 1;
					System.out.print(mat[i][j] + "	");
					
				} 
				else if (j == 0)// 첫열
				{
					mat[i][j] = row + 1;
					System.out.print(mat[i][j] + "	");	
				} 
				else if (i >= j || i < j)// 곱셈 실행
				{
					mat[i][j] = (row + 1) * (cul + 1);
					System.out.print(mat[i][j] + "	");	
				}

				count++; // 연산을 마친 뒤 카운트 증가
			}
			System.out.println();
		}
		System.out.println("count: " + count);

	}

}