package 실습11주차;
import java.util.Scanner;
import java.io.*;
public class ex1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner input = new Scanner(System.in);

		FileOutputStream fout = new FileOutputStream("week11.1.dat");
		DataOutputStream out = new DataOutputStream(fout);

		int[] a = new int[3];
		try
		{
			int num=0;
			for(int i=0; i<3; i++){
				System.out.println("고객번호를 입력하세요: ");
				num=input.nextInt();
				a[i] = num;
				out.writeInt(a[i]);
			}

			
		}
		
		catch(EOFException e)
		{
			
		}
	}

}
