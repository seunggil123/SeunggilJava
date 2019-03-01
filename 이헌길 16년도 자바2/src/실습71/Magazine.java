package 실습71;

public class Magazine extends Publication{
	
	String circle;
	
	public Magazine()
	{
		super();
	}
	public Magazine(String maker,int page, int price, String title, String circle)
	{
		super(maker,page,price,title);
		this.circle=circle;
	}
	public String getTitle()
	{
		return title;
	}
	
	public void display()
	{
		super.display();
		System.out.print(" /주기 : "+ circle);
	}
}
