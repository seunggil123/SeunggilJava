package 실습5;

public class Manager extends Employee{

	private double incentive;
	private double init_salary;
	
	
	
	public Manager()
	{
		super();
		incentive =5;
	}

	public Manager(String name, int age, int id_number, double init_salary, double incen)
	{
		super(name,age,id_number,init_salary);
		
		this.init_salary=init_salary;
		this.incentive=incen;
	}

	public void setIncen(int incentive)
	{
		this.incentive= incentive;
	}

	public double getSalary()
	{
		
		init_salary = salary + this.incentive;
		return init_salary;
	}

	public void info()
	{
		super.info();
		System.out.println("인센티브: " + incentive);
		System.out.println("총급여: " + getSalary());
	}
	

}
