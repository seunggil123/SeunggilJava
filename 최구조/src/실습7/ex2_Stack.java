package �ǽ�7;

import java.util.Scanner;
import java.util.*;

public class ex2_Stack {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();

		boolean done = false;
		while (!done) {
			System.out.println("������ �Է��ϼ���: �����<q>");
			String str1 = input.next();
			if (str1.equals("q")) // �ݺ� ����
				done = true;
			else {
				String result = "";

				for (int i = 0; i < str1.length(); i++) {
					char ch = str1.charAt(i);
					if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9') // ���ڶ��
						result = result + ch; // result(����ǥ���)�� �ٷ� �߰�
					else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') // ���� ������ ���
					{
						while ((!stack.empty()) && getPriority(stack.peek()) > getPriority(ch)) {
							result = result + stack.pop();
							// ������ ������� �ʰ� ���� ���û���� �������� �켱������ push�Ϸ��� �������� �켱���� ���� ���ٸ�
							// ���� ����� �����ڸ� �����Ŀ� �߰�(pop)
						}
						if ((!stack.empty()) && getPriority(stack.peek()) == getPriority(ch)) {
							result = result + stack.pop();
							stack.push(ch);
							// ������ ������� �ʰ� ���û���� �������� �켱������ push�Ϸ��� �������� �켱������ ���ٸ�
							// stack�� ���� ������ push
						} else
							stack.push(ch);
						// ���� ����� �����ں��� push�Ϸ��� �������� �켱������ �� ���ٸ� ���ÿ� push
					} else if (ch == '(')
						stack.push(ch);
					// ��ȣ�� ������ ��� �ٷ� push
					else if (ch == ')') {
						while (stack.peek() != '(') {
							result = result + stack.pop();
						}
						stack.pop();
						// )��ȣ�� ������ ��� ���ÿ� �ִ� (�� ���������� pop���ش�.
					}

				}
				while (!stack.empty())
					result = result + stack.pop();
				// for���� ������ stack�� �����ִ� ���ҵ��� ��� pop
				String poly = result;
				System.out.println("���� ǥ�����: " + result);
				System.out.println("������� " + getResult(poly));
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
	} // ������ �켱���� �޼ҵ�

	public static int getResult(String poly) // ������ ȣ�� �޼ҵ�
	{
		Stack<Integer> s = new Stack<Integer>();
		int result;
		for (int i = 0; i < poly.length(); i++) {
			char ch = poly.charAt(i);
			if (poly.charAt(i) >= '0' && poly.charAt(i) <= '9')// ������ ���
			{
				int num = poly.charAt(i) - '0'; // ���ڷ� ��ȯ
				s.push(num);// ���ڷ� ��ȯ�Ͽ� push
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
		result = s.pop(); // ������ result�� ����
		return result;
	}
}
