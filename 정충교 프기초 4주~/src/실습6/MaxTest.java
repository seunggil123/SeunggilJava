package 실습6;
import java.util.Scanner;
public class MaxTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("세 정수 중 가장 큰 수를 찾아줍니다. ");
		System.out.println("세 개의 정수를 차례로 입력하시오: ");

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		System.out.println("세 정수 중 가장 큰 수는 "+max(a,b,c)+" 입니다.");

	
		
	}

	public static int max(int a, int b, int c)
	{
		int max1=0;
		
		if(a>=b && b>=c)
			max1 =a;
		else if(a>=c && c>=b)
			max1 =a;
		else if(b>=c && c>=a)
			max1 =b;
		else if(b>=a && a>=c)
			max1=b;
		else if(c>=a && a>=b)
			max1=c;
		else if(c>=b && b>=a)
			max1=c;
		
		return max1;
		
	}
}
