package �ǽ�5;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		boolean done = false;

		while(!done)
		{	
			System.out.println("���̽�ũ��, Ŀ��, ���Ḧ �Ĵ� ���Ǳ��Դϴ�.");
			System.out.println("������� ���Ͻʴϱ�? ");
			System.out.println("���̽�ũ��:     1");
			System.out.println("Ŀ��:         2");
			System.out.println("����:         3");
			System.out.println("����:         4");
			System.out.print("��ȣ ����: ");
			int i = input.nextInt();
			//printmenu
			switch(i)	
			{
			case 1:
				System.out.println("������ ��ðڽ��ϱ�?. ");
				System.out.println("�ٴҶ� ���̽�ũ��(1000��):   1");
				System.out.println("�Ƹ�� ���̽�ũ��(1400��):   2");
				System.out.println("���� ���̚���(1400��):     3");
				System.out.println("ȣ�� ���̽�ũ��(1400��):    4");
				System.out.print("��ȣ ����: ");
				int a =input.nextInt();
				System.out.println(a+" ����, �����մϴ�.");
				break;

			case 2: 
				System.out.println("� ������ ���Ͻʴϱ�?. ");
				System.out.println("�Ƹ޸�ĭ(1000��):    1");
				System.out.println("ī���(1400��):    2");
				System.out.println("����������(1400��):   3");
				System.out.print("��ȣ ����: ");
				int b= input.nextInt();
				System.out.println(b+" ����, �����մϴ�.");
				break;

			case 3:
				System.out.println("������ ��ðڽ��ϱ�?.");
				System.out.println("����(1000��):        1");
				System.out.println("�������꽺(1400��):    2");
				System.out.println("�����꽺(1400��):     3");
				System.out.println("����(1400��):        4");
				System.out.println("��ȣ ����: ");
				int c= input.nextInt();
				System.out.println(c+" ����, �����մϴ�. ");
				break;
				
			case 4:
				System.out.println("�����մϴ�. �ŷ��� �����մϴ�. ");
				done = true;
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");

			}



		}

	}

}
