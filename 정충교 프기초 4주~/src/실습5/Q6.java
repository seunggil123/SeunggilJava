package 실습5;

public class Q6 {

	public static void main(String[] args) {
	
		int i;
		int j=100;
		
		for(i=1; i<=20; i++)
		{
			System.out.print("Summation from "+i+" to "+ j+" = ");
			System.out.println(sum(i,j));
			j++;
		}
		
	}

	////////// from 부터 to 까지 자연수의 합 메소드 //////////
	public static int sum(int from , int to)
	{
		int sum=0;
		int a;
		for(a=from; a<=to; a++)
		{
			sum=sum+a;
		}
		return sum;
	}
}
