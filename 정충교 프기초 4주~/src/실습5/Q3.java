package �ǽ�5;

public class Q3 {

	public static void main(String[] args) {
		double C;
		for(C=-40.0; C<=100.0; C++)
		{
			 
			System.out.print("C = "+C+"--> ");
			convertAndPrint(C);
		}
		
		
	}

	
	//// �����µ��� ȭ���µ��� ��ȯ -> ���
	public static void convertAndPrint(double c)
	{
		double f= c* 9.0/5.0+32.0;
		System.out.println(f);
	}
}
