package �ǽ�2����;

import java.util.Scanner;

public class Rsp_Test {

	public static void main(String[] args) {

		boolean done = false;
		while(!done)
		{

			Scanner input = new Scanner(System.in);
			System.out.print("���� ���� �� ����: ");
			String n1 = input.next();

			if(n1.equals("q"))
			{
				done = true;
				break;
			}
			Rsp rsp1 = new Rsp(n1);

			rsp1.User();
			rsp1.Computer();
			rsp1.Compare();

			System.out.println("���� �õ� Ƚ�� : " + rsp1.getCount());
			System.out.println("�̱� Ƚ�� : " + rsp1.getWin());
		}
	}

}
