package �ǽ�3;
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("��Ģ ������ �ϴ� ���α׷��Դϴ�.");
		System.out.println("�� ���� ���ʷ� �����Ͻÿ�: ");
		
		int a =input.nextInt();
		int b =input.nextInt();
		
		System.out.println("�� ���� � ������ �Ͻðڽ��ϱ�? ");
		System.out.println("+ - * / �� �ϳ��� �Է��Ͻÿ�: ");
		
		String word = input.next();
		char operator = word.charAt(0); ////??
		
		double result = 0.0;
		switch(operator)
		{
			case'+': System.out.println((double)a+"+"+(double)b+"="+(double)(a+b));
			break;
			case'-': System.out.println((double)a+"-"+(double)b+"="+(double)(a-b));
			break;
			case'*': System.out.println((double)a+"*"+(double)b+"="+(double)(a*b));
			break;
			case'/': System.out.println((double)a+"/"+(double)b+"="+(double)(a/b));
			break;
			default:
				System.out.println("�������� �ʴ� �����Դϴ�.");
				System.exit(-1);
		}
		
		

	}

}
