package �ǽ�4;

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
			System.out.println("����� �� �����ϴ�.");
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
		} //withdraw�� �տ� etc������. �׷��Ƿ� b1.transfer�� ���ٶ� 
		// b1���� transfer ȣ�������ϱ� b1���� withdraw �޼ҵ�ȣ��
		else
			System.out.println("�۱��� �� �����ϴ�.");

	}

	public static int getBankAccountNum()
	{	
		return numberOfAccount;
	}
}
