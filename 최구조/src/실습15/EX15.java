package 실습15;
import java.util.*;
public class EX15 {

	public static void main(String[] args) {
		
		int cnt = 10;
		int [] BtT = new int[cnt];
		int [] Rnd = new int[cnt];
		int [] TtB = new int[cnt];
		
		for(int i=1; i<=cnt; i++)
		{
			BtT[i-1] = i; //오름
			TtB[i-1] = cnt-i+1; //내림
			
			Random rnd = new Random();
			Rnd[i-1]=rnd.nextInt(cnt)+1; //랜덤
		}
		
		Bubble s1 = new Bubble();
		System.out.println("<<Bubble>>");
		System.out.println("오름 차순 : ");
		s1.BubbleSort(BtT);
		
		System.out.println("랜덤 : ");
		s1.BubbleSort(Rnd);
		
		System.out.println("내림 차순 : ");
		s1.BubbleSort(TtB);
		
		Quick q1 = new Quick();
		Quick q2 = new Quick();
		Quick q3 = new Quick();
		System.out.println("<<Quick>>");
		System.out.println("오름 차순 : ");
		q1.Quick(BtT, 0, cnt-1);
		q1.print_count();
		
		System.out.println("랜덤 : ");
		q2.Quick(Rnd, 0, cnt-1);
		q2.print_count();
		
		System.out.println("내림 차순 : ");
		q3.Quick(TtB, 0, cnt-1);
		q3.print_count();
		
		Insert i = new Insert();
		System.out.println("<<Insert>>");
		System.out.println("오름차순 : ");
		i.insertionSort(BtT, cnt);
		System.out.println("랜덤 : ");
		i.insertionSort(Rnd, cnt);
		System.out.println("내림 차순 : ");
		i.insertionSort(TtB, cnt);

	}

}
