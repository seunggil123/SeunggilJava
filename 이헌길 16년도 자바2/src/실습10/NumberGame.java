package �ǽ�10;

import java.util.Scanner;
import java.util.Random;
public class NumberGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random ran = new Random();
		String str; // Ű����κ��� �Է�
		int ans = ran.nextInt(30); // ���Ⱚ
		
		int count=0; // �õ�Ƚ��
		System.out.println("���� ��: "+ ans);

		boolean a = false;

		while(!a)
		{
			int num=-1; // string - > int
			System.out.print("���� �Է�: ");
			str = input.next();
			count++;
			try
			{
				num = Integer.parseInt(str); // �Է¹޴¹��ڸ� ���ڷ�
			}
			catch(NumberFormatException e)
			{
				System.out.println("���ڷ� �ٲ� �� �����ϴ�. �ٽ� �Է��ϼ���.");
			}

			if(num == ans)
			{
				System.out.println("�����Դϴ�.");
				System.out.println("�õ� Ƚ��: "+count);
				a=true;
			}
			else if(num > ans)
			{
				System.out.println("�ش� ���ں��� Ů�ϴ�.");
			}
			else if(num < ans && num!=-1)
			{
				System.out.println("�ش� ���ں��� �۽��ϴ�.");
			}
		}
	}

}

