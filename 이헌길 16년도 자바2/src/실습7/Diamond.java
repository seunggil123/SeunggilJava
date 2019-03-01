package ½Ç½À7;

public class Diamond extends Shape{

	public Diamond()
	{
		super();
	}

	public Diamond(int x,char ch)
	{
		super(x,ch);
	}

	public void draw(int x, int y)
	{
		for(int i=1; i<=y; i++)
			System.out.println();

		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows; j++)
			{	
			if(i%2==1 && j%2==1)
				System.out.print(ch);
			else if(i%2==0 && j%2 ==0)
				System.out.print(ch);
			else
				System.out.print(" ");
			}
			System.out.println();


		}


	}


}	
