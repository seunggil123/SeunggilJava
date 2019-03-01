package 실습4주차;

import java.util.Scanner;

public class Geometry_test  {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Geometry[] shapes = new Geometry[3];
		
		System.out.println("원의 반지름을 입력하시오: ");
		double a = input.nextDouble();
		
		Circle circle = new Circle(a);
		System.out.println("원의 반지름이 " + a + "인 원의 둘레: " + circle.perimeter());
		System.out.println("원의 반지름이 " + a + "인 원의 면적: " + circle.area());

		
		System.out.println("정사각형의 변의 길이를 입력 하시오: ");
		double b = input.nextDouble();
		Square square = new Square(b);
		System.out.println("변의 길이가 "+ b + "인 정사각형의 둘레: "+ square.perimeter());
		System.out.println("변의 길이가 "+ b + "인 정사각형의 면적: "+ square.area());
	
		System.out.println("삼각형의 변의 길이 세가지를 입력 하시오: ");
		double a1,a2,a3;
		a1 = input.nextDouble();
		a2 = input.nextDouble();
		a3 = input.nextDouble();
		
		Triangle triangle = new Triangle(a1,a2,a3);
		System.out.println("변의 길이가 "+a1+" "+a2+" "+a3+" 인 삼각형의 둘레: "+ triangle.perimeter());
		System.out.println("변의 길이가 "+a1+" "+a2+" "+a3+" 인 삼각형의 면적: "+ triangle.area());
		
	}

}
