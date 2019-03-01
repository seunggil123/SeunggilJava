package 실습4;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);		
		
		System.out.println("삼각형을 그리는 프로그램입니다.");
		System.out.print("삼각형의 크기를 얼마로 할까요? ");

		int howMuch = input.nextInt();
		
		
		int i;
		int a;
		
		
		for(a=0; a<howMuch; a++) // 큰틀(for문실행)
		{
			
				for(i=0; i < howMuch; i++)
			{
				System.out.print("*");
				
			}
				System.out.println(); //줄바꿈
				howMuch--; //빼줘야 *이 하나씩줄음
				a--; 
			
		}
	
	}

}
