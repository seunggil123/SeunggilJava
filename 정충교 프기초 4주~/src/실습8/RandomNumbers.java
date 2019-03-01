package 실습8;


public class RandomNumbers {
	public static void main(String[] args)
	{
		final int SIZE = 20;
		int [] randomArray = new int[SIZE];
		
		for(int i=0; i<randomArray.length; i++)
		{
			randomArray[i] = (int)(10*Math.random());
		}
		System.out.println("10보다 작은 정수 난수");
		
		for(int i=0; i<SIZE; i++)
		{
			System.out.println(randomArray[i]);
		}
		
		
		
	}

}
