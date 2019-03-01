package 실습5주차;

public class CMA extends BankAccount {

	double rate = 0.01;
	
	public CMA()
	{
		super();
		name = "CMA";
	}
	
	public double calulrate(int month)
	{
		for(int i=0; i<month*30; i++)
		{
			money = money+(money*this.rate);
		}
		return money;
	}
	
	public String toString()
	{
		return "Name: "+ name + "\nMoney: "+money+"\nInterst: "+rate;
	}
	
	
	
	
}
