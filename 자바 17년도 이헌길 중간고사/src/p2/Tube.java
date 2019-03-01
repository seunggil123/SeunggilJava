package p2;

public class Tube extends Container{
	
	final static double PI = 3.14159;
	
	double radius;
	
	public Tube()
	{
		super();
	}
	
	public Tube(double radius, double length)
	{
		super(length);
		this.radius=radius;	
	}
	
	public String getName()
	{
		return "¿øÅë";
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getSize()
	{
		return 2*PI*radius+length;
	}
	
	public double getCost()
	{
		return 0.25*getSize();
	}
	
}
