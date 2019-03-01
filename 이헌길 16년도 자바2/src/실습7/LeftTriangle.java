package ½Ç½À7;

public class LeftTriangle extends Shape{

	public LeftTriangle()
	{
		super();
	}
	
	public LeftTriangle(int x,char ch)
	{
		super(x,ch);
	}
	//x=rows
	
	public void draw(int x, int y)
	{
		for(int i=0; i<=y; i++)
			System.out.println();
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows-x; j++)
			{
				System.out.print(" ");
			}
			x++;
			
			for(int k=1; k<=i; k++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	
	
	}
	
}
