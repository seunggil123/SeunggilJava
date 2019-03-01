package 실습4;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ATM 프로그램입니다. 번호를 입력하세요.");
		System.out.println("잔액 확인:		1");
		System.out.println("현금인출:      2");
		System.out.println("입금:        3");
		System.out.println("종료:        4");
		System.out.print("번호 선택: ");
		
		int a = input.nextInt();
		switch(a)
		{
		case 1: System.out.println("잔액은 5000.0원입니다.");
			break;
		case 2: System.out.print("금액은? ");
		{		
			double b =input.nextInt();
				if(b>0.0 && b<=5000.0)
					{
					System.out.println("돈을 받으세요.");
					
					System.out.println("잔액은 "+(5000.0-b)+"원입니다.");
					}
				
					else if(b>5000.0)
					{	System.out.println("돈이 모자랍니다.");
						System.out.println("잔액은 5000.0원입니다.");
					}
					break;
		}
		
		case 3: System.out.print("금액은? ");
			double c = input.nextDouble();
			System.out.println("잔액이 "+ (5000.0+c)+"원이 되었습니다.");
			break;
			
		case 4: System.out.println("감사합니다.");
			break;
		default: System.out.println("올바르지 않은 번호입니다.");
			
		
		}
		input.close();
	}

}
