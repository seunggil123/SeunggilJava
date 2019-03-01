package 실습7;
import java.util.Scanner;
public class Simulations {

	public static final int TRIALS = 1000000;	//전역변수

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Over-Under 게임을 "+ TRIALS + "번 모의실험합니다. ");

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
				System.out.print("딴 돈: ");
			}
		}
		
	}

	public static void printMenu()
	{
		System.out.println("어디에 거시겠습니까? ");
		System.out.println("Over          o");
		System.out.println("Under         u");
		System.out.println("Exactly 7     7");
		System.out.println("종료 :          q");
		System.out.print("입력하세요: ");

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
