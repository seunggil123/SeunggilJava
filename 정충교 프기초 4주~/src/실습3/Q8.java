package 실습3;
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("사칙 연산을 하는 프로그램입니다.");
		System.out.println("두 수를 차례로 연산하시오: ");
		
		int a =input.nextInt();
		int b =input.nextInt();
		
		System.out.println("두 수중 어떤 연산을 하시겠습니까? ");
		System.out.println("+ - * / 중 하나를 입력하시오: ");
		
		String word = input.next();
		char operator = word.charAt(0); ////??
		
		double result = 0.0;
		switch(operator)
		{
			case'+': System.out.println((double)a+"+"+(double)b+"="+(double)(a+b));
			break;
			case'-': System.out.println((double)a+"-"+(double)b+"="+(double)(a-b));
			break;
			case'*': System.out.println((double)a+"*"+(double)b+"="+(double)(a*b));
			break;
			case'/': System.out.println((double)a+"/"+(double)b+"="+(double)(a/b));
			break;
			default:
				System.out.println("지원하지 않는 연산입니다.");
				System.exit(-1);
		}
		
		

	}

}
