package �ǽ�8;
import java.util.*;
public class ArrayCQueue implements Queue {

	private int front;
	private int rear;
	private int queueSize;
	private char itemArray[];

	public ArrayCQueue(int queueSize) {
		front = 0;
		rear = 0;
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize];
	}

	public boolean isEmpty() {
		return (front == rear);
	}

	public boolean isFull() {
		return (((rear + 1) % this.queueSize) == front);
	}

	public void enQueue(char item) {
		if (isFull()) {
			System.out.println(item+" Inserting fail! Array Circular Queue is full!");
		} else {
			rear = (rear + 1) % this.queueSize;
			itemArray[rear] = item;
		}
	}

	public char deQueue() {
		if (isEmpty()) {
			System.out.println("Deleting fail!");
			return 0;
		} else {
			front = (front + 1) % this.queueSize;
			return itemArray[front];
		}
	}

	public void delete() {
		if (isEmpty()) {
			System.out.println("Deleting Fail!");
		} else {
			front = (front + 1) % this.queueSize;
		}
	}

	public char peek() {
		if (isEmpty()) {
			System.out.println("Peeking Fail!");
			return 0;
		} else {
			return itemArray[(front + 1) % this.queueSize];
		}
	}

	public void reverseQueue()
	{	
		System.out.println();
		System.out.println("<<<Reverse ����>>>");
		Stack s = new Stack<Character>();
		if(isEmpty())
			System.out.println("Reverse Fail!");
		else
		{	
			ArrayCQueue temp = new ArrayCQueue(this.queueSize);
			while(!(front==rear)) {
				s.push(itemArray[(front+1)%this.queueSize]);
				//ť���� �� ���� ���ÿ� push
				front = (front+1)%this.queueSize;
			}

			while(s.empty()==false) {
				temp.enQueue((char) s.pop());
				//������ ���Լ����̱� ������ pop�� ���ָ� �������� ���
			}
			temp.printQueue();
		}
	}

	public void printQueue()
	{
		if(isEmpty())
			System.out.println("Array Circular Queue is empty!");
		else {
			System.out.print("Array Circular Queue >> ");
			for(int i=(front+1)%this.queueSize; i != (rear+1)%this.queueSize; i=++i % this.queueSize)
				System.out.print(itemArray[i]+"  ");
			System.out.println();

		}
	}

}
