package �ǽ�4����;

import java.util.Scanner;

public class Geometry_test  {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Geometry[] shapes = new Geometry[3];
		
		System.out.println("���� �������� �Է��Ͻÿ�: ");
		double a = input.nextDouble();
		
		Circle circle = new Circle(a);
		System.out.println("���� �������� " + a + "�� ���� �ѷ�: " + circle.perimeter());
		System.out.println("���� �������� " + a + "�� ���� ����: " + circle.area());

		
		System.out.println("���簢���� ���� ���̸� �Է� �Ͻÿ�: ");
		double b = input.nextDouble();
		Square square = new Square(b);
		System.out.println("���� ���̰� "+ b + "�� ���簢���� �ѷ�: "+ square.perimeter());
		System.out.println("���� ���̰� "+ b + "�� ���簢���� ����: "+ square.area());
	
		System.out.println("�ﰢ���� ���� ���� �������� �Է� �Ͻÿ�: ");
		double a1,a2,a3;
		a1 = input.nextDouble();
		a2 = input.nextDouble();
		a3 = input.nextDouble();
		
		Triangle triangle = new Triangle(a1,a2,a3);
		System.out.println("���� ���̰� "+a1+" "+a2+" "+a3+" �� �ﰢ���� �ѷ�: "+ triangle.perimeter());
		System.out.println("���� ���̰� "+a1+" "+a2+" "+a3+" �� �ﰢ���� ����: "+ triangle.area());
		
	}

}
