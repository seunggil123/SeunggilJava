package �ǽ�6;
import java.util.Scanner;
public class Digits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("������ �ڸ� ���� �˷��ݴϴ�. ");
		System.out.println("������ �Է��Ͻÿ�.");
		System.out.println("int Ÿ�� �����̾�� �ϰ� 0�� �ƴϾ�� �մϴ�.");
		int a = input.nextInt();
		System.out.println(digits(a)+" �ڸ� ���Դϴ�. ");
		int b;
		int c;
		int d;
		for(b=digits(a)-1; b>=0;)
		{
			c= a / powersOfTen(b);
			d= a % powersOfTen(b);
			System.out.print(c+" ");
			b--;
			a=d;			
		}
	}

	////// 10�� �ŵ������� ////////////
	public static int powersOfTen(int n)
	{
		int a;
		int x1=1;
		{
			for(a=1; a<=n; a++)
				x1 = x1*10;
		}
		return x1;
	}
	/////// �ڸ��� ��� //////////
	public static int digits(int n)
	{
		int i;
		for(i=9; n/powersOfTen(i)==0; i--);
		/////////for������;�� ������ �߰� ���ǹ��� �����϶� ���� ������
		//////////�ؿ� ���� ����///////////
		return i+1;

	}

}
