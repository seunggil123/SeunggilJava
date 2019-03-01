package 실습5;

public class Person {

	private String name;
	private int age;
	private int id_number;
	
	public Person()
	{
		this("",0,0);
	}
	
	public Person(String name, int age, int id_number)
	{
		this.name = name;
		this.age = age;
		this.id_number = id_number;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setID(int id_number)
	{
		this.id_number = id_number;
		
	}
	
	public void info()
	{
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주민번호: " + id_number);
	}
	
	
	
	
	
	
	
	
	
}
