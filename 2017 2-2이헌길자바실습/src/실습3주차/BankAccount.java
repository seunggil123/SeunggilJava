package 실습3주차;

public class BankAccount extends Person {

	public double balance; //예치금
	public int account; //계좌변호

	public BankAccount()
	{
		super();

	}
	
	public BankAccount(String name, int age, int user_ID,double balance,int account)
	{
		super(name,age,user_ID);
		this.balance = balance;
		this.account = account;
	}
	public void setMoney(double money)
	{
		balance = money;
		
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
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
			System.out.println(name + "-> " + etc.getName() +"에게 송금" );
			System.out.println("송금이 완료 되었습니다.");
			System.out.println();
		}
		else
			System.out.println("출금할 수 없습니다.");
	}
	
	public void plus(int month)
	{
		for(int i=0; i<month; i++)
		{
			this.balance= balance+(balance*0.01);
		}
	}
	
	public void print()
	{
		
		super.print();
		System.out.println("계좌번호: " + account);
		System.out.println("보유 금액: " + getBalance());
		
	}
	
	
	
	
}
