package �ǽ�3;
import java.util.Scanner;
public class Q5 {
////////////////////���//////////////////////
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("ǥ�� �μ��մϴ�.");
		
		System.out.println("���� �� �� ������? ");
		int row = input.nextInt();
		System.out.println("���� �� �� ������? ");
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

