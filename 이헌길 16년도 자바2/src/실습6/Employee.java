package �ǽ�6;

public class Employee extends Person implements Comparable{

	private double salary;
	
	
	public Employee()
	{
		this("¯��(����)" , 21, 1000);
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
		System.out.println("�޿� : " + salary);
	}
	
	public int compareTo(Object o)
	{
		if(!(o instanceof Employee))
		{
			System.out.println("�ش� ��ü�� ������ �ʽ��ϴ�. ");
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
