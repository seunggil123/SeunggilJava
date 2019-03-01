package �ǽ�3����;

public class BankAccount extends Person {

	public double balance; //��ġ��
	public int account; //���º�ȣ

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
			System.out.println(name + "-> " + etc.getName() +"���� �۱�" );
			System.out.println("�۱��� �Ϸ� �Ǿ����ϴ�.");
			System.out.println();
		}
		else
			System.out.println("����� �� �����ϴ�.");
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
		System.out.println("���¹�ȣ: " + account);
		System.out.println("���� �ݾ�: " + getBalance());
		
	}
	
	
	
	
}
