package �ǽ�4����1;

public class Car_test {

	public static void main(String[] args) {
		
		SportCar sportcar = new SportCar(300,250,300000);
		System.out.println(sportcar);
		System.out.println();
		Sedan sedan = new Sedan(200,500,30000);
		System.out.println(sedan);
		System.out.println();
		Truck truck = new Truck(100,5000,20000);
		System.out.println(truck);
		System.out.println();
		
		System.out.println("----- Sedan speed Test -----");
		System.out.println();
		
		Car [] a = new Car[4];
		a[0] = new Sedan(400,250,300000);
		System.out.println(a[0]);
		System.out.println();
		a[1] = new Sedan(100,250,300000);
		System.out.println(a[1]);
		System.out.println();
		a[2] = new Sedan(300,250,300000);
		System.out.println(a[2]);
		System.out.println();
		a[3] = new Sedan(300,250,300000);
		System.out.println(a[3]);
		System.out.println();
		
		int b1 = a[0].compareTo(a[1]);
		System.out.println("Sedan0�� Sedan1 ��");
		if(b1 == 1)
			System.out.println("Sedan0�� �� �����ϴ�.");
		else if(b1 == -1)
			System.out.println("Sedan1�� �� �����ϴ�.");
		else 
			System.out.println("�ӵ��� �����ϴ�.");
		System.out.println();
		
		int b2 = a[1].compareTo(a[2]);
		System.out.println("Sedan1�� Sedan2 ��");
		if(b2 == 1)
			System.out.println("Sedan1�� �� �����ϴ�.");
		else if(b2 == -1)
			System.out.println("Sedan2�� �� �����ϴ�.");
		else 
			System.out.println("�ӵ��� �����ϴ�.");
		System.out.println();
		
		int b3 = a[2].compareTo(a[3]);
		System.out.println("Sedan2�� Sedan3 ��");
		if(b3 == 1)
			System.out.println("Sedan2�� �� �����ϴ�.");
		else if(b3 == -1)
			System.out.println("Sedan3�� �� �����ϴ�.");
		else 
			System.out.println("�ӵ��� �����ϴ�.");
		System.out.println();
		
		
		
		
	}

}
