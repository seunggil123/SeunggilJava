package �ǽ�5����;
import java.util.*;
public class Test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		BankAccount[] ba = new BankAccount[3];

		ba[0] = new Regular();
		ba[1] = new Loan();
		ba[2] = new CMA();
		
		System.out.print("���ڸ� ������ ���� ��: ");
		int month = input.nextInt();

		for(int i=0; i<ba.length; i++)
		{
			ba[i].calulrate(month);
			System.out.println(ba[i]);
			System.out.println();
		}
		
	}

}
