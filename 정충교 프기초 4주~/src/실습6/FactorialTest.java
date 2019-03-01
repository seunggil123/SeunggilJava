package 실습6;
import java.util.Scanner;
public class FactorialTest {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("자연수의 계승을 구하는 프로그램입니다. ");
		System.out.println("자연수를 입력하세요: ");
		int a = input.nextInt();
		
		System.out.println("반복적 계산에 의한 답: ");
		System.out.println(Iterative(a));
		System.out.println("꼬리물기 계산에 의한 답");
		System.out.println(Recursive(a));
	}
	
	
	public static int Iterative(int n)
	{
		int i;
		int sum=1;
		for(i=1; i<=n; i++)
		{
			sum=sum*i;
		}
		return sum;
	}
	
	public static int Recursive(int n)
	{
		if(n==1)
		{
			return 1;
		}
		
		else
		{
			return n * Recursive(n-1);
		}
	}
	

}
