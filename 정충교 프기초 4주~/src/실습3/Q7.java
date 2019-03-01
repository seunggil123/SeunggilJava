package 실습3;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("양수들의 평균을 구하는 프로그램입니다. ");
		System.out.println("입력을 마치려면 0이하의 수를 입력하시오 ");
		
		
		
		
		double sum=0.0;
		int count=0;
		double a;
		System.out.print("숫자를 입력하시오: ");
		
		a=input.nextDouble();
		while(a>0.0) // 이조건이 만족되는 동안 실행
			
		
			{
				sum=sum+a;
				count++;
				System.out.print("숫자를 입력하시오: ");
				a=input.nextDouble();
			}
		System.out.println("평균 = " + sum/count);
		
	}

}
