package �ǽ�4;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("���� ������ ������������ ����ϴ� ���α׷��Դϴ�.");
		System.out.print("�ְ� �Ѱ踦 �󸶷� �ұ��?");
		
		int upper = input.nextInt();
		
		System.out.print("� ���� ����鸸�� ����ұ��?");
		
		int base = input.nextInt();
		
		int a;
		int count=0;
		for(a=0; a<=upper; a++)
		{
			if(a%base==0)
			{
				System.out.print(a+"	"); //������
				count++; //����� ���� 5������ �ٹٲٱ�
				if(count%5==0)  
				System.out.println();//�ٹٲٱ�
			
			}
		}
	}
	
}

