package p1;
import java.util.*;
import java.util.Scanner;

public class LatticeTest extends Exception {

	public static void main(String[] args)

	{
		Scanner input = new Scanner(System.in);
		int x,y;
		
		try
		{	
			System.out.println("�� ���� �Է�: ");
			x= input.nextInt();
			y= input.nextInt();
			IntegerComplex num1 = new IntegerComplex(x,y);
			boolean done = false;

			while(!done)
			{
				if(num1.distance() > 10)
					done = true;

				else
				{
					double i= num1.getComplex(); // ���Ҽ� i = num1
					double distance = num1.distance();

					num1.selfMulti(distance);

				}
			}

			System.out.println("���� Ƚ��: " + num1.getMultinum());
			System.out.println("�Ÿ� ��: " + num1.distance());

		}

		catch(InputMismatchException e)
		{
			System.out.println("������ �ٽ� �Է��Ͻÿ�: ");

		}


	}
}





