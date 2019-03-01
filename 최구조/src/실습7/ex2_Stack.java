package 실습7;

import java.util.Scanner;
import java.util.*;

public class ex2_Stack {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();

		boolean done = false;
		while (!done) {
			System.out.println("수식을 입력하세요: 종료는<q>");
			String str1 = input.next();
			if (str1.equals("q")) // 반복 종료
				done = true;
			else {
				String result = "";

				for (int i = 0; i < str1.length(); i++) {
					char ch = str1.charAt(i);
					if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9') // 숫자라면
						result = result + ch; // result(후위표기식)에 바로 추가
					else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') // 식을 만났을 경우
					{
						while ((!stack.empty()) && getPriority(stack.peek()) > getPriority(ch)) {
							result = result + stack.pop();
							// 스택이 비어있지 않고 만약 스택상단의 연산자의 우선순위가 push하려는 연산자의 우선순위 보다 높다면
							// 스택 상단의 연산자를 후위식에 추가(pop)
						}
						if ((!stack.empty()) && getPriority(stack.peek()) == getPriority(ch)) {
							result = result + stack.pop();
							stack.push(ch);
							// 스택이 비어있지 않고 스택상단의 연산자의 우선순위와 push하려는 연산자의 우선순위가 같다면
							// stack에 현재 연산자 push
						} else
							stack.push(ch);
						// 스택 상단의 연산자보다 push하려는 연산자의 우선순위가 더 높다면 스택에 push
					} else if (ch == '(')
						stack.push(ch);
					// 괄호를 만났을 경우 바로 push
					else if (ch == ')') {
						while (stack.peek() != '(') {
							result = result + stack.pop();
						}
						stack.pop();
						// )괄호를 만났을 경우 스택에 있는 (를 만날때까지 pop해준다.
					}

				}
				while (!stack.empty())
					result = result + stack.pop();
				// for문이 끝나고 stack에 남아있는 원소들을 모두 pop
				String poly = result;
				System.out.println("후위 표기식은: " + result);
				System.out.println("결과값은 " + getResult(poly));
			}
		}
	}

	public static int getPriority(char operator) {
		if (operator == '(')
			return 0;
		else if (operator == '+' || operator == '-')
			return 1;
		else if (operator == '*' || operator == '/')
			return 2;
		return 3;
	} // 연산자 우선순위 메소드

	public static int getResult(String poly) // 연산결과 호출 메소드
	{
		Stack<Integer> s = new Stack<Integer>();
		int result;
		for (int i = 0; i < poly.length(); i++) {
			char ch = poly.charAt(i);
			if (poly.charAt(i) >= '0' && poly.charAt(i) <= '9')// 숫자인 경우
			{
				int num = poly.charAt(i) - '0'; // 숫자로 변환
				s.push(num);// 숫자로 변환하여 push
			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				int opr1 = s.pop(); // operand1
				int opr2 = s.pop(); // operand2
				switch (ch) {
				case '+':
					s.push(opr1 + opr2);
					break;
				case '-':
					s.push(opr1 - opr2);
					break;
				case '*':
					s.push(opr1 * opr2);
					break;
				case '/':
					s.push(opr1 / opr2);
					break;
				}
			}
		}
		result = s.pop(); // 연산결과 result에 저장
		return result;
	}
}
