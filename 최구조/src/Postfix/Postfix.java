package Postfix;

public class Postfix {

	private String exp;
	private int expSize;
	private char testCh, openPair;
	
	public boolean testPair(String exp)
	{
		this.exp = exp;
		LinkedStack S = new LinkedStack();
		expSize = this.exp.length();
		
		for(int i=0; i<expSize; i++)
		{
			testCh = this.exp.charAt(i);
			switch(testCh)
			{
			case '(' :
			case '{' :
			case '[' :
					S.push(testCh);
					break;
			case ')' :
			case '}' :
			case ']' : //testCh -> ) or } or ]
				if(S.isEmpty())
					return false;
				else
				{
					openPair = S.pop();
					if(openPair == '(' && testCh != ')' 
						|| ((openPair == '{') && testCh != '}') 
						|| ((openPair == '[') && testCh != ']')){
						return false;
					}
					else
						break;
				}
			}
		}
		if(S.isEmpty())
			return true;
		else
			return false;
	}
	
	public char[] toPostfix(String infix)
	{
		int expsize = 10;
		int j=0;
		char postfix[] = new char[expSize];
		LinkedStack S = new LinkedStack();
		
		for(int i=0; i<expSize; i++)
		{
			testCh = this.exp.charAt(i);
			switch(testCh)
			{
			case '0' :
			case '1' :
			case '2' :
			case '3' :
			case '4' :
			case '5' :
			case '6' :
			case '7' :
			case '8' :
			case '9' :
				postfix[j++] = testCh;
				break;
			case '+' :
			case '-' :	
			case '*' :
			case '/' :
				S.push(testCh);
				break;
			case ')' :
				postfix[j++] = S.pop();
				break;
			default:
					
			}
		}
		postfix[j] = S.pop(); //남은 연산자 빼기
		return postfix;
	}
	
	public int evalPostfix(String postfix)
	{
		LinkedStack S = new LinkedStack();
		exp = postfix;
		int opr1,opr2, value;
		char testCh;
		
		for(int i=0; i<7; i++)
		{
			testCh = exp.charAt(i);
			if(testCh != '+' && testCh != '-' && testCh != '*' && testCh != '/')
			{
				value = testCh-'0'; //숫자인경우 -> char to int
				S.push((char)value);
			}
			else {
				opr2 = S.pop();
				opr1 = S.pop();
				switch(testCh)
				{
				case '+' : S.push((char)(opr1 + opr2)); break;
				case '-' : S.push((char)(opr1 - opr2)); break;
				case '*' : S.push((char)(opr1 * opr2)); break;
				case '/' : S.push((char)(opr1 / opr2)); break;
				}
			}
				
		}
		return S.pop();
	}
	
	public static void main(String args[])
	{
		Postfix a = new Postfix();
		String exp = "35*62/-";
		char postfix[];
		
		
		System.out.println(exp);
		
		if(a.testPair(exp))
			System.out.println("괄호 맞음");
		else
			System.out.println("괄호 틀림");
		

		postfix = a.toPostfix(exp);
		String q = "";
		for(int i=0; i<postfix.length; i++)
		{
			q = q.concat(postfix[i]+"");
		}
		System.out.print("후위 표기식 : ");
		
		System.out.println(postfix);
		System.out.print("값 : ");
		int result = a.evalPostfix(q);
		System.out.println(result);
	}
}
