package �ǽ�6;

public class Student extends Person{

	private int number;
	
	public Student()
	{
		super("ȫ�浿(�л�)" , 20);
		this.number = 20160000;
	}
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public void studentInfo()
	{
		super.info();
		System.out.println("�й�: " + number);
	}
}

