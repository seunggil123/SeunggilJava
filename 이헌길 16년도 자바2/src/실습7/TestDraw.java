package 실습7;

import java.util.Scanner;

public class TestDraw {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Shape shape = null;
		int shapeNumber;
		System.out.println("모형 숫자입력: ");
		shapeNumber = input.nextInt();

		switch(shapeNumber)
		{
		case 1: shape = new Square(4,'*');
		break;
		case 2: shape = new RightTriangle(5,'#');
		break;
		case 3: shape = new Triangle(6,'+');
		break;
		case 4: shape = new LeftTriangle(6,'#');
		break;
		case 5: shape = new Diamond(7,'+');
		}

		shape.draw(1,1);



	}

}
