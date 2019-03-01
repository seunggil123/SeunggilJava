package 실습6;

public class Employee extends Person implements Comparable{

	private double salary;
	
	
	public Employee()
	{
		this("짱구(직원)" , 21, 1000);
	}
	
	public Employee(String name, int age, double init_salary)
	{
		super(name,age);
		this.salary = init_salary;
	}
	
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
	public void salaryUp()
	{
		salary = salary+50;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void employeeInfo()
	{
		super.info();
		System.out.println("급여 : " + salary);
	}
	
	public int compareTo(Object o)
	{
		if(!(o instanceof Employee))
		{
			System.out.println("해당 객체에 속하지 않습니다. ");
			System.exit(0);
		}
		return 0;
		
		
	}

	
	
	public String toString()
	{
		String str= this.name +"/"+this.salary;
		return str;
	}

	
}
