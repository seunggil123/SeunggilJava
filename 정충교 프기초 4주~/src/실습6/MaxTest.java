package �ǽ�6;
import java.util.Scanner;
public class MaxTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("�� ���� �� ���� ū ���� ã���ݴϴ�. ");
		System.out.println("�� ���� ������ ���ʷ� �Է��Ͻÿ�: ");

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		System.out.println("�� ���� �� ���� ū ���� "+max(a,b,c)+" �Դϴ�.");

	
		
	}

	public static int max(int a, int b, int c)
	{
		int max1=0;
		
		if(a>=b && b>=c)
			max1 =a;
		else if(a>=c && c>=b)
			max1 =a;
		else if(b>=c && c>=a)
			max1 =b;
		else if(b>=a && a>=c)
			max1=b;
		else if(c>=a && a>=b)
			max1=c;
		else if(c>=b && b>=a)
			max1=c;
		
		return max1;
		
	}
}
