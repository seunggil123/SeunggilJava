package �ǽ�15;
import java.util.*;
public class EX15 {

	public static void main(String[] args) {
		
		int cnt = 10;
		int [] BtT = new int[cnt];
		int [] Rnd = new int[cnt];
		int [] TtB = new int[cnt];
		
		for(int i=1; i<=cnt; i++)
		{
			BtT[i-1] = i; //����
			TtB[i-1] = cnt-i+1; //����
			
			Random rnd = new Random();
			Rnd[i-1]=rnd.nextInt(cnt)+1; //����
		}
		
		Bubble s1 = new Bubble();
		System.out.println("<<Bubble>>");
		System.out.println("���� ���� : ");
		s1.BubbleSort(BtT);
		
		System.out.println("���� : ");
		s1.BubbleSort(Rnd);
		
		System.out.println("���� ���� : ");
		s1.BubbleSort(TtB);
		
		Quick q1 = new Quick();
		Quick q2 = new Quick();
		Quick q3 = new Quick();
		System.out.println("<<Quick>>");
		System.out.println("���� ���� : ");
		q1.Quick(BtT, 0, cnt-1);
		q1.print_count();
		
		System.out.println("���� : ");
		q2.Quick(Rnd, 0, cnt-1);
		q2.print_count();
		
		System.out.println("���� ���� : ");
		q3.Quick(TtB, 0, cnt-1);
		q3.print_count();
		
		Insert i = new Insert();
		System.out.println("<<Insert>>");
		System.out.println("�������� : ");
		i.insertionSort(BtT, cnt);
		System.out.println("���� : ");
		i.insertionSort(Rnd, cnt);
		System.out.println("���� ���� : ");
		i.insertionSort(TtB, cnt);

	}

}
