package �ǽ�3;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("������� ����� ���ϴ� ���α׷��Դϴ�. ");
		System.out.println("�Է��� ��ġ���� 0������ ���� �Է��Ͻÿ� ");
		
		
		
		
		double sum=0.0;
		int count=0;
		double a;
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		
		a=input.nextDouble();
		while(a>0.0) // �������� �����Ǵ� ���� ����
			
		
			{
				sum=sum+a;
				count++;
				System.out.print("���ڸ� �Է��Ͻÿ�: ");
				a=input.nextDouble();
			}
		System.out.println("��� = " + sum/count);
		
	}

}
