package 실습4;

public class BankAccount {

	private double balance;
	private int accountNumber;
	private static int numberOfAccount =0;

	public BankAccount () 
	{
		balance =0;
		accountNumber = numberOfAccount;
		numberOfAccount++;
	}

	public BankAccount(int balance)
	{
		this.balance = balance;
		numberOfAccount++;

	}
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	public void withdraw(double amount)
	{
		if(balance < amount)
			System.out.println("출금할 수 없습니다.");
		else
			balance=balance -amount;
	}
	public double getBalance()
	{
		return balance;
	}

	public void transfer(double amount, BankAccount etc)
	{	
		
		if(balance>=amount)
		{	
			etc.deposit(amount);
			withdraw(amount);
			etc.getBalance();
		} //withdraw는 앞에 etc가없다. 그러므로 b1.transfer를 해줄때 
		// b1에서 transfer 호출했으니까 b1에서 withdraw 메소드호출
		else
			System.out.println("송금할 수 없습니다.");

	}

	public static int getBankAccountNum()
	{	
		return numberOfAccount;
	}
}
