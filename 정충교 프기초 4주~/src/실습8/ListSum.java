package �ǽ�8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ListSum {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(new File("integers.txt"));
		int [] list = new int[10];
		
		for(int i=0; i<list.length; i++)
		{
			list[i] = input.nextInt();
		}
	
		int sum=0;
		for(int i=1; i<=10; i++)
		{
			sum=sum+list[i-1];
			System.out.println("�迭�� ù "+ i + "�� ������ ��: "+sum);
		}
	
	System.out.println();
	input.close();
	
	}

}
