package 실습13주차;
import java.util.*;
public class Chain
{
	private class Node // Chain 내부에 선언된 클래스, 내부 클래스(inner class)
	{

		private int data; 
		private Node next;

		public Node() // 기본 생성자
		{
			data = 0;
			next = null;
		}
		public Node(int a) // 단일 인수 생성자
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
		// 첫 번째 노드 생성
		head = new Node(num);
		num--;
		q = head; // head와 q 모두 첫 번째 노드를 참조

		while(!(num==0))
		{
			r = new Node(num); // 새로운 노드 얻기
			q.next = r; // 이전 노드를 새로운 노드로 연결
			q = r; // q를 ‘새로운’ 노드로 이동
			num--; // num = 작업량
			

		}
	}
	public void printChain()
	{
		Node q = head; // q는 체인에서 첫 번째 노드를 참조

		while(q != null)
		{	
			
//			if(q.data){
//				System.out.println("작업완료");
//				break;
//			}
			System.out.print("남은 작업량: ");
			System.out.println(q.data);
			q = q.next;
			count++;
			// q를 체인에서 다음 노드로 이동
		}
		System.out.println("작업완료");
		
	}


	public int getCount()
	{
		return count;
	}
	

}
