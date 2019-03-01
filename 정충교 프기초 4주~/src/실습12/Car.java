package ½Ç½À12;

public class Car {

	private String color;
	private int gear;
	private int speed;
	
	public Car()
	{
		
	}
	
	public Car(String color,int gear,int speed)
	{
		this.color=color;
		this.gear=gear;
		this.speed=speed;
	}
	
	public void changeGear(int newgear)
	{
		gear = newgear;
		
	}
	
	public void speedUp(int plus)
	{
		speed = speed+plus;
	}
	
	public void speedDown(int minus) 
	{
		speed = speed -minus;
	}
	
	public int getGear()
	{
		return gear;
	}
	
	public int getspeed()
	{
		return speed;
	}
	
}
