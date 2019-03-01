package 실습10;

import java.util.Scanner;
import java.util.Random;
public class NumberGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random ran = new Random();
		String str; // 키보드로부터 입력
		int ans = ran.nextInt(30); // 맞출값
		
		int count=0; // 시도횟수
		System.out.println("맞출 값: "+ ans);

		boolean a = false;

		while(!a)
		{
			int num=-1; // string - > int
			System.out.print("숫자 입력: ");
			str = input.next();
			count++;
			try
			{
				num = Integer.parseInt(str); // 입력받는문자를 숫자로
			}
			catch(NumberFormatException e)
			{
				System.out.println("숫자로 바꿀 수 없습니다. 다시 입력하세요.");
			}

			if(num == ans)
			{
				System.out.println("정답입니다.");
				System.out.println("시도 횟수: "+count);
				a=true;
			}
			else if(num > ans)
			{
				System.out.println("해당 숫자보다 큽니다.");
			}
			else if(num < ans && num!=-1)
			{
				System.out.println("해당 숫자보다 작습니다.");
			}
		}
	}

}

