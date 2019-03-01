package �ǽ�6;
import java.util.Scanner;
public class SumTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("�ڿ����� ����� ���ϴ� ���α׷��Դϴ�. ");
		System.out.println("�ڿ����� �Է��ϼ���: ");
		int a = input.nextInt();
		
		System.out.println("�ݺ��� ��꿡 ���� ��: ");
		System.out.println(sumIterative(a));
		System.out.println("�������� ��꿡 ���� ��");
		System.out.println(sumRecursive(a));
		
	}

	
	////�Ϲ��� for��//////
	public static int sumIterative(int n)
	{
		int i;
		int sum=0;
		for(i=1; i<=n; i++)
		{
			sum=sum+i;
		}
		return sum;
	}
	////��������///////
	public static int sumRecursive(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
			return n+sumRecursive(n-1);
	}
	
	
	
	
}
