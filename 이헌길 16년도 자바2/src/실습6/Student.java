package 실습6;

public class Student extends Person{

	private int number;
	
	public Student()
	{
		super("홍길동(학생)" , 20);
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
		System.out.println("학번: " + number);
	}
}

