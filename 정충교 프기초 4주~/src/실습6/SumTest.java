package 실습6;
import java.util.Scanner;
public class SumTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("자연수의 계승을 구하는 프로그램입니다. ");
		System.out.println("자연수를 입력하세요: ");
		int a = input.nextInt();
		
		System.out.println("반복적 계산에 의한 답: ");
		System.out.println(sumIterative(a));
		System.out.println("꼬리물기 계산에 의한 답");
		System.out.println(sumRecursive(a));
		
	}

	
	////일반적 for문//////
	public static int sumIterative(int n)
	{
		int i;
		int sum=0;
		for(i=1; i<=n; i++)
		{
			sum=sum+i;
		}
		return sum;
	}
	////꼬리물기///////
	public static int sumRecursive(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
			return n+sumRecursive(n-1);
	}
	
	
	
	
}
