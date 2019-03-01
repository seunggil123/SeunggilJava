package 실습5;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean done = false;
		while(!done)
		{
			printMenu();
			int i = input.nextInt();
			switch(i) { 
			case 1:	
				printIceCreamMenu();
				int a =input.nextInt();
				System.out.println(a+" 선택, 감사합니다.");
				break;
			case 2:
				printCoffeeCreamMenu();
				int b= input.nextInt();
				System.out.println(b+" 선택, 감사합니다. ");
				break;
			case 3:
				printDrinkMenu();
				int c= input.nextInt();
				System.out.println(c+" 선택, 감사합니다. ");
				break;
		
			case 4:
				System.out.println("감사합니다. 거래를 종료합니다. ");
				done = true;
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		}

	}	

	public static void printMenu()
	{
		System.out.println("아이스크림, 커피, 음료를 파는 자판기입니다.");
		System.out.println("어떤종류를 원하십니까? ");
		System.out.println("아이스크림:     1");
		System.out.println("커피:         2");
		System.out.println("음료:         3");
		System.out.println("종료:         4");
		System.out.print("번호 선택: ");
		return;
	}
	public static void printIceCreamMenu()
	{
		System.out.println("무엇을 드시겠습니까?. ");
		System.out.println("바닐라 아이스크림(1000원):   1");
		System.out.println("아몬드 아이스크림(1400원):   2");
		System.out.println("딸기 아이슼릠(1400원):     3");
		System.out.println("호두 아이스크림(1400원):    4");
		System.out.print("번호 선택: ");
		
	}
	public static void printCoffeeCreamMenu()
	{
		System.out.println("어떤 종류를 원하십니까?. ");
		System.out.println("아메리칸(1000원):    1");
		System.out.println("카페라떼(1400원):    2");
		System.out.println("에스프레소(1400원):   3");
		System.out.print("번호 선택: ");
	}
	public static void printDrinkMenu()
	{
		System.out.println("무엇을 드시겠습니까?.");
		System.out.println("생수(1000원):        1");
		System.out.println("오렌지쥬스(1400원):    2");
		System.out.println("망고쥬스(1400원):     3");
		System.out.println("우유(1400원):        4");
		System.out.println("번호 선택: ");
		
	}


}
