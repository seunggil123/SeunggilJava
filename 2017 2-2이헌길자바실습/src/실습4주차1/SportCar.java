package 실습4주차1;
public class SportCar implements Car,Comparable<Car>{

	private int speed;
	private int price;
	private int weightLimit;
	

	public SportCar()
	{
		speed=0;
		price=0;
		weightLimit=0;
	}

	public SportCar(int speed, int price, int weightLimit)
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

		return "SportCar\nMaxSpeed:"+getMaxSpeed()+
				"\nMaxWeightLimit:"+getWeightLimit()+"\nPrice:"+getPrice();
	}
		public int compareTo(Car car) {
			if(this.speed > ((SportCar)car).speed)
				return 1;

			else if(this.speed < ((SportCar)car).speed)
				return -1;

			else
				return 0;
		}
	}

