package 실습4주차1;

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
		System.out.println("Sedan0과 Sedan1 비교");
		if(b1 == 1)
			System.out.println("Sedan0이 더 빠릅니다.");
		else if(b1 == -1)
			System.out.println("Sedan1이 더 빠릅니다.");
		else 
			System.out.println("속도가 같습니다.");
		System.out.println();
		
		int b2 = a[1].compareTo(a[2]);
		System.out.println("Sedan1과 Sedan2 비교");
		if(b2 == 1)
			System.out.println("Sedan1이 더 빠릅니다.");
		else if(b2 == -1)
			System.out.println("Sedan2이 더 빠릅니다.");
		else 
			System.out.println("속도가 같습니다.");
		System.out.println();
		
		int b3 = a[2].compareTo(a[3]);
		System.out.println("Sedan2과 Sedan3 비교");
		if(b3 == 1)
			System.out.println("Sedan2이 더 빠릅니다.");
		else if(b3 == -1)
			System.out.println("Sedan3이 더 빠릅니다.");
		else 
			System.out.println("속도가 같습니다.");
		System.out.println();
		
		
		
		
	}

}
