package �ǽ�7;

public class Triangle extends Shape
{
	public Triangle ()
	{
		// Shape �⺻ �����ڸ� ȣ��
		super();
	}
	public Triangle (int x, char ch)
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
		for(int len = 1; len <= rows; len++)
		{
			// x ĭ�� �鿩����
			for(int i=0; i <= rows-len+x; i++)
				System.out.print(" ");
			for(int i = 1; i <= len; i++)
				System.out.print(ch +" " );
			System.out.println();
		}
	}
}