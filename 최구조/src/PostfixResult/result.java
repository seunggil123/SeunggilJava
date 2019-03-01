package PostfixResult;

public class result {
	
	private String exp;
	
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
				S.push(value);
			}
			else {
				opr2 = S.pop();
				opr1 = S.pop();
				switch(testCh)
				{
				case '+' : S.push((opr1 + opr2)); break;
				case '-' : S.push((opr1 - opr2)); break;
				case '*' : S.push((opr1 * opr2)); break;
				case '/' : S.push((opr1 / opr2)); break;
				}
			}
				
		}
		return S.pop();
	}
	
	public static void main(String args[])
	{
		result a = new result();
		int sum;
		
		String exp = "35*62/-";
		

		
		System.out.print("후위 표기식 : ");
		
		System.out.println(exp);
		System.out.print("값 : ");
		sum = a.evalPostfix(exp);
		System.out.println(sum);
	}
}
