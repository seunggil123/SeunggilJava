package �ǽ�5����;

public class Loan extends BankAccount {

	double rate = -0.03;

	public Loan()
	{
		super();
		name = "����";
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
