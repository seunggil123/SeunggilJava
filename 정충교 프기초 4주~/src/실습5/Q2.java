package �ǽ�5;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean done = false;
		while(!done)
		{
			printMenu();
			int i = input.nextInt();
			switch(i) { 
			case 1:	
				printIceCreamMenu();
				int a =input.nextInt();
				System.out.println(a+" ����, �����մϴ�.");
				break;
			case 2:
				printCoffeeCreamMenu();
				int b= input.nextInt();
				System.out.println(b+" ����, �����մϴ�. ");
				break;
			case 3:
				printDrinkMenu();
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

	public static void printMenu()
	{
		System.out.println("���̽�ũ��, Ŀ��, ���Ḧ �Ĵ� ���Ǳ��Դϴ�.");
		System.out.println("������� ���Ͻʴϱ�? ");
		System.out.println("���̽�ũ��:     1");
		System.out.println("Ŀ��:         2");
		System.out.println("����:         3");
		System.out.println("����:         4");
		System.out.print("��ȣ ����: ");
		return;
	}
	public static void printIceCreamMenu()
	{
		System.out.println("������ ��ðڽ��ϱ�?. ");
		System.out.println("�ٴҶ� ���̽�ũ��(1000��):   1");
		System.out.println("�Ƹ�� ���̽�ũ��(1400��):   2");
		System.out.println("���� ���̚���(1400��):     3");
		System.out.println("ȣ�� ���̽�ũ��(1400��):    4");
		System.out.print("��ȣ ����: ");
		
	}
	public static void printCoffeeCreamMenu()
	{
		System.out.println("� ������ ���Ͻʴϱ�?. ");
		System.out.println("�Ƹ޸�ĭ(1000��):    1");
		System.out.println("ī���(1400��):    2");
		System.out.println("����������(1400��):   3");
		System.out.print("��ȣ ����: ");
	}
	public static void printDrinkMenu()
	{
		System.out.println("������ ��ðڽ��ϱ�?.");
		System.out.println("����(1000��):        1");
		System.out.println("�������꽺(1400��):    2");
		System.out.println("�����꽺(1400��):     3");
		System.out.println("����(1400��):        4");
		System.out.println("��ȣ ����: ");
		
	}


}
