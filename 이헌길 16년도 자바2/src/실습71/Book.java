package 실습71;

public class Book extends Publication {
	
	String author;
	
	public Book()
	{
		super();
	}
	
	public Book(String maker,int page, int price, String title,String author)
	{
		super(maker,page,price,title);
		this.author=author;
	}
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}
	
	
	
	public void display()
	{
		super.display();
		System.out.print(" /저자 "+ author);
	}
		

}
