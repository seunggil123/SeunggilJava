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
				System.out.println("종료되었습니다. ");
				done = true;
				break;
			}
			String result = "";
			for (int i = 0; i < str.length(); i++) {
				if (!(str.charAt(i) + "").equals(" ")) {
					String a = str.charAt(i) + "";
					result = result.concat(a);
					q.insert(a);
				} // 글자 넣기
			}

			for (int i = result.length() - 1; i >= 0; i--) {
				if ((result.charAt(i) + "").equals(q.peek())) {
					q.remove();
				} else
					break;
			}

			if (q.empty())
				System.out.println("회문 입니다.");
			else
				System.out.println("회문이 아닙니다.");

		}
	}
}
