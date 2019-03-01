package 실습2주차;


public class Student {

	private int number;
	private String name;
	private static int numberOfStudent =0;
	
	public Student()
	{
		this.number = 201700000;
		this.name = "한지우";
		numberOfStudent++;
	} /// 클래스 호출할때마다 static ++;
	
	public Student(int number, String name)
	{
		this.number = number;
		this.name = name;
		numberOfStudent++;
	} /// 클래스 호출할때마다 static ++;
	
	public int getNumber()
	{
		return number;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public static int getStudentNum()
	{
		return numberOfStudent;
	}
	
}