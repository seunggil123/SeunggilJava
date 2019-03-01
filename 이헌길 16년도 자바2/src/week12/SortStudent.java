package week12;

import java.io.*;
import java.util.*;

public class SortStudent {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fin = new FileInputStream("Students.dat");
		ObjectInputStream in = new ObjectInputStream(fin);

		File file1 = new File("SortStudent.txt");
		FileWriter fw = new FileWriter(file1);
		BufferedWriter bw = new BufferedWriter(fw);

		String[] name = new String[10];
		Student[] p = new Student[10];
		int num = 0;
		try {
			while (true) {
				p[num] = (Student) (in.readObject());
				name[num] = p[num].getName(); // name�� �л� �̸�����
				// System.out.println(p[num]);
				num++;
			}

		}

		catch (EOFException e) {

		}

		Student temp = new Student();

		for (int k = 0; k < p.length; k++) {
			for (int i = 0; i < p.length - 1; i++) {
				for (int j = 0; j < name[i].length(); j++) // �ѱ��ھ� ��
				{

					char a = p[i].getName().charAt(j);
					char b = p[i + 1].getName().charAt(j);

					if ((p[i].getName().charAt(j)) > (p[i + 1].getName().charAt(j))) {
						temp = p[i];
						p[i] = p[i + 1];
						p[i + 1] = temp;
						break;
					} else
						break;
				}
			}
		}

		// Arrays.sort(name);
		// for(int i=0; i<p.length; i++)
		// {
		// for(int j=0; j<p.length; j++)
		// {
		// if(name[i].equals(p[j].getName()))
		// {
		// temp = p[j];
		// p[j] = p[i];
		// p[i] = temp;
		// }
		// }
		//
		// }

		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
			fw.write(p[i] + "\n");
		}

		bw.close();

		/**
		 * Sclass �������� �ڹ����� ��� 80�� �̻� ���
		 */
		FileOutputStream fout = new FileOutputStream("Sclass.dat");
		ObjectOutputStream out = new ObjectOutputStream(fout);

		double[] average = new double[10];

		for (int i = 0; i < p.length; i++) {
			average[i] = (p[i].getJavaScore() + p[i].getLinuxScore()) / 2;
		}

		System.out.println();
		for (int i = 0; i < p.length; i++) {
			if (average[i] > 80) {
				System.out.print("80�� �̻�: ");
				System.out.print(p[i] + "   " + average[i]);
				System.out.println();
				out.writeObject(p[i]);
			}
		}
	}
}
