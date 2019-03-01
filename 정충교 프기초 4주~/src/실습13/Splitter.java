package ½Ç½À13;

public class Splitter {
	
	String s;
	
	public Splitter(String str)
	{
		s = str;
	}
	
	public char[] split()
	{
		
		char [] a = new char[s.length()];
		for(int i=0; i<s.length(); i++)
		{
			a[i] = s.charAt(i);
		}
		
		return a;
	}

//	public String[] split(char delimiter)
//	{
//		int beginIndex;
//		int endIndex;
//		
//		
//	}
}
