package IntegerCalc;

import java.util.Stack;

public class BigIntegerCalc {

	String fn;
	String sn;

	String num;



	Stack<String> first = new Stack<String>();
	Stack<String> second = new Stack<String>();
	Stack<String> result = new Stack<String>();

	public BigIntegerCalc()
	{
		fn="";
		sn="";
	}
	public BigIntegerCalc(String fn,String sn)
	{
		this.fn=fn;
		this.sn=sn;
	}

	public String addBigInteger()
	{
		for(int i=0; i<fn.length(); i++) {
			String a = fn.charAt(i)+"";
			first.push(a);
		}//first에 숫자 하나씩 푸시

		for(int i=0; i<sn.length(); i++)
		{
			String b = sn.charAt(i)+"";
			second.push(b);
		}//second에 숫자 하나씩 푸시

		int fiSize = first.size();
		int seSize = second.size();
		int length;

		if(fiSize > seSize)
			length = fiSize;
		else if(fiSize < seSize)
			length = seSize;
		else
			length = fiSize;
		int over=0;
		for(int i=0; i<length; i++)
		{	

			int addnum;
			if(first.empty()==false && second.empty() == false) {
				addnum = over + Integer.parseInt(first.pop()) + Integer.parseInt(second.pop());
				over = 0;
			}
			else {
				if(first.empty() ==true)
					addnum = over + Integer.parseInt(second.pop());
				else{
					addnum = over + Integer.parseInt(first.pop());

				}
				over=0;	
			}
			String numStr = String.valueOf(addnum); // int를 string으로 변환
			if(addnum >= 10)
			{
				over = 1; //올림수는 over
				num = numStr.charAt(1)+"";  //1의자리수는 num
				result.push(num); //1의자리수 push
			}
			else{

				result.push(numStr); //10보다 작으면 그냥 push
			}
		}
		if(over ==1 )
			result.push("1");
		String Numresult="";
		int reSize = result.size();
		for(int i=0; i<reSize; i++) {
			Numresult = Numresult + result.pop();
		}
		return Numresult;

	}

	public String subBigInteger()
	{	
		boolean flag2 = false; //앞뒤수 바뀜 여부
		if(compare(fn,sn) == 2)
		{ //뒤의 수가 앞의 수 보다 더 크면
			for(int i=0; i<sn.length(); i++) {
				String a = sn.charAt(i)+"";
				first.push(a);
			}//first에 뒤의 수 숫자 하나씩 푸시

			for(int i=0; i<fn.length(); i++)
			{
				String b = fn.charAt(i)+"";
				second.push(b);
			}//second에 앞의 수 숫자 하나씩 푸시

			flag2 = true; //앞뒤 수 바뀜
		}
		else if(compare(fn,sn) == 1)//앞 뒤 수 안바뀜
		{
			for(int i=0; i<fn.length(); i++) {
				String a = fn.charAt(i)+"";
				first.push(a);
			}//first에 숫자 하나씩 푸시

			for(int i=0; i<sn.length(); i++)
			{
				String b = sn.charAt(i)+"";
				second.push(b);
			}//second에 숫자 하나씩 푸시
		}
		else
			result.push("0");
		int fiSize = first.size();
		int seSize = second.size();
		int length;

		if(fiSize > seSize)
			length = fiSize;
		else if(fiSize < seSize)
			length = seSize;
		else
			length = fiSize;

		boolean flag=false; //내림수 발생여부
		int subnum;

		int firNum;
		for(int i=0; i<length; i++)
		{
			if(first.empty()==false && second.empty() == false)
			{
				if(flag == false)//내림수 안했다면 그대로
					firNum = Integer.parseInt(first.pop());
				else//내림수발생했다면 -1 해줌
					firNum = Integer.parseInt(first.pop())-1;

				int secNum = Integer.parseInt(second.pop());
				String numStr;

				if(firNum<secNum)
				{
					subnum = (10 + firNum) - secNum; //뒤의 수가 더 크면 앞자리수에 +10 해준다.
					numStr = String.valueOf(subnum); // int형을 string으로
					result.push(numStr); //result 스택에 푸시
					flag = true; //내림수 발생
				}
				else //앞의 수가 더 크면
				{	
					subnum = firNum - secNum;
					numStr = String.valueOf(subnum);
					result.push(numStr); //뺀 뒤에 바로 푸시
					flag = false; //내림수 발생x
				}
			}
			else
				result.push(first.pop());

		}

		String Numresult="";
		int reSize = result.size();
		for(int i=0; i<reSize; i++) {
			Numresult = Numresult + result.pop();
		}
		if(flag2) //앞뒤 수 바뀌었다면
			return "-"+Numresult;
		else //앞뒤 수 안바뀜
			return Numresult;
	}

	public int compare(String fi, String se)
	{	
		Stack<String> s1 = new Stack<String>();
		Stack<String> s2 = new Stack<String>();
		Stack<String> temp1 = new Stack<String>();
		Stack<String> temp2 = new Stack<String>();

		for(int a=0; a<fi.length(); a++)
			s1.push(fi.charAt(a)+"");
		for(int b=0; b<se.length(); b++)
			s2.push(se.charAt(b)+"");

		int sLength1 = s1.size(); //s1스택 길이
		int sLength2 = s2.size(); //s2스택 길이

		if(sLength1 > sLength2)
			return 1;
		else if(sLength1 < sLength2)
			return 2;
		else //두수의 길이 같을 때
		{	
			for(int k=0; k<sLength1; k++)
			{
				if(Integer.parseInt(s1.get(k)) > Integer.parseInt(s2.get(k)))
					return 1;
				else if(Integer.parseInt(s1.get(k)) < Integer.parseInt(s2.get(k)))
					return 2; 
			}
			return 3; //두수가 완전히 같음

			//			for(int i=0; i<sLength1; i++)
			//			{
			//				if(Integer.parseInt(s1.peek()) == Integer.parseInt(s2.peek()))
			//				{
			//					temp1.push(s1.pop());
			//					temp2.push(s2.pop());
			//				}
			//				else if(Integer.parseInt(s1.peek()) > Integer.parseInt(s2.peek()))
			//				{	
			//					for(int j=0; j<temp1.size(); j++)
			//					{
			//						s1.push(temp1.pop());
			//						s2.push(temp2.pop());
			//						
			//					}
			//					return 1;
			//				}
			//				else if(Integer.parseInt(s1.peek()) < Integer.parseInt(s2.peek())){
			//					for(int j=0; j<temp1.size(); j++)
			//					{
			//						s1.push(temp1.pop());
			//						s2.push(temp2.pop());
			//					}
			//					return 2;
			//				}
			//			}


		}
	}
}
