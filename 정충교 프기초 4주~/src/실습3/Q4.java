package �ǽ�3;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		System.out.println("������ ������ ¦������ ���� ���մϴ�.");
		System.out.print("���� �� ���� ���� ����? ");

		int a = input.nextInt();

		System.out.print("���� �� ���� ū ����? ");

		int b = input.nextInt();

		int i;
		int sum=0;
		for(i=a; i<=b; i++)
		{

			if(i%2==0)
				sum = sum+i;

		}
		System.out.print(a + "���� " + b + "������ ¦���� ��");
		System.out.println(sum);
	}


}
