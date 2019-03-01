package 실습6;

public class Summation3
{

	public static void main(String[] args)
	{
		int count = 1;
		int from, to;
		while (count <= 10)
		{
			from = count;
			to = count + 3;
			System.out.println("Summation from " + from + " to " + to + " = " + sum(from, to));
			count++;
		}
	} 
	/**
	 * 주어진 구간의 자연수의 합을 구한다.
	 * @param from 구간의 시작 값.
	 * @param to 구간의 끝 값.
	 * @return 주어진 구간의 자연수의 합.
	 */
	public static int sum(int from, int to)
	{
		int sumResult = 0;
		int i;
		for (i = from; i < to; i++)
		///// 만약 for문뒤에 ;가 붙어있었다면 i<to가 거짓일때만 
		///// 한번 실행되기 때문에 i=4가 출력됨!!!! 중요@.@
		///// 헷갈렸던거임
		
		{
			sumResult=sumResult+i;
		}
		return sumResult;
	}
}