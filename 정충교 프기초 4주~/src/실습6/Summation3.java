package �ǽ�6;

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
	 * �־��� ������ �ڿ����� ���� ���Ѵ�.
	 * @param from ������ ���� ��.
	 * @param to ������ �� ��.
	 * @return �־��� ������ �ڿ����� ��.
	 */
	public static int sum(int from, int to)
	{
		int sumResult = 0;
		int i;
		for (i = from; i < to; i++)
		///// ���� for���ڿ� ;�� �پ��־��ٸ� i<to�� �����϶��� 
		///// �ѹ� ����Ǳ� ������ i=4�� ��µ�!!!! �߿�@.@
		///// �򰥷ȴ�����
		
		{
			sumResult=sumResult+i;
		}
		return sumResult;
	}
}