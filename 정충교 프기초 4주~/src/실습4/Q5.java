package �ǽ�4;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�ŵ����� ǥ�� ����ϴ� ���α׷��Դϴ�.");
		System.out.print("� ���� �ŵ����� ǥ�� ����Ͻðڽ��ϱ�? ������ �Է��ϼ���. ");
		
		int a = input.nextInt();
		
		System.out.print("�� �������� ����Ͻðڽ��ϱ�? �ڿ����� �Է��ϼ���: ");
		
		int b = input.nextInt();
		
		
		int i;
		int power=1;
		for(i=1; i<=b; i++) //b=10�̸� a�� 10��������
		{
			
			power = power*a;
			System.out.println(a+" ^ "+ i+ " = "+power);
		}
	
		
	}

}
