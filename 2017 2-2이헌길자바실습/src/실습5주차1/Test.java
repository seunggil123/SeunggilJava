package �ǽ�5����1;
import java.util.*;

import java.util.Random;
public class Test {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random random = new Random();

		Animal[][] a = new Animal[3][3];
		int count1=0;
		int count2=0;
		int count3=0;
		
		boolean done = false;
		while(!done)
		{
			System.out.println("###############");
			for(int i=0; i<3; i++)
			{
				for(int j=0; j<3; j++)
				{
					System.out.print("?      ");
					int num1 = random.nextInt(3);
					
					if(num1 == 0)
					{
						a[i][j] = new Fox();
						count1++;
					}

					else if (num1 == 1)
					{
						a[i][j] = new Lion();
						count2++;
					}
					else 
					{
						a[i][j] = new Tiger();
						count3++;
					}
				}
				
				System.out.println();
			}
			System.out.println("###############");
			System.out.println();
			System.out.println("���� ������ ��: "+count1);
			System.out.println("���� ȣ������ ��: "+count2 );
			System.out.println("���� ������ ��: "+count3 );
			System.out.println();
			System.out.print("��ǥ�� ������ �����ϼ���: ");
	
			String q1 = input.nextLine();
			String [] str = q1.split(" ");
			
		int x = Integer.parseInt(str[0]); // string���� int�� ��ȯ
		int y = Integer.parseInt(str[1]);
		String name =str[2];
			
		
		
		
		
		
		//		if(str[1].equals("0"))
//			result=A.add();
//		else if(str[1].equals("-"))
//			result=A.sub();
//		else if(str[1].equals("*"))
//			result=A.multi();
//		else if(str[1].equals("/"))
//			result=A.div();
//		
		}

	}


}
