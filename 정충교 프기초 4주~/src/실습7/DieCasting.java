package �ǽ�7;
import java.util.Scanner;
public class DieCasting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word;
		boolean done=false;


		System.out.println("�ֻ��� �����⸦ ���ǽ����մϴ�.");
		System.out.print("����Ű Ȥ�� �ƹ� ���ڳ� �Է��ϼ���. ��ġ���� q�� �Է��ϼ���.");
		while(!done)
		{
			word = input.nextLine();
			if(word.equalsIgnoreCase("q"))
			{
				done = true;
			}
			else
			{
				System.out.print( RandomNumbers.randomInt(1, 7));
			}


		}
	}




}
