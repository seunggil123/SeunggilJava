package ����ã��;

import java.util.Random;
import java.util.Scanner;

/**
 * 3x3�� �迭�� �������� ������ Ŭ���� ����
����ũ���� String �迭 ����
�ʱⰪ = "?"

������ "?" �� ��ġ�� �´� �����̸��� ����� �Ѵ�.
ȭ�鿡�� ? �� �̷���� �迭�� �����ִ� ������ ���� ���´�.
�����ִ� ������ ���� ���� ? �ȿ� � ������ �ִ��� ���纻��.
�� ���߸� Game Over

 * @author user
 *
 */
public class Test {

	final static int a = 3;
	final static int b = 3;
	//	static Animal animal[][];
	static String[][] q;

	public static void main(String[] args) {
		//�迭 ����
		Animal[][] animal = new Animal[a][b];
		q = new String[a][b];

		//Ŭ���� �ν��Ͻ� ����
		Cat cat = new Cat();
		Dog dog = new Dog();
		Lion lion = new Lion();

		//����  ���� 9�� ����
		Random rand = new Random();
		int[] x = new int[a*b];
		for(int i = 0 ; i < x.length; i++ ){
			x[i] = 1 + rand.nextInt(3);
//			System.out.println(x[i]);
		}

		// animal ī��Ʈ
		int catCount = 0;
		int dogCount = 0;
		int lionCount = 0;
		/**
		 * x[i] �迭�� ������ ���Ͽ� 1-������, 2-�����, 3-����
		 */
		// �迭 �ʱ�ȭ
		int k=0;
		for(int i = 0 ; i <animal.length; i++) {
			for(int j = 0; j<animal[i].length; j++) {
				if(x[k]==1) {
					animal[i][j] =cat;
					catCount ++;
					k++;
				}
				else if(x[k]==2) {
					animal[i][j] = dog;
					dogCount++;
					k++;
				}
				else {
					animal[i][j] = lion;
					lionCount++;
					k++;
				}
				q[i][j] = "?";
			}
		}

//		//���� �� �׽�Ʈ
//		for(int i = 0 ; i <a; i++) {
//			for(int j = 0; j<b; j++) {
//				System.out.print(animal[i][j].name+"\t");
//			}
//			System.out.println();
//		}
//		for(int i = 0 ; i <a*b; i++) {
//			System.out.print(x[i] + "/");
//		}
//		System.out.println();

		//������ ��������
		Scanner in = new Scanner(System.in);
		int row = 0;	//�Է� ���� ��ǥ
		int col = 0;
		String target = "";
		boolean s = true;
		//���� ����
		while(s) {
			System.out.println("#########################");
			printArray(q);
			System.out.println("#########################");
			System.out.println("���� ����� �� : " + catCount);
			System.out.println("���� ������ �� : " + dogCount);
			System.out.println("���� ���� �� : " + lionCount);
			System.out.println();
			System.out.println("��ǥ�� ���� ���� : ");	//��ǥ , ����

			row = in.nextInt();
			col = in.nextInt();
			target = in.nextLine().trim();	//nextLine���� �޾ƿ��� �� ������ ���ܼ� trim.
			System.out.println(target);

			if(row>=a ||col>=b ||row<0||col<0 || animal[row][col]==null) {
				System.out.println("\nƲ�Ƚ��ϴ�.");
				continue;
			}
			else if(animal[row][col].name.equals(target)) {	//����
				q[row][col] = target;
				animal[row][col]=null;
				if(target.equals("�����")) catCount --;
				else if(target.equals("������")) dogCount --;
				else if(target.equals("����")) lionCount--;
			}
			else {
				System.out.println("\nƲ�Ƚ��ϴ�.");
			}
			if(catCount+dogCount+lionCount == 0) {
				System.out.println("############################");
				System.out.println("\tGame Over!");
				System.out.println("############################");
				System.out.println("\nAnimal Array");
				printArray(q);
				s = false;	//���� ����
			}
		}
	}

	public static void printArray(String[][] arr){
		for(int i = 0 ; i <arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
