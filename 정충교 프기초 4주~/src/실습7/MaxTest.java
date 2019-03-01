package 실습7;
import java.util.Scanner;
public class MaxTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("세 정수 중 가장 큰 수를 찾아줍니다. ");
		System.out.println("세 개의 정수를 차례로 입력하시오: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();

		System.out.print("세 정수 중 가장 큰 수는 ");
		System.out.println(max(n1, n2, n3) +"입니다.");

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

