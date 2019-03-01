package 실습5;

public class Employee extends Person {

	protected double salary;
	
	public Employee()
	{
		
		salary = 0;
	}
	
	public Employee(String name, int age, int id_number,double init_salary)
	{
		super(name,age,id_number);
		this.salary= init_salary;
	}
	
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
	public void salaryUp()
	{
		salary = salary + 50;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public void info()
	{
		super.info();
		System.out.println("급여 : " + salary);
		
	}
	
	
}
