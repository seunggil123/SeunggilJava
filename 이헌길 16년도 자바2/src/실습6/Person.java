package �ǽ�6;

public class Person {

	protected String name;
	private int age;
	
	public Person()
	{
		this("ȣ����(���)",22);
	}
	
	public Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public void info()
	{
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
	
}
