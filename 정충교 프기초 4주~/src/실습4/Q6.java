package �ǽ�4;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ATM ���α׷��Դϴ�. ��ȣ�� �Է��ϼ���.");
		System.out.println("�ܾ� Ȯ��:		1");
		System.out.println("��������:      2");
		System.out.println("�Ա�:        3");
		System.out.println("����:        4");
		System.out.print("��ȣ ����: ");
		
		int a = input.nextInt();
		switch(a)
		{
		case 1: System.out.println("�ܾ��� 5000.0���Դϴ�.");
			break;
		case 2: System.out.print("�ݾ���? ");
		{		
			double b =input.nextInt();
				if(b>0.0 && b<=5000.0)
					{
					System.out.println("���� ��������.");
					
					System.out.println("�ܾ��� "+(5000.0-b)+"���Դϴ�.");
					}
				
					else if(b>5000.0)
					{	System.out.println("���� ���ڶ��ϴ�.");
						System.out.println("�ܾ��� 5000.0���Դϴ�.");
					}
					break;
		}
		
		case 3: System.out.print("�ݾ���? ");
			double c = input.nextDouble();
			System.out.println("�ܾ��� "+ (5000.0+c)+"���� �Ǿ����ϴ�.");
			break;
			
		case 4: System.out.println("�����մϴ�.");
			break;
		default: System.out.println("�ùٸ��� ���� ��ȣ�Դϴ�.");
			
		
		}
		input.close();
	}

}
