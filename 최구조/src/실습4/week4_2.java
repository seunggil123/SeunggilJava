package �ǽ�4;

import java.util.*;

public class week4_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("ũ�� �Է� : ");
		int size = input.nextInt();

		int[][] mat = new int[size][size];
		int count = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int row = i;
				int cul = j;
				if (i == 0)// ù��
				{
					mat[i][j] = cul + 1;
					System.out.print(mat[i][j] + "	");
					
				} 
				else if (j == 0)// ù��
				{
					mat[i][j] = row + 1;
					System.out.print(mat[i][j] + "	");	
				} 
				else if (i >= j || i < j)// ���� ����
				{
					mat[i][j] = (row + 1) * (cul + 1);
					System.out.print(mat[i][j] + "	");	
				}

				count++; // ������ ��ģ �� ī��Ʈ ����
			}
			System.out.println();
		}
		System.out.println("count: " + count);

	}

}