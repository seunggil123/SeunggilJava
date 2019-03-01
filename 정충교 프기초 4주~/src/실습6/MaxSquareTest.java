package 실습6;
import java.util.Scanner;
public class MaxSquareTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean done = false;

		System.out.println("어떤 수보다 작거나 같은 최대 '정수의 제곱수'를 찾을까요?");
		System.out.println("음이 아닌 정수를 입력하시오. ");
		System.out.println("음수를 입력하면 프로그램이 종료됩니다. ");
		while(!done)
		{
			System.out.print("입력: ");
			int a = input.nextInt();
			if(a>=0)
			{	
				System.out.println(a+"보다 작거나 같은 최대 정수의 제곱수는 "+maxSquare(a)+" 입니다.");
			}
			else if(a<0)
			{	
				done =true;
				System.out.println("프로그램이 끝났습니다. ");
			}


		}
	}
///// 정수의 제곱수 /////////
	public static int maxSquare(int bound)
	{
		int max =0;
		int i;
		for(i=0; i*i<=bound; i++);
		i=i-1;
		max = i*i;
		return max;

	}
}
