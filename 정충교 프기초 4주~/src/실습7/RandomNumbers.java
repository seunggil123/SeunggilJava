package �ǽ�7;
import java.util.Scanner;
public class RandomNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("n1�̻� n2 �̸� ���� ������ �����մϴ�.");
		System.out.print("���� n1�� �Է��ϼ���: ");
		int n1 = input.nextInt();
		System.out.print("���� n2�� �Է��ϼ���: ");
		int n2 = input.nextInt();
		System.out.print("������ �� ���� �����ұ��? ");
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
		///x,y���� ���� -->@@ ((y-x)*Math.random())+y @@
		return r;
	}

}
