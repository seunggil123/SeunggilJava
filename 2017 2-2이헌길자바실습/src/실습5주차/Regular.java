package 실습5주차;

public class Regular extends BankAccount {

	double rate = 0.03;

	public Regular()
	{
		super();
		name = "예금";
	}
	
	
	public double calulrate(int month)
	{
		for(int i=0; i<month; i++)
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
