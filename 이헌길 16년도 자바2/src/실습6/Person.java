package 실습6;

public class Person {

	protected String name;
	private int age;
	
	public Person()
	{
		this("호빵맨(사람)",22);
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
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
}
