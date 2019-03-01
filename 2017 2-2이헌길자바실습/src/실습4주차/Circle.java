package 실습4주차;

public class Circle implements Geometry {
	
	private double radius;
	public Circle()
	{
		radius =0.0;
	}

	public Circle(double r)
	{
		radius = r;	
	}
	
	public double perimeter()
	{
		return 2*PI*radius;
	}
	
	public double area()
	{
		return PI*radius*radius;
	}
	
	
}
