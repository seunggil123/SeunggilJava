package �ǽ�6;
import java.util.Scanner;
public class MaxSquareTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean done = false;

		System.out.println("� ������ �۰ų� ���� �ִ� '������ ������'�� ã�����?");
		System.out.println("���� �ƴ� ������ �Է��Ͻÿ�. ");
		System.out.println("������ �Է��ϸ� ���α׷��� ����˴ϴ�. ");
		while(!done)
		{
			System.out.print("�Է�: ");
			int a = input.nextInt();
			if(a>=0)
			{	
				System.out.println(a+"���� �۰ų� ���� �ִ� ������ �������� "+maxSquare(a)+" �Դϴ�.");
			}
			else if(a<0)
			{	
				done =true;
				System.out.println("���α׷��� �������ϴ�. ");
			}


		}
	}
///// ������ ������ /////////
	public static int maxSquare(int bound)
	{
		int max =0;
		int i;
		for(i=0; i*i<=bound; i++);
		i=i-1;
		max = i*i;
		return max;

	}
}
