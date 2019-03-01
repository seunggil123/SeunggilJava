package 실습2주차;

import java.util.Scanner;

public class Rsp_Test {

	public static void main(String[] args) {

		boolean done = false;
		while(!done)
		{

			Scanner input = new Scanner(System.in);
			System.out.print("가위 바위 보 선택: ");
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

			System.out.println("게임 시도 횟수 : " + rsp1.getCount());
			System.out.println("이긴 횟수 : " + rsp1.getWin());
		}
	}

}
