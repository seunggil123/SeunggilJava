package �ǽ�5;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		double C;
		for(C=-40.0; C<=100.0; C++)
		{
			 
			System.out.println("C = "+C+"--> "+convert(C));
		}
		
		
	}

	
	//// �����µ��� ȭ���µ��� ��ȯ -> ���
	public static double convert(double c)
	{
		double f= c* 9.0/5.0+32.0;
		return f;
	}
}
