package �ǽ�7;

public class Square extends Shape{

	public Square()
	{
		super();

	}
	public Square(int x, char ch)
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
			for(int j = 1; j <= rows; j++)
				System.out.print(ch);
			System.out.println();
		}
	}
}

