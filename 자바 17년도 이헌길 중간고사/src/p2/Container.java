package p2;

public abstract class Container implements Comparable{
	
	double length;
	
	public Container()
	{
		
	}
	
	public Container (double length)
	{
		this.length=length;
	}
	
	public abstract double getSize(); //크기
	public abstract double getCost(); //포장/배송가격
	
	public double getLength()
	{
		return length;
	}
	
	public abstract String getName();
	
	/*
	 * compareTo 가격비교
	 *
	 */
	public int compareTo(Object O)
	{
		if(getCost() < ((Container)O).getCost())
			return 1;
		else if(getCost() > ((Container)O).getCost())
			return -1;
		else
			return 0;
	}
	
}
