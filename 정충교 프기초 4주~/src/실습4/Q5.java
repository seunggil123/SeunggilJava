package 실습4;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("거듭제곱 표를 출력하는 프로그램입니다.");
		System.out.print("어떤 수의 거듭제곱 표를 출력하시겠습니까? 정수를 입력하세요. ");
		
		int a = input.nextInt();
		
		System.out.print("몇 제곱까지 출력하시겠습니까? 자연수를 입력하세요: ");
		
		int b = input.nextInt();
		
		
		int i;
		int power=1;
		for(i=1; i<=b; i++) //b=10이면 a에 10제곱까지
		{
			
			power = power*a;
			System.out.println(a+" ^ "+ i+ " = "+power);
		}
	
		
	}

}
