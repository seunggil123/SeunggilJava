package p2;

public class Box extends Container {
	
	double width;
	double depth;
	
	public Box(){
		super();
	}
	
	public Box(double length,double width, double depth)
	{	
		super(length);
		this.width = width;
		this.depth = depth;
	}
	
	public String getName()
	{
		return "¹Ú½º";
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getDepth()
	{
		return depth;
	}
	
	public double getSize()
	{
		return length+width+depth;
	}
	
	public double getCost()
	{
		return 0.35*getSize();
	}
	
	
	
}
