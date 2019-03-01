package p2;

import java.util.Scanner;
import java.text.*;

public class ContainerTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double length,width,depth,radius;
		
		Container[] c = new Container[10];
		DecimalFormat formatter = new DecimalFormat("0.##");
		String str;

		for(int i=0; i<c.length; i++)
		{
			System.out.println("상자입니까? 원통입니까?");
			str = input.next();
			if(str.equals("상자"))
			{
				System.out.println("길이,폭,깊이를 입력하세요: ");
				length =input.nextInt();
				width =input.nextInt();
				depth =input.nextInt();
				c[i] = new Box(length,width,depth);
			}
			else if(str.equals("원통"))
			{
				System.out.println("길이,반지름을 입력하세요: ");
				length =input.nextDouble();
				radius =input.nextDouble();
				c[i] = new Tube(radius,length);
			}
			else
				System.out.println("잘못입력하셨습니다.");
		}

		

		/*
		 * 가격순으로 정렬
		 */
		Container[] temp = new Container[1];
		for(int i=0; i<c.length; i++)
		{
			for(int j=0; j<c.length-1; j++)
			{
				if((c[j]).compareTo(c[j+1]) == -1)
				{			
					temp[0] = c[j];
					c[j] = c[j+1];
					c[j+1] = temp[0];
				}		

			}
		}

		System.out.println("가격순 오름차순");
		for(int i=0; i<c.length; i++)
		{
			formatter.format(c[i].getSize());
			formatter.format(c[i].getCost());
			System.out.println("종류: "+ c[i].getName()+" 크기: " +c[i].getSize()+" 가격: "+c[i].getCost());
		}


	}

}
