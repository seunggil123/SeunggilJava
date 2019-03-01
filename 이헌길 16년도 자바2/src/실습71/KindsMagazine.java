package 실습71;

public class KindsMagazine extends Magazine{

	int age;
	
	public KindsMagazine()
	{
		super();
	}
	public KindsMagazine(String maker,int page, int price, String title,String circle,int age)
	{
		super(maker,page,price,title,circle);
		this.age= age;
	}
	public String getTitle()
	{
		return title;
	}
	
	public void display()
	{
		super.display();
		System.out.print(" /권장 연령: " + age);
	}
}
