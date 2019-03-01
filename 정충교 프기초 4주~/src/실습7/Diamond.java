package 실습7;
import java.util.Scanner;
public class Diamond {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("양의 정수를 입력하시오: ");

		int n=input.nextInt();
		int i;
		int a,b,c;
		int a1,a2,a3;
		for(i=1; i<=n; i++)
		{
			for(a=1; a<=(n-i); a++)
			{
				System.out.print(" ");
			}
			for(b=1; b<=(1+2*(i-1)); b++)
			{
				System.out.print("X");
			}
			for(c=1; c<=(n-i); c++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		for(i=1; i<=n-1; i++)
		{
			for(a1=1; a1<=i; a1++)
			{
				System.out.print(" ");
			}
			for(a2=1; a2<=2*n-(1+2*i); a2++)
			{
				System.out.print("X");
			}
			for(a3=1; a3<=i; a3++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
