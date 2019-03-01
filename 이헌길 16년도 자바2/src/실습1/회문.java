package 실습1;

import java.util.Scanner;

public class 회문 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("문자열 입력: ");
		String str = input.nextLine();

		char [] array = new char[str.length()];

		int i;

		for(i=0; i<array.length; i++)

			array[i]=str.charAt(i);

		char[]backarray = new char[array.length];
		int j=array.length-1;
		for(i=0; i<array.length; i++)
		{
			backarray[j]=array[i];
			j--;
		}

		boolean reverse = false;

		for(i=0; i<array.length; i++)
		{
			if(array[i]==(backarray[i]))
					reverse = true;
		}
		if(reverse)
			System.out.println("회문입니다.");
		else
			System.out.println("회문이 아닙니다.");

	}

}
