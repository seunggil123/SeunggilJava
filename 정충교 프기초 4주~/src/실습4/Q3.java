package 실습4;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("세 개의 정수를 입력하세요: ");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		
		if(a>=b && b>=c)
			System.out.println(c+" " + b+" " + a);
		else if(a>=b && c>=b)
			System.out.println(b+" " + c+" " + a);
		else if(b>=a && a>=c)
			System.out.println(c+" " + a+" " + b);
		else if(b>=c && c>=a)
			System.out.println(a+" " + c+" " + b);
		else if(c>=a && a>=b)
			System.out.println(b+" " + a+" " + c);
		else if(c>=b && b>=a)
			System.out.println(a+" " + b+" " + c);
		
		
	}

}
