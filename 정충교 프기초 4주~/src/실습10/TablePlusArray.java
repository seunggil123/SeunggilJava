package 실습10;

import java.util.Scanner;

public class TablePlusArray {

	int num=0;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("행의 수: ");
		int rows = input.nextInt();
		System.out.print("열의 수 : ");
		int cols = input.nextInt();
		System.out.print("난수의 최대값: ");
		int max = input.nextInt();

		System.out.println();

		int [][]table = new int[rows][cols];
		int[] rowSum = new int[rows];
		int[] colSum = new int[cols];
		int total;

		display(table,rows,cols);
		System.out.println();
		System.out.println();
		random(table,rows,cols,max);
		
		calculateRowSums(table, rows,cols,rowSum);

	}

	public static void display(int [][] table, int rows, int cols)
	{

		for(int i=0; i<rows; i++ )
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(table[i][j]+ "	");
			}
			System.out.println();
		}
	}
	
	public static void random(int [][] table, int rows, int cols , int max)
	{
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				table[i][j]=(int)((max+1)*Math.random());
				System.out.print(table[i][j]+"	");
			}
		System.out.println();
		}
			
	}
	
	public static void calculateRowSums(int [][]table, int rows, int cols,int[] rowSum)
	{
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				rowSum[j]= rowSum[j]+table[i][j]; 
				
			}
			
		}
		
		
	}

}
