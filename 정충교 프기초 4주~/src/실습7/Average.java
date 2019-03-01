package 실습7;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String word;
		int count=0;
		double sum=0;
		
		System.out.println("합과 평균을 구하는 프로그램입니다.");
		System.out.println("입력을 마치려면 q, 혹은 Q를 입력하시오.");

		boolean done = false;

		//		double x = Double.parseDouble(word); 
		//word를 실수형으로 변환

		while(!done)
		{
			System.out.print("숫자를 입력하시오: ");
			word = input.next();
			if(word.equalsIgnoreCase("q"))
			{
				done = true;

			}
			else /////// if를 썼으면 나머지 else도 써주기
			{
				double x = Double.parseDouble(word);
				count++;
				sum=sum+x;
			}
		}
		System.out.print("합= ");
		System.out.println(sum);
		System.out.print("평균= ");
		System.out.println(sum/count);

	}

}
