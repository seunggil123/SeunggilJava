package �ǽ�2����;

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
			System.out.println("����: ����");
			a=0;
		}
		else if(s.equals("s"))
		{
			System.out.println("���� : ����");
			a=1;
		}
		else if(s.equals("p"))
		{
			System.out.println("���� : ��");
			a=2;
		}
		
	}
	public void Computer()
	{
		char[] a = new char[3];
		
		if(b==0)
		{
			a[0] = 'r';
			System.out.println("��ǻ��: ����");
		}
		else if(b==1)
		{
			a[1] = 's';
			System.out.println("��ǻ��: ����");
		}
		else if(b==2)
		{
			a[2]='p';
			System.out.println("��ǻ��: ��");
			
		}
		
	}
	
	public void Compare()
	{
		if(a==0 && b ==0 )
		{
			System.out.println("�����ϴ�. ");
		}
		else if(a==0 && b==1)
		{
			System.out.println("�����ϴ�.");
			
		}
		else if(a==0 && b==2)
		{
			System.out.println("�̰���ϴ�. ");
			Win++;
		}
		
		else if(a==1 && b==0)
		{
			System.out.println("�̰���ϴ�. ");
			Win++;
		}
		else if(a==1 && b==1)
		{
			System.out.println("�����ϴ�.");
		}
		else if(a==1 && b==2)
		{
			System.out.println("�����ϴ�. ");
		}
		
		else if(a==2 && b==0)
		{
			System.out.println("�����ϴ�. ");
			
		}
		else if(a==2 && b==1)
		{
			System.out.println("�̰���ϴ�.");
			Win++;
		}
		else if(a==2 && b==2)
		{
			System.out.println("�����ϴ�.");
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
