package 실습4;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("양의 정수를 오름차순으로 출력하는 프로그램입니다.");
		System.out.print("최고 한계를 얼마로 할까요?");
		
		int upper = input.nextInt();
		
		System.out.print("어떤 수의 배수들만을 출력할까요?");
		
		int base = input.nextInt();
		
		int a;
		int count=0;
		for(a=0; a<=upper; a++)
		{
			if(a%base==0)
			{
				System.out.print(a+"	"); //배수출력
				count++; //배수의 개수 5개마다 줄바꾸기
				if(count%5==0)  
				System.out.println();//줄바꾸기
			
			}
		}
	}
	
}

