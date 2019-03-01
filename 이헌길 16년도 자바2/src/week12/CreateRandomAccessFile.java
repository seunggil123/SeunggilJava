package week12;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class CreateRandomAccessFile {

	/*
	 *  �ڹٿ��� ���������Ϸκ��� ������ ��ġ�� �ִ� �����͸� �����ϰų� Ȥ�� ������ ��ġ��
	 *  �����͸� ����ϴ� ���� ��ǻ� �Ұ��� 
	 *  -> ���⼭ ������ ��ġ�� ������� ������ �� �ֵ��� �ϴ� ���� RandomAccessFile Ŭ�����̴�.
	 *  RandomAccessFile Ŭ������ �������� ����¸��� �����Ѱ��� �ƴ϶�
	 *  ������ ����� ��ġ�� ���Ƿ� �����ϰ� ������� ������ �� �ִ�.
	 *  
	 */
	public static void makeRandomAccessFile(String filename) throws IOException {
		String IName = "";
		String fName = "";
		String name = "";
		String temp = "";
		final int NAME_SIZE = 35;
		int score;
		double gpa;
		int decision; // �ƽ�Ű �ڵ� ��ȣ

		RandomAccessFile out = new RandomAccessFile(filename, "rw"); 
		//"rw" �а��� �����ϰ� ��. "r" -> �б�����
		out.setLength(0); // ������,���ϱ��̸� 0����Ʈ�� ����

		Scanner input = new Scanner(System.in);
		System.out.print("Last Name: ");
		IName = input.nextLine();

		while (!IName.equals("")) {
			System.out.print("First Name: ");
			fName = input.nextLine();
			name = IName + " " + fName;

			int size = NAME_SIZE - name.length(); // �󸶳� ���� ��ĭ�� �ʿ�?
			for (int j = 1; j <= size; j++) //�̸��� ��ĭ����
			{
				name = name + "";
			}
			out.writeChars(name);

			System.out.print("Math: ");
			score = input.nextInt();
			out.writeInt(score);

			System.out.print("Verbal: ");
			score = input.nextInt();
			out.writeInt(score);

			System.out.print("Writing: ");
			score = input.nextInt();
			out.writeInt(score);

			System.out.println("Grade Point Average: ");
			gpa = input.nextDouble();
			out.writeDouble(gpa);
			temp = input.nextLine();

			System.out.print("Decision: "); //����
			decision = System.in.read();
			out.write(decision);

			temp = input.nextLine();

			System.out.print("Last Name: ");
			IName = input.nextLine();

		}
		out.close();

	}
}
