package �ǽ�71;
import java.util.*;
public class Test {

	public static void main(String[] args) {

		Publication[] p = new Publication[10];

		p[0] = new Publication("����",300,20000,"JAVA���α׷���");
		p[1] = new Magazine("Ű",200,54000,"C++","�Ŵ�");
		p[2] = new Book("����",200,30000,"�����α׷���","ȫ�浿");
		p[3] = new KindsMagazine("�����",300,30000,"��̵���","����",10);
		p[4] = new Publication("��",300,20000,"���б۾���");
		p[5] = new KindsMagazine("��",200,30000,"���������","����",10);
		p[6] = new Book("������",300,20000,"�ڷᱸ��","�迵��");
		p[7] = new Book("�ܿ�",600,20000,"������","������");
		p[8] = new Book("����",200,30000,"����","��ö��");
		p[9] = new Magazine("��",10,3000,"�����","����");

		System.out.println("���� �� ���ǹ� ��Ȳ");
		for(int i=0; i<p.length; i++)
		{
			System.out.print((i+1) + " ");
			p[i].display();
			System.out.println();
		}
		System.out.println();
		System.out.println("Array.sort ���");
		/*
		 * Array.sort ���
		 */
		String[] str = new String[10];
		for(int i=0; i<str.length; i++)
		{
			str[i] = p[i].getTitle();
		}

		Arrays.sort(str);
		//str �迭�� ���ĵ� ���ڿ��� ����

	
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
		System.out.println("compareTo ��� ����");
		
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
