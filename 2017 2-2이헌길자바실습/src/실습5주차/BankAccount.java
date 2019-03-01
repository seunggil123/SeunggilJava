package 실습5주차;

abstract class BankAccount {

	public String name;
	double money = 100000;
	double rate;
	
	abstract public double calulrate(int month);
	
	public String toString()
	{
		return "Name: "+ name + "\nMoney: "+money+"\nInterst: "+rate;
	}
	
}
