package week13;

import java.util.Scanner;
import java.util.*;
public class ex2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();


		String str1 = input.next();
		String result ="";

		for(int i=0; i<str1.length(); i++)
		{	
			char ch = str1.charAt(i); 
			if(str1.charAt(i)>='0' && str1.charAt(i) <='9')
				result = result + ch;
			else if(ch=='+' ||ch=='-'||ch=='*'||ch=='/')
			{	

				while((!stack.empty())&& getPriority(stack.peek()) > getPriority(ch)){
					result = result + stack.pop();

				}
				if((!stack.empty())&&getPriority(stack.peek()) == getPriority(ch))
				{	
					result = result + stack.pop();
					stack.push(ch);
				}
				else
					stack.push(ch);
			}
			else if(ch=='(')
				stack.push(ch);
			else if(ch==')')
			{
				while(stack.peek() != '('){
					result = result +stack.pop();
				}
				stack.pop();
			}

		}
		while(!stack.empty())
			result = result + stack.pop();
		System.out.println(str1 + " : " + result);

	}

	public static int getPriority(char operator) {
		if(operator == '(')
			return 0;
		else if(operator == '+' || operator == '-')
			return 1;
		else if(operator == '*' || operator == '/')
			return 2;
		return 3;
	}
}
