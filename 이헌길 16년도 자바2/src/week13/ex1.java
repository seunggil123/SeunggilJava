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

		// pop 할때는 어차피 거꾸로 나옴.
		// charAt(i)+"" 는 String으로 변환!!!
		for (int i = 0; i < str.length(); i++) {
			String b = str.charAt(i) + "";
			if (s.peek().equals(b))
				s.pop();
			else
				break;
		}
		if (s.empty())
			System.out.println("회문");
		else
			System.out.println("회문이 아닙니다.");
	}

}
