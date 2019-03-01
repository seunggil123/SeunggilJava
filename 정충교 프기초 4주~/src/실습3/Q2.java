package 실습3;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("양의 정수를 하나 입력하시오: ");
		
		int a = input.nextInt();
		
		int i;
		
		for(i=a; i>=0; i--)
		{
			System.out.print(i+" ");
		}
		
	}
	

}
