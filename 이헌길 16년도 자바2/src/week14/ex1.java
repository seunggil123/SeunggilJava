package week14;

import java.util.Scanner;
import java.util.Stack;

public class ex1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean done = false;
		
		while (!done) {
			String str = input.nextLine();
			Queue<String> q = new Queue<String>();
			if (str.equals("exit")) {
				System.out.println("����Ǿ����ϴ�. ");
				done = true;
				break;
			}
			String result = "";
			for (int i = 0; i < str.length(); i++) {
				if (!(str.charAt(i) + "").equals(" ")) {
					String a = str.charAt(i) + "";
					result = result.concat(a);
					q.insert(a);
				} // ���� �ֱ�
			}

			for (int i = result.length() - 1; i >= 0; i--) {
				if ((result.charAt(i) + "").equals(q.peek())) {
					q.remove();
				} else
					break;
			}

			if (q.empty())
				System.out.println("ȸ�� �Դϴ�.");
			else
				System.out.println("ȸ���� �ƴմϴ�.");

		}
	}
}
