package �ǽ�5;

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
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ֹι�ȣ: " + id_number);
	}
	
	
	
	
	
	
	
	
	
}
