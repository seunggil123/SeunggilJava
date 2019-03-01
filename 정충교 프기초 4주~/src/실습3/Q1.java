package 실습3;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("양의 정수를 하나 입력하시오: ");
		
		
		int a = input.nextInt();
		
		
		
		//첫번째 방법
		int i;
		for(i=0; i<=a; i++ )
	
		{
			System.out.print(i+"	");
		
			if(i%10==9)
				System.out.println();
		}
		
		System.out.println();
		//두번째방법
		
		int count=0;
		
		for(i=0; i<=a; i++)
		{
			System.out.print(i+"	");
			count++;
			if(count==10)
			{
				System.out.println();
				count=0;
				
			}
				
		}
	}

}
