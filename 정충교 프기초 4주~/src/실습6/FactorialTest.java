package �ǽ�6;
import java.util.Scanner;
public class FactorialTest {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("�ڿ����� ����� ���ϴ� ���α׷��Դϴ�. ");
		System.out.println("�ڿ����� �Է��ϼ���: ");
		int a = input.nextInt();
		
		System.out.println("�ݺ��� ��꿡 ���� ��: ");
		System.out.println(Iterative(a));
		System.out.println("�������� ��꿡 ���� ��");
		System.out.println(Recursive(a));
	}
	
	
	public static int Iterative(int n)
	{
		int i;
		int sum=1;
		for(i=1; i<=n; i++)
		{
			sum=sum*i;
		}
		return sum;
	}
	
	public static int Recursive(int n)
	{
		if(n==1)
		{
			return 1;
		}
		
		else
		{
			return n * Recursive(n-1);
		}
	}
	

}
