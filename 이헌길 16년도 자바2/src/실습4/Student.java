package �ǽ�4;

public class Student {

	private int number;
	private String name;
	private static int numberOfStudent =0;
	
	public Student()
	{
		this.number = 201616132;
		this.name = "�ڴ뼭";
		numberOfStudent++;
	} /// Ŭ���� ȣ���Ҷ����� static ++;
	
	public Student(int number, String name)
	{
		this.number = number;
		this.name = name;
		numberOfStudent++;
	} /// Ŭ���� ȣ���Ҷ����� static ++;
	
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
