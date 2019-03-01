package 실습71;
import java.util.*;
public class Publication{
	
	String maker;
	int page;
	int price;
	String title;
	
	public Publication()
	{
		
	}
	public Publication(String maker,int page, int price, String title)
	{
		this.maker = maker;
		this.page = page;
		this.price= price;
		this.title = title;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public int compareTo(Object O)
	{
		char ch;
		ch = title.charAt(0);
		char ch2 = ((Publication)O).getTitle().charAt(0);
		if(ch-'0' > ch2-'0') // ch가 ch2보다 더 뒤에 글자
			return 1;
		else if(ch-'0' < ch2 - '0')
			return -1;
		else
			return 0;
		
	}
	public void display()
	{
		System.out.print("제목: " + title);
		System.out.print(" /출판사 : " + maker);
		System.out.print(" /가격: "+price);
		System.out.print(" /페이지수: "+page);
		
		
	}
	
}
