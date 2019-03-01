package ½Ç½À1314;

public class LinkedQueue {
	QNode front;
	QNode rear;
	
	public LinkedQueue()
	{
		front = null;
		rear = null;
	}
	
	public boolean isEmpty()
	{
		return (front == null);
	}
	
	public void enQueue(int item)
	{
		QNode newNode = new QNode();
		newNode.data = item;
		newNode.link = null;
		if(isEmpty())
		{
			front = newNode;
			rear = newNode;
		}
		else {
			rear.link = newNode;
			rear = newNode;
		}
		
	}
	
	public int deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Deleting fail! ");
			return 0;
		}
		else {
			int item = front.data;
			front = front.link;
			if(front==null)
				rear = null;
			return item;
		}
	}
	
	public int poll()
	{
		if(isEmpty())
		{
			System.out.println("Poll fail! ");
			return 0;
		}
		else
		{
			int item = front.data;
			return item;
		}
	}
}
