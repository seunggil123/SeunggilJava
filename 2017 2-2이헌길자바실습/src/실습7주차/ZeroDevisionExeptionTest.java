package �ǽ�7����;

import java.util.Scanner;

public class ZeroDevisionExeptionTest {

	public static void main(String[] args) 
			throws ZeroDevisionExeption  {

		//		
		Scanner input = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ���: ");

		double num1=input.nextDouble();
		double num2=input.nextDouble();

		double div = num1 / num2;


		if(num1 == 0 || num2 == 0)
		{
			throw new ZeroDevisionExeption("0�� ���� �� �����ϴ�.");
		}
		
		else
			System.out.println(div);


	}

}
