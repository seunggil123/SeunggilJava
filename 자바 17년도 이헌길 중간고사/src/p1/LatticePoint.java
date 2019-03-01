package p1;

public class LatticePoint {
	
	int x,y;
	
	public LatticePoint()
	{
		x=0;
		y=0;
	}
	
	public LatticePoint(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void LatticePointadd(LatticePoint p)
	{
		this.x = x+ p.getX();
		this.y = y+ p.getY(); 
	}
	
	public double distance(LatticePoint p)
	{
		double distance = (x-p.getX())*(x-p.getX()) + (y-p.getY())*(y-p.getY());
		return distance;
	}
	
	public double distance()
	{
		double distance = ((x-0)*(x-0) + (y-0)*(y-0));
		return distance;
	}
	
	
	
}
