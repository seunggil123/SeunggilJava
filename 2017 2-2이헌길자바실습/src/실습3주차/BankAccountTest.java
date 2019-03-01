package 실습3주차;

public class BankAccountTest {

	public static void main(String[] args) {
		
		Person a = new Person("한지우",25,950324);
		Person b = new Person("피카츄", 7,980324);
		
		BankAccount a1 = new BankAccount("한지우",25,950324,5000.0,1234);
		BankAccount a2 = new BankAccount("피카츄", 7,980324,0.0,12345);
		
		
		a.print();
		System.out.println();
		b.print();
		System.out.println();

		a1.print();
		System.out.println();
		a2.print();
		System.out.println();
		
		System.out.println("예치금 설정");
		a1.setMoney(100000.0);
		a1.print();
		
		System.out.println();
		
		a2.print();
		System.out.println();
		
		a1.transfer(50000.0, a2);
		a1.print();
		System.out.println();
		a2.print();
		System.out.println();
		
		System.out.println("이자율 계산");
		a1.print();
		
		a1.plus(5);
		System.out.println();
		a1.print();
	
		
	
		
	
	}

}
