package �ǽ�3;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� ������ �ϳ� �Է��Ͻÿ�: ");
		
		
		int a = input.nextInt();
		
		
		
		//ù��° ���
		int i;
		for(i=0; i<=a; i++ )
	
		{
			System.out.print(i+"	");
		
			if(i%10==9)
				System.out.println();
		}
		
		System.out.println();
		//�ι�°���
		
		int count=0;
		
		for(i=0; i<=a; i++)
		{
			System.out.print(i+"	");
			count++;
			if(count==10)
			{
				System.out.println();
				count=0;
				
			}
				
		}
	}

}
