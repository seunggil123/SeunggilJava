package �ǽ�5;

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

	////////// from ���� to ���� �ڿ����� �� �޼ҵ� //////////
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
