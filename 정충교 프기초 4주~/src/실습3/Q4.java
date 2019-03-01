package 실습3;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		System.out.println("정해진 구간의 짝수들의 합을 구합니다.");
		System.out.print("구간 중 가장 작은 수는? ");

		int a = input.nextInt();

		System.out.print("구간 중 가장 큰 수는? ");

		int b = input.nextInt();

		int i;
		int sum=0;
		for(i=a; i<=b; i++)
		{

			if(i%2==0)
				sum = sum+i;

		}
		System.out.print(a + "부터 " + b + "까지의 짝수의 합");
		System.out.println(sum);
	}


}
