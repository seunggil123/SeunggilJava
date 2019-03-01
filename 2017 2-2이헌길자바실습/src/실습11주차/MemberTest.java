package �ǽ�11����;
import java.io.*;
import java.util.*;
public class MemberTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException{

		int [] num = new int[3];

		FileInputStream fin = new FileInputStream("week11.1.dat");
		DataInputStream in = new DataInputStream(fin);

		for(int i=0; i<3; i++)
		{
			num[i] = in.readInt();
		}

		Member m1 = new Member("ȫ�浿",20,num[0]);
		Member m2 = new Member("������",20,num[1]);
		Member m3 = new Member("����",20,num[2]);

		System.out.println(m1);
		m1.borrow_book("ȫ�浿��", 0);
		m1.borrow_book("������", 1);
		m1.borrow_book("��û��", 2);
		m1.borrow_book("�߿������", 3);
		m1.borrow_book("��������", 4);
		m1.getList();
		System.out.println();

		System.out.println(m2);
		m2.borrow_book("ȫ�浿��", 0);
		m2.borrow_book("������", 1);
		m2.borrow_book("��û��", 2);
		m2.borrow_book("�߿������", 3);
		m2.borrow_book("��������", 4);
		m2.getList();

		System.out.println();
		System.out.println(m3);
		m3.borrow_book("ȫ�浿��", 0);
		m3.getList();

		System.out.println();
		System.out.println(m1);
		m1.return_book("��û��", 2);
		m1.getList();
		System.out.println();


		System.out.println(m2);
		m2.return_book("�߿������", 3);
		m2.getList();

		System.out.println();
		System.out.println(m3);
		m3.return_book("ȫ�浿��", 0);
		m3.getList();
		
		
		File file = new File("week112.dat");
		FileOutputStream fout = new FileOutputStream(file);
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(m1);
		out.writeObject(m2);
		out.writeObject(m3);
		
		FileInputStream oin = new FileInputStream("week112.dat");
		ObjectInputStream iin = new ObjectInputStream(oin);

		System.out.println("�ݳ��� ��ü ����ȭ");
		for(int i=0; i<3 ; i++)
		{
			Member temp = (Member)(iin.readObject());
			System.out.println(temp.toString());
			temp.getList();
			System.out.println();

		}



	}

}
