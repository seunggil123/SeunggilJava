package �ǽ�4;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);		
		
		System.out.println("�ﰢ���� �׸��� ���α׷��Դϴ�.");
		System.out.print("�ﰢ���� ũ�⸦ �󸶷� �ұ��? ");

		int howMuch = input.nextInt();
		
		
		int i;
		int a;
		
		
		for(a=0; a<howMuch; a++) // ūƲ(for������)
		{
			
				for(i=0; i < howMuch; i++)
			{
				System.out.print("*");
				
			}
				System.out.println(); //�ٹٲ�
				howMuch--; //����� *�� �ϳ�������
				a--; 
			
		}
	
	}

}
