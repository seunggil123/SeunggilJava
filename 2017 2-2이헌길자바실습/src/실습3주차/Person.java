package �ǽ�3����;

public class Person {

	protected String name;
	protected int age;
	protected int user_ID;
	
	public Person()
	{
		this("",0,0);
	}
	
	public Person(String name, int age, int user_ID)
	{
		this.name = name;
		this.age = age;
		this.user_ID = user_ID;
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
		this.user_ID = user_ID;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int getID()
	{
		return user_ID;
	}
	
	
	public void print()
	{
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ֹι�ȣ: " + user_ID);
		
	}
	
	
}
