package �ǽ�3����;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {

		

		Scanner input = new Scanner(System.in);
		

		
		while(true)
		{
			System.out.println("Q �Է½� ����");
			System.out.print("���� �Է�: "  );
			String q1 = input.nextLine();
			
			if(q1.equals("Q"))
			{	
				
				System.out.println("�ý����� ����Ǿ����ϴ�. ");
				break;			
			}
			else

			{
				String [] str = q1.split(" ");
				
				double left = (double)Integer.parseInt(str[0]);
				double right = (double)Integer.parseInt(str[2]);
				
				Calculator A = new Calculator(left,right);
				
				double result=0;
				if(str[1].equals("+"))
					result=A.add();
				else if(str[1].equals("-"))
					result=A.sub();
				else if(str[1].equals("*"))
					result=A.multi();
				else if(str[1].equals("/"))
					result=A.div();
				
				System.out.println(q1 +" = " + result);
				
				

			}
		}



	}

}
