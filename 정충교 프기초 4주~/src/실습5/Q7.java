package 실습5;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean done=false;
		System.out.println("정해진 구간의 짝수들의 합을 구합니다. ");
		while(!done)
		{
			System.out.print("두 개의 정수를 입력하시오: ");
			int num1 = input.nextInt();
			int num2 = input.nextInt();

			if(num1==num2)
			{
				done = true;
				System.out.println("감사합니다. 프로그램을 마칩니다. ");
			}
			else if(num1>=num2)
			{
				System.out.println(evenSum(num2,num1));
			}
			else
			{
				int temp;
				temp =num2;
				num2 = num1;
				num1 = temp;  // num1,num2 바꾸기 x= num2, y=num1
				System.out.println(evenSum(num2,num1));
			
			}
				
//			temp = x;
//		      x = y;
//		      y = temp;
		}
	}
	///////// from부터 to까지 짝수들의 합 //////////
	public static int evenSum(int from, int to)
	{
		int sum =0;
		int a;
		for(a=from; a<=to; a++)
		{
			if(a%2==0)
				sum=sum+a;
		}
		return sum;
	}
}
