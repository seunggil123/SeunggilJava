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
		}//first�� ���� �ϳ��� Ǫ��

		for(int i=0; i<sn.length(); i++)
		{
			String b = sn.charAt(i)+"";
			second.push(b);
		}//second�� ���� �ϳ��� Ǫ��

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
			String numStr = String.valueOf(addnum); // int�� string���� ��ȯ
			if(addnum >= 10)
			{
				over = 1; //�ø����� over
				num = numStr.charAt(1)+"";  //1���ڸ����� num
				result.push(num); //1���ڸ��� push
			}
			else{

				result.push(numStr); //10���� ������ �׳� push
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
		boolean flag2 = false; //�յڼ� �ٲ� ����
		if(compare(fn,sn) == 2)
		{ //���� ���� ���� �� ���� �� ũ��
			for(int i=0; i<sn.length(); i++) {
				String a = sn.charAt(i)+"";
				first.push(a);
			}//first�� ���� �� ���� �ϳ��� Ǫ��

			for(int i=0; i<fn.length(); i++)
			{
				String b = fn.charAt(i)+"";
				second.push(b);
			}//second�� ���� �� ���� �ϳ��� Ǫ��

			flag2 = true; //�յ� �� �ٲ�
		}
		else if(compare(fn,sn) == 1)//�� �� �� �ȹٲ�
		{
			for(int i=0; i<fn.length(); i++) {
				String a = fn.charAt(i)+"";
				first.push(a);
			}//first�� ���� �ϳ��� Ǫ��

			for(int i=0; i<sn.length(); i++)
			{
				String b = sn.charAt(i)+"";
				second.push(b);
			}//second�� ���� �ϳ��� Ǫ��
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

		boolean flag=false; //������ �߻�����
		int subnum;

		int firNum;
		for(int i=0; i<length; i++)
		{
			if(first.empty()==false && second.empty() == false)
			{
				if(flag == false)//������ ���ߴٸ� �״��
					firNum = Integer.parseInt(first.pop());
				else//�������߻��ߴٸ� -1 ����
					firNum = Integer.parseInt(first.pop())-1;

				int secNum = Integer.parseInt(second.pop());
				String numStr;

				if(firNum<secNum)
				{
					subnum = (10 + firNum) - secNum; //���� ���� �� ũ�� ���ڸ����� +10 ���ش�.
					numStr = String.valueOf(subnum); // int���� string����
					result.push(numStr); //result ���ÿ� Ǫ��
					flag = true; //������ �߻�
				}
				else //���� ���� �� ũ��
				{	
					subnum = firNum - secNum;
					numStr = String.valueOf(subnum);
					result.push(numStr); //�� �ڿ� �ٷ� Ǫ��
					flag = false; //������ �߻�x
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
		if(flag2) //�յ� �� �ٲ���ٸ�
			return "-"+Numresult;
		else //�յ� �� �ȹٲ�
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

		int sLength1 = s1.size(); //s1���� ����
		int sLength2 = s2.size(); //s2���� ����

		if(sLength1 > sLength2)
			return 1;
		else if(sLength1 < sLength2)
			return 2;
		else //�μ��� ���� ���� ��
		{	
			for(int k=0; k<sLength1; k++)
			{
				if(Integer.parseInt(s1.get(k)) > Integer.parseInt(s2.get(k)))
					return 1;
				else if(Integer.parseInt(s1.get(k)) < Integer.parseInt(s2.get(k)))
					return 2; 
			}
			return 3; //�μ��� ������ ����

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
