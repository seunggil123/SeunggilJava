package 실습71;
import java.util.*;
public class Test {

	public static void main(String[] args) {

		Publication[] p = new Publication[10];

		p[0] = new Publication("나무",300,20000,"JAVA프로그래밍");
		p[1] = new Magazine("키",200,54000,"C++","매달");
		p[2] = new Book("나무",200,30000,"웹프로그래밍","홍길동");
		p[3] = new KindsMagazine("사람인",300,30000,"어린이동향","매주",10);
		p[4] = new Publication("휴",300,20000,"공학글쓰기");
		p[5] = new KindsMagazine("휴",200,30000,"어린이집동향","매주",10);
		p[6] = new Book("전봇대",300,20000,"자료구조","김영희");
		p[7] = new Book("겨울",600,20000,"문해프","원숭이");
		p[8] = new Book("여름",200,30000,"토익","김철수");
		p[9] = new Magazine("봄",10,3000,"우분투","매일");

		System.out.println("정렬 전 출판물 현황");
		for(int i=0; i<p.length; i++)
		{
			System.out.print((i+1) + " ");
			p[i].display();
			System.out.println();
		}
		System.out.println();
		System.out.println("Array.sort 사용");
		/*
		 * Array.sort 사용
		 */
		String[] str = new String[10];
		for(int i=0; i<str.length; i++)
		{
			str[i] = p[i].getTitle();
		}

		Arrays.sort(str);
		//str 배열에 정렬된 문자열이 저장

	
		for(int i=0; i<str.length; i++)
		{
			for(int j=0; j<str.length; j++)
			{
				if(str[i].equals(p[j].getTitle()))
				{

					p[j].display();
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("compareTo 사용 정렬");
		
		Publication a = new Publication();
		
		for(int i=0; i<p.length; i++)
		{
			for(int j=0; j<p.length-1; j++)
			{	
				
				if(p[j].compareTo(p[j+1])==1)
				{
					a = p[j];
					p[j] = p[j+1];
					p[j+1] = a;			
				}
			}
		}
		
		for(int i=0; i<p.length; i++)
		{
			System.out.print((i+1) + " ");
			p[i].display();
			System.out.println();
		}

	}


}
