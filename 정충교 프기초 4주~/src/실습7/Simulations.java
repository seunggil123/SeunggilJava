package �ǽ�7;
import java.util.Scanner;
public class Simulations {

	public static final int TRIALS = 1000000;	//��������

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Over-Under ������ "+ TRIALS + "�� ���ǽ����մϴ�. ");

		boolean done = false;
		while(!done)
		{
			printMenu();
			String word = input.nextLine();
			if(word.equalsIgnoreCase("q"))
			{
				done = true;
			}
			else
			{
				switch(word)
				{
				case "o":  
				}
				System.out.print("�� ��: ");
			}
		}
		
	}

	public static void printMenu()
	{
		System.out.println("��� �Žðڽ��ϱ�? ");
		System.out.println("Over          o");
		System.out.println("Under         u");
		System.out.println("Exactly 7     7");
		System.out.println("���� :          q");
		System.out.print("�Է��ϼ���: ");

	}

//	public static int betOver()
//	{
//		int penny=100;
//		
//		if(rollDice()>7)
//		{
//			penny=penny*2;
//		}
//		else
//		{
//			
//		}
//
//	}

	public static int rollDice()
	{
		int r1,r2;
		int sum=0;

		r1=(int)(6*Math.random())+1;
		r2=(int)(6*Math.random())+1;
		sum=r1+r2;
		return sum;
	}
}
