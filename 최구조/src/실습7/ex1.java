package �ǽ�7;

import java.io.*;
import java.util.*;

public class ex1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean done = false;
		while (!done) {
			String str = input.next();
			if (str.equals("q")) {
				done = true;
				System.out.println("����Ǿ����ϴ�.");
			} else {
				Stack<String> s = new Stack<String>();
				if (str.length() % 2 == 1) // Ȧ��
				{

					for (int i = 0; i < str.length() / 2; i++) {
						s.push(str.charAt(i) + "");
						System.out.println("Inserted Item: " + str.charAt(i));
						// ���ÿ� �տ� ���� push
					}

					for (int i = (str.length() / 2) + 1; i < str.length(); i++) {
						if (s.peek().equals(str.charAt(i) + ""))
							s.pop();
						else
							break;
					}

				} 
				else if (str.length() % 2 == 0)// ¦��
				{
					for (int i = 0; i < str.length() / 2; i++) {
						s.push(str.charAt(i) + "");
						System.out.println("Inserted Item: " + str.charAt(i));
						// ���ÿ� �տ� ���� push
					}

					for (int i = (str.length() / 2); i < str.length(); i++) {
						if (s.peek().equals(str.charAt(i) + ""))
							s.pop();
						else
							break;
					}
				}

				if (s.empty() == true) // ���ҵ��� ��� pop-> ȸ���� �������(ȸ���̸�)
					System.out.println("ȸ���Դϴ�.");
				else // ���ҵ��� ��ġ���� �ʾ� pop�ߴ� -> ������ ������� ����
					System.out.println("ȸ���� �ƴմϴ�.");

			}

		}

	}

}
