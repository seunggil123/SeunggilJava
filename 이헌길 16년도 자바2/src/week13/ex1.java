package week13;

import java.util.Scanner;
import java.util.*;

public class ex1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Stack<String> s = new Stack<String>();

		String str = input.next();

		for (int i = 0; i < str.length(); i++) {
			String a = str.charAt(i) + "";
			s.push(a);
		}

		// pop �Ҷ��� ������ �Ųٷ� ����.
		// charAt(i)+"" �� String���� ��ȯ!!!
		for (int i = 0; i < str.length(); i++) {
			String b = str.charAt(i) + "";
			if (s.peek().equals(b))
				s.pop();
			else
				break;
		}
		if (s.empty())
			System.out.println("ȸ��");
		else
			System.out.println("ȸ���� �ƴմϴ�.");
	}

}
