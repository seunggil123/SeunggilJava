package �ǽ�7;

public class RightTriangle extends Shape
{
	public RightTriangle()
	{
		// Shape �⺻ �����ڸ� ȣ��
		super();
	}
	public RightTriangle(int x, char ch)
	{
		// Shape �� �μ� �����ڸ� ȣ��
		super(x, ch);
	}
	public void draw(int x, int y)
	{
		// y�� �Ʒ��� �̵�
		for ( int i = 1; i <= y; i++)
			System.out.println();
		// �� �࿡ ����
		for (int len = 1; len <= rows; len++)
		{
			// x ĭ�� �鿩����
			for (int i = 1; i <= x; i++)
				System.out.print(' ');
			for (int j = 1; j <= len; j++)
				System.out.print(ch);
			System.out.println();
		}
	}
}
