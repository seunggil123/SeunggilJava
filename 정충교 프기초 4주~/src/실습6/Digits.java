package 실습6;
import java.util.Scanner;
public class Digits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("정수의 자리 수를 알려줍니다. ");
		System.out.println("정수를 입력하시오.");
		System.out.println("int 타입 정수이어야 하고 0이 아니어야 합니다.");
		int a = input.nextInt();
		System.out.println(digits(a)+" 자리 수입니다. ");
		int b;
		int c;
		int d;
		for(b=digits(a)-1; b>=0;)
		{
			c= a / powersOfTen(b);
			d= a % powersOfTen(b);
			System.out.print(c+" ");
			b--;
			a=d;			
		}
	}

	////// 10의 거듭제곱수 ////////////
	public static int powersOfTen(int n)
	{
		int a;
		int x1=1;
		{
			for(a=1; a<=n; a++)
				x1 = x1*10;
		}
		return x1;
	}
	/////// 자릿수 계산 //////////
	public static int digits(int n)
	{
		int i;
		for(i=9; n/powersOfTen(i)==0; i--);
		/////////for문끝에;가 붙으면 중간 조건문이 거짓일때 값만 나오고
		//////////밑에 문장 실행///////////
		return i+1;

	}

}
