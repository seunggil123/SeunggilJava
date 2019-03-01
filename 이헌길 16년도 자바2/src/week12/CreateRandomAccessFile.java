package week12;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class CreateRandomAccessFile {

	/*
	 *  자바에서 데이터파일로부터 임의의 위치에 있는 데이터를 추출하거나 혹은 임의의 위치에
	 *  데이터를 기록하는 것은 사실상 불가능 
	 *  -> 여기서 임의의 위치에 입출력을 수행할 수 있도록 하는 것이 RandomAccessFile 클래스이다.
	 *  RandomAccessFile 클래스는 순차적인 입출력만이 가능한것이 아니라
	 *  파일의 입출력 위치를 임의로 변경하고 입출력을 수행할 수 있다.
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
		int decision; // 아스키 코드 번호

		RandomAccessFile out = new RandomAccessFile(filename, "rw"); 
		//"rw" 읽고쓰기 가능하게 함. "r" -> 읽기전용
		out.setLength(0); // 빈파일,파일길이를 0바이트로 설정

		Scanner input = new Scanner(System.in);
		System.out.print("Last Name: ");
		IName = input.nextLine();

		while (!IName.equals("")) {
			System.out.print("First Name: ");
			fName = input.nextLine();
			name = IName + " " + fName;

			int size = NAME_SIZE - name.length(); // 얼마나 많은 빈칸이 필요?
			for (int j = 1; j <= size; j++) //이름에 빈칸삽입
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

			System.out.print("Decision: "); //판정
			decision = System.in.read();
			out.write(decision);

			temp = input.nextLine();

			System.out.print("Last Name: ");
			IName = input.nextLine();

		}
		out.close();

	}
}
