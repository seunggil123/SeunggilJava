package �ǽ�5;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean done=false;
		System.out.println("������ ������ ¦������ ���� ���մϴ�. ");
		while(!done)
		{
			System.out.print("�� ���� ������ �Է��Ͻÿ�: ");
			int num1 = input.nextInt();
			int num2 = input.nextInt();

			if(num1==num2)
			{
				done = true;
				System.out.println("�����մϴ�. ���α׷��� ��Ĩ�ϴ�. ");
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
				num1 = temp;  // num1,num2 �ٲٱ� x= num2, y=num1
				System.out.println(evenSum(num2,num1));
			
			}
				
//			temp = x;
//		      x = y;
//		      y = temp;
		}
	}
	///////// from���� to���� ¦������ �� //////////
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
