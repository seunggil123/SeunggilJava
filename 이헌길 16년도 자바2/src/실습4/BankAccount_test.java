package �ǽ�4;

public class BankAccount_test {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount(20000);
		
		System.out.println("���� ������ ���� �� : " + BankAccount.getBankAccountNum()+ "\n");
		
		b1.deposit(30000);
		b2.deposit(1000);
		System.out.println("ù��° ������ �ܾ� : " + b1.getBalance());
		System.out.println("�ι�° ������ �ܾ� : " + b2.getBalance()+"\n");
		
		System.out.println("ù��° ���¿��� �ι�° ���·� 40000�� �۱�");
		b1.transfer(40000, b2);
		System.out.println("ù��° ���¿��� �ι�° ���·� 20000�� �۱�");
		b1.transfer(20000, b2);
		
		System.out.println();
		System.out.println("�۱� �� ù��°, �ι�° ���� �ܾ�");
		System.out.println("ù��°: " + b1.getBalance());
		System.out.println("�ι�°: " + b2.getBalance());
		
		
		
		
		
		
		
		
		
	}

}
