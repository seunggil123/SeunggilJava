package 실습7;

public class Triangle extends Shape
{
	public Triangle ()
	{
		// Shape 기본 생성자를 호출
		super();
	}
	public Triangle (int x, char ch)
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
		for(int len = 1; len <= rows; len++)
		{
			// x 칸을 들여쓰기
			for(int i=0; i <= rows-len+x; i++)
				System.out.print(" ");
			for(int i = 1; i <= len; i++)
				System.out.print(ch +" " );
			System.out.println();
		}
	}
}