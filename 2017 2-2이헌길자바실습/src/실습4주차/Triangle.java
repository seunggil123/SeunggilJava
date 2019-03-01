package 실습4주차;

public class Triangle implements Geometry {

	private double a,b,c;
	
	public Triangle()
	{
		a=b=c=0.0;
	}
	
	public Triangle (double a1, double b1, double c1)
	{
		a=a1;
		b=b1;
		c=c1;
	}
	
	public double perimeter()
	{
		return a+b+c;
	}
	
	public double area()
	{
		double s = (a+b+c)/2.0;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	
}
