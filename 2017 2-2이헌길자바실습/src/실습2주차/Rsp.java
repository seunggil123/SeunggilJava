package 실습2주차;

public class Rsp {

	public static int count=0;
	public static int Win=0;
	int a;
	int b= (int)(3*Math.random());
	String s;

	public Rsp()
	{
		
	}

	public Rsp(String str)
	{
		s=str;
		count++;
	}

	public void User()
	{
		
		if(s.equals("r"))
		{
			System.out.println("유저: 가위");
			a=0;
		}
		else if(s.equals("s"))
		{
			System.out.println("유저 : 바위");
			a=1;
		}
		else if(s.equals("p"))
		{
			System.out.println("유저 : 보");
			a=2;
		}
		
	}
	public void Computer()
	{
		char[] a = new char[3];
		
		if(b==0)
		{
			a[0] = 'r';
			System.out.println("컴퓨터: 가위");
		}
		else if(b==1)
		{
			a[1] = 's';
			System.out.println("컴퓨터: 바위");
		}
		else if(b==2)
		{
			a[2]='p';
			System.out.println("컴퓨터: 보");
			
		}
		
	}
	
	public void Compare()
	{
		if(a==0 && b ==0 )
		{
			System.out.println("비겼습니다. ");
		}
		else if(a==0 && b==1)
		{
			System.out.println("졌습니다.");
			
		}
		else if(a==0 && b==2)
		{
			System.out.println("이겼습니다. ");
			Win++;
		}
		
		else if(a==1 && b==0)
		{
			System.out.println("이겼습니다. ");
			Win++;
		}
		else if(a==1 && b==1)
		{
			System.out.println("비겼습니다.");
		}
		else if(a==1 && b==2)
		{
			System.out.println("졌습니다. ");
		}
		
		else if(a==2 && b==0)
		{
			System.out.println("졌습니다. ");
			
		}
		else if(a==2 && b==1)
		{
			System.out.println("이겼습니다.");
			Win++;
		}
		else if(a==2 && b==2)
		{
			System.out.println("비겼습니다.");
		}
		
	}
	
	public static int getCount()
	{
		return count;
	}
	
	public int getWin() 
	{
		return Win;
	}


}
