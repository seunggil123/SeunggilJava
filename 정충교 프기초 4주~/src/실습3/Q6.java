package ½Ç½À3;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i;
		int j;
		
		for(i=1; i<=9; i++)
		{
			for(j=1; j<=9; j++)
				
			{
				System.out.print(i+"x"+j+"="+i*j+"	");
				if(j==9)
					System.out.println();
			}
		}
	}

}
