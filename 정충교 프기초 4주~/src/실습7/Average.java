package �ǽ�7;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String word;
		int count=0;
		double sum=0;
		
		System.out.println("�հ� ����� ���ϴ� ���α׷��Դϴ�.");
		System.out.println("�Է��� ��ġ���� q, Ȥ�� Q�� �Է��Ͻÿ�.");

		boolean done = false;

		//		double x = Double.parseDouble(word); 
		//word�� �Ǽ������� ��ȯ

		while(!done)
		{
			System.out.print("���ڸ� �Է��Ͻÿ�: ");
			word = input.next();
			if(word.equalsIgnoreCase("q"))
			{
				done = true;

			}
			else /////// if�� ������ ������ else�� ���ֱ�
			{
				double x = Double.parseDouble(word);
				count++;
				sum=sum+x;
			}
		}
		System.out.print("��= ");
		System.out.println(sum);
		System.out.print("���= ");
		System.out.println(sum/count);

	}

}
