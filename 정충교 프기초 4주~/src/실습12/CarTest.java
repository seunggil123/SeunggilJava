package ½Ç½À12;

public class CarTest {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.changeGear(1);
		myCar.speedUp(5);
		myCar.speedDown(3);
		
		System.out.println(myCar.getGear());
		System.out.println(myCar.getspeed());
		
	}

}
