package �ǽ�7;
import java.util.Scanner;
public class MaxTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�� ���� �� ���� ū ���� ã���ݴϴ�. ");
		System.out.println("�� ���� ������ ���ʷ� �Է��Ͻÿ�: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();

		System.out.print("�� ���� �� ���� ū ���� ");
		System.out.println(max(n1, n2, n3) +"�Դϴ�.");

	}

	public static int larger(int i, int j)
	{
		int max1;
		if(i>=j)
		{
			max1=i;
		}
		else
		{
			max1=j;
		}
		return max1;
	}
	public static int max(int i, int j, int k)
	{
		int max;
		if(larger(i,j)==i && larger(i,k)==i)
		{
			max =i;
		}
		else if(larger(j,i)==j && larger(j,k)==j)
		{
			max=j;
		}
		else
		{
			max=k;
		}
		return max;
	}
}	

//	public static int max(int i, int j, int k)
//	{
//		int max;
//		if (i>j && i>k)
//		{
//			max=i;
//		}
//		else if (j>k)
//		{		
//			max =j;
//		}
//		else
//		{
//			max=k;
//		}
//		return max;
//	}
//	
//

