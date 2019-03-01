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
	
	public abstract double getSize(); //ũ��
	public abstract double getCost(); //����/��۰���
	
	public double getLength()
	{
		return length;
	}
	
	public abstract String getName();
	
	/*
	 * compareTo ���ݺ�
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
