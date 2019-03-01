package 실습4;

public class BankAccount_test {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount(20000);
		
		System.out.println("현재 개설된 계좌 수 : " + BankAccount.getBankAccountNum()+ "\n");
		
		b1.deposit(30000);
		b2.deposit(1000);
		System.out.println("첫번째 계좌의 잔액 : " + b1.getBalance());
		System.out.println("두번째 계좌의 잔액 : " + b2.getBalance()+"\n");
		
		System.out.println("첫번째 계좌에서 두번째 계좌로 40000원 송금");
		b1.transfer(40000, b2);
		System.out.println("첫번째 계좌에서 두번째 계좌로 20000원 송금");
		b1.transfer(20000, b2);
		
		System.out.println();
		System.out.println("송금 후 첫번째, 두번째 계좌 잔액");
		System.out.println("첫번째: " + b1.getBalance());
		System.out.println("두번째: " + b2.getBalance());
		
		
		
		
		
		
		
		
		
	}

}
