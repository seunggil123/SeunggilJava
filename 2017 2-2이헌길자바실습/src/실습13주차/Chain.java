package �ǽ�13����;
import java.util.*;
public class Chain
{
	private class Node // Chain ���ο� ����� Ŭ����, ���� Ŭ����(inner class)
	{

		private int data; 
		private Node next;

		public Node() // �⺻ ������
		{
			data = 0;
			next = null;
		}
		public Node(int a) // ���� �μ� ������
		{
			data = a;
			next = null;
		}
	} // Node 

	private Node head;
	int count=0;

	public Chain()
	{

		Random ran = new Random();
		int num = ran.nextInt(5)+1;
		int workNum = num;
		Node q, r;
		// ù ��° ��� ����
		head = new Node(num);
		num--;
		q = head; // head�� q ��� ù ��° ��带 ����

		while(!(num==0))
		{
			r = new Node(num); // ���ο� ��� ���
			q.next = r; // ���� ��带 ���ο� ���� ����
			q = r; // q�� �����ο ���� �̵�
			num--; // num = �۾���
			

		}
	}
	public void printChain()
	{
		Node q = head; // q�� ü�ο��� ù ��° ��带 ����

		while(q != null)
		{	
			
//			if(q.data){
//				System.out.println("�۾��Ϸ�");
//				break;
//			}
			System.out.print("���� �۾���: ");
			System.out.println(q.data);
			q = q.next;
			count++;
			// q�� ü�ο��� ���� ���� �̵�
		}
		System.out.println("�۾��Ϸ�");
		
	}


	public int getCount()
	{
		return count;
	}
	

}
