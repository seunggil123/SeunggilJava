package �ǽ�1;

import java.util.Scanner;

public class ȸ�� {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("���ڿ� �Է�: ");
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
			System.out.println("ȸ���Դϴ�.");
		else
			System.out.println("ȸ���� �ƴմϴ�.");

	}

}
