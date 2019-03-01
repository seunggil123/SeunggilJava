package ���ڹ�;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		int num=input.nextInt();

		int[] a = new int[num];

		/*
		 * ��������
		 */
		for(int i=0; i<a.length; i++)
		{
			a[i] = input.nextInt();
		}

		for(int i=0; i<a.length-1; i++){
			for(int j=0; j<a.length-1; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}

		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.print("ã�����°� �Է�: ");
		int key = input.nextInt();
		
		if(binarySearch(a,num,key)==-1)
		{	
			System.out.println("ã������ ���� �����ϴ�.");
		}
		else
			System.out.println("Ž�� �Ϸ�");
		

	}
	static int binarySearch(int[] x, int num, int key)
	{
		int low=0; //�迭�� �ּ� �ε���
		int high=num-1;//�迭�� �ִ� �ε��� 
		int mid;//�߾��ε���

		while(high>=low)
		{
			mid= (high+low)/2;
			if(key == mid)
				return mid; //Ű�� �߰�
			if(key < x[mid])
				high=mid-1; // Ű�� mid�ε������� ������ high�� 1���δ�.
			else
				low=mid+1; // Ű�� mid�ε������� ũ�ٸ� low�� 1������Ų��.
		}
		return -1; //��ã����

	}
}
