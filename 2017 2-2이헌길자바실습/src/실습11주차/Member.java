package 실습11주차;
import java.io.*;
import java.util.*;
public class Member implements Serializable  {

	String name;
	int age;
	int number;
	String[] list = new String[5]; //대여한 책 리스트
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
		System.out.println("대여한 책 리스트");
		
		if(list[0]==null)
			System.out.println("대여한 책이 없습니다.");

		for(int i=0; i<list.length; i++)
		{	
			if(!(list[i]==null))
			{	
				if(list[i]==null)
				{
					book_num--;
					return;
				}
				System.out.println(((book_num)+"번째대여한 책:"+ list[i]));
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
		String str = "회원 이름: "+ this.getName() + "\n회원 나이: "+
				this.getage()+"\n회원 번호: "+this.getnumber();
		return str;
	}

}




