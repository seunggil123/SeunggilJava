package �ǽ�11����;
import java.io.*;
import java.util.*;
public class Member implements Serializable  {

	String name;
	int age;
	int number;
	String[] list = new String[5]; //�뿩�� å ����Ʈ
	String book;

	public Member()
	{

	}

	public Member(String name, int age, int number)
	{
		this.name= name;
		this.age=age;
		this.number = number;
	}


	public String getName()
	{
		return this.name;
	}

	public int getage()
	{
		return this.age;
	}
	public void borrow_book(String book, int a)
	{	
		list[a] = book; 
	}

	//	public void list_book(String[] list, int a)
	//	{
	//		for(int i=0; i<list.length; i++){
	//			this.list[i] = book;
	//		}
	//	}

	public int getnumber()
	{
		return number;
	}
	public void getList()
	{	
		int book_num=1;
		System.out.println("�뿩�� å ����Ʈ");
		
		if(list[0]==null)
			System.out.println("�뿩�� å�� �����ϴ�.");

		for(int i=0; i<list.length; i++)
		{	
			if(!(list[i]==null))
			{	
				if(list[i]==null)
				{
					book_num--;
					return;
				}
				System.out.println(((book_num)+"��°�뿩�� å:"+ list[i]));
				book_num++;
			}


		}
		
	}

	public void return_book(String book, int a)
	{	
		if(book.equals(list[a]))
		{
			list[a] =null;
		}
	}

	public String toString()
	{
		String str = "ȸ�� �̸�: "+ this.getName() + "\nȸ�� ����: "+
				this.getage()+"\nȸ�� ��ȣ: "+this.getnumber();
		return str;
	}

}




