package 실습7;
import java.util.Scanner;
public class RandomNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("n1이상 n2 미만 정수 난수를 생성합니다.");
		System.out.print("정수 n1을 입력하세요: ");
		int n1 = input.nextInt();
		System.out.print("정수 n2를 입력하세요: ");
		int n2 = input.nextInt();
		System.out.print("난수를 몇 개나 생성할까요? ");
		int count = input.nextInt();
		int i;
		for(i=1; i<=count; i++)
		{
			System.out.println(randomInt(n1,n2));
		}
		
	}
	
	public static int randomInt(int a, int b)
	{
		int r;
		r=(int)((b-a)*Math.random())+a;
		///x,y사이 난수 -->@@ ((y-x)*Math.random())+y @@
		return r;
	}

}
