package p1;

public class IntegerComplex extends LatticePoint{

	int i;
	int j=i*i;
	int a;
	int multi_num=0;
	public IntegerComplex(int x, int y)
	{
		super(x,y);
	}
	
	public void SetComplex(int x,int y)
	{
		 a = x+y*i;
		 
	}
	
	public int getComplex()
	{
		return a;
	}
	
	public double selfMulti(double b)
	{
		b =b*b;
		multi_num++;
		return b;
	}
	
	public int getMultinum()
	{
		return multi_num;
	}
	
	

	
	
}
