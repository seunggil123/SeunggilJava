package 실습5주차1;
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
			System.out.println("남은 여우의 수: "+count1);
			System.out.println("남은 호랑이의 수: "+count2 );
			System.out.println("남은 사자의 수: "+count3 );
			System.out.println();
			System.out.print("좌표와 동물을 선택하세요: ");
	
			String q1 = input.nextLine();
			String [] str = q1.split(" ");
			
		int x = Integer.parseInt(str[0]); // string값을 int로 변환
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
