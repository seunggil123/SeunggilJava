package 실습7;

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
				System.out.println("종료되었습니다.");
			} else {
				Stack<String> s = new Stack<String>();
				if (str.length() % 2 == 1) // 홀수
				{

					for (int i = 0; i < str.length() / 2; i++) {
						s.push(str.charAt(i) + "");
						System.out.println("Inserted Item: " + str.charAt(i));
						// 스택에 앞에 문자 push
					}

					for (int i = (str.length() / 2) + 1; i < str.length(); i++) {
						if (s.peek().equals(str.charAt(i) + ""))
							s.pop();
						else
							break;
					}

				} 
				else if (str.length() % 2 == 0)// 짝수
				{
					for (int i = 0; i < str.length() / 2; i++) {
						s.push(str.charAt(i) + "");
						System.out.println("Inserted Item: " + str.charAt(i));
						// 스택에 앞에 문자 push
					}

					for (int i = (str.length() / 2); i < str.length(); i++) {
						if (s.peek().equals(str.charAt(i) + ""))
							s.pop();
						else
							break;
					}
				}

				if (s.empty() == true) // 원소들이 모두 pop-> 회문이 비어있음(회문이면)
					System.out.println("회문입니다.");
				else // 원소들이 일치하지 않아 pop중단 -> 스택이 비어있지 않음
					System.out.println("회문이 아닙니다.");

			}

		}

	}

}
