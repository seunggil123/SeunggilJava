package �ǽ�5;

public class Q5 {

	public static void main(String[] args) {
		int upto;
		for(upto=100; upto<=120; upto++)
		{
			System.out.print("Summation of natural num upto "+upto+" = ");
			System.out.println(sum(upto));
		}
		
	}
	/////// �־��� �ڿ��������� �ڿ����� �� �޼ҵ� //////////
	public static int sum(int upto)
	{
		int sum=0;
		int a;
		for(a=1; a<=upto; a++)
		{
			sum=sum+a;
		}
		return sum;
	}
	
	
	
}
