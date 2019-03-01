package 실습7;
import java.util.Scanner;
public class DieCasting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word;
		boolean done=false;


		System.out.println("주사위 던지기를 모의실험합니다.");
		System.out.print("엔터키 혹은 아무 글자나 입력하세요. 마치려면 q를 입력하세요.");
		while(!done)
		{
			word = input.nextLine();
			if(word.equalsIgnoreCase("q"))
			{
				done = true;
			}
			else
			{
				System.out.print( RandomNumbers.randomInt(1, 7));
			}


		}
	}




}
