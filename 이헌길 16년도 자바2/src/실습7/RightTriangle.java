package 실습7;

public class RightTriangle extends Shape
{
	public RightTriangle()
	{
		// Shape 기본 생성자를 호출
		super();
	}
	public RightTriangle(int x, char ch)
	{
		// Shape 두 인수 생성자를 호출
		super(x, ch);
	}
	public void draw(int x, int y)
	{
		// y행 아래로 이동
		for ( int i = 1; i <= y; i++)
			System.out.println();
		// 각 행에 대해
		for (int len = 1; len <= rows; len++)
		{
			// x 칸을 들여쓰기
			for (int i = 1; i <= x; i++)
				System.out.print(' ');
			for (int j = 1; j <= len; j++)
				System.out.print(ch);
			System.out.println();
		}
	}
}
