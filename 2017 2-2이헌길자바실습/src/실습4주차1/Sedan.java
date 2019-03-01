package 실습4주차1;


public class Sedan implements Car,Comparable<Car> {

	private int speed;
	private int price;
	private int weightLimit;
	private int maxSpeed;
	
	public Sedan()
	{
		speed=0;
		price=0;
		weightLimit=0;
	}
	
	public Sedan(int speed, int price, int weightLimit)
	{
		this.speed=speed;
		this.price=price;
		this.weightLimit=weightLimit;
	}
	
	public void setMaxSpeed(int speed)
	{
		this.speed = speed;
	}
	
	public void setWeightLimit(int weightLimit)
	{
		this.weightLimit=weightLimit;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public int getMaxSpeed()
	{
		return speed;
	}
	public int getWeightLimit()
	{
		return weightLimit;
	}
	public int getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		
		
//		System.out.println("SportCar");
//		System.out.println("MaxSpeed: " + this.speed);
//		System.out.println("MaxWeightLimit: "+this.weightLimit);
//		System.out.println("Price: " + this.price);
		
		return "Sedan\nMaxSpeed:"+getMaxSpeed()+
				"\nMaxWeightLimit:"+getWeightLimit()+"\nPrice:"+getPrice();
		
	}

	@Override
	public int compareTo(Car car) {
		if(this.speed > ((Sedan)car).speed)
			return 1;
		
		else if(this.speed < ((Sedan)car).speed)
			return -1;
		
		else
			return 0;
	}
	


}
