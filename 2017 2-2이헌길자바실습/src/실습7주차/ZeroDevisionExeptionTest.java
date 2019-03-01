package 실습7주차;

import java.util.Scanner;

public class ZeroDevisionExeptionTest {

	public static void main(String[] args) 
			throws ZeroDevisionExeption  {

		//		
		Scanner input = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");

		double num1=input.nextDouble();
		double num2=input.nextDouble();

		double div = num1 / num2;


		if(num1 == 0 || num2 == 0)
		{
			throw new ZeroDevisionExeption("0을 나눌 수 없습니다.");
		}
		
		else
			System.out.println(div);


	}

}
