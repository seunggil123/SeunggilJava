package 실습5;

import java.io.FileNotFoundException;

public class Calc_test {

	public static void main(String[] args) throws FileNotFoundException
	{
		
		
		File_Calc fc = new File_Calc();
		
		System.out.println("3+4 = " + fc.add(3, 4));
		System.out.println("6-2 = " + fc.substract(6, 2));
		
		System.out.println("파일내용을 읽어 들여 덧셈: ");
		
		fc.file_list("Calc.txt");
		
		System.out.println();
		
		System.out.println("Calc.txt 파일의 숫자들의 합: " + fc.file_add("Calc.txt"));
	}

}
