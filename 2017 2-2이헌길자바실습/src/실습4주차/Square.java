package 실습4주차;

public class Square implements Geometry {

	private double side;
	
	public Square()
	{
		side = 0.0;
	}
	public Square(double s)
	{
		side =s;
	}
	public double perimeter()
	{
		return 4*side;
	}
	
	public double area()
	{
		return side*side;
	}
	
	
	
	
}
