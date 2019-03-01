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
			System.out.println("�����Դϱ�? �����Դϱ�?");
			str = input.next();
			if(str.equals("����"))
			{
				System.out.println("����,��,���̸� �Է��ϼ���: ");
				length =input.nextInt();
				width =input.nextInt();
				depth =input.nextInt();
				c[i] = new Box(length,width,depth);
			}
			else if(str.equals("����"))
			{
				System.out.println("����,�������� �Է��ϼ���: ");
				length =input.nextDouble();
				radius =input.nextDouble();
				c[i] = new Tube(radius,length);
			}
			else
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}

		

		/*
		 * ���ݼ����� ����
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

		System.out.println("���ݼ� ��������");
		for(int i=0; i<c.length; i++)
		{
			formatter.format(c[i].getSize());
			formatter.format(c[i].getCost());
			System.out.println("����: "+ c[i].getName()+" ũ��: " +c[i].getSize()+" ����: "+c[i].getCost());
		}


	}

}
