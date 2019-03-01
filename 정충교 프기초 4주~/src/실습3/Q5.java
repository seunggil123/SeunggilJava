package 실습3;
import java.util.Scanner;
public class Q5 {
////////////////////행렬//////////////////////
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("표를 인쇄합니다.");
		
		System.out.println("행을 몇 개 만들까요? ");
		int row = input.nextInt();
		System.out.println("열을 몇 개 만들까요? ");
		int column = input.nextInt();
		
		
		int i;
		int j;
		for(i=0; i<row; i++)
		{
			for(j=0; j<column; j++)
				{
			
				System.out.print("("+i+","+j+")");
				
				}
//			j=0;
			System.out.println();
		}
		

	}

}

