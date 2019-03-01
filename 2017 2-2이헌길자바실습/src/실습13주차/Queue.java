package 실습13주차;

public class Queue<E> implements QueueInterface<E> {
	private E[] items;
	private int numItems;
	int front, rear; 
	int maxQueue;

	public Queue()
	{
		items = (E[]) new Object[10]; 
		numItems = 0;
		front = rear = -1; 
		maxQueue = 10;
	}

	public Queue(int max)
	{
		maxQueue = max;
		items = (E[]) new Object[maxQueue]; 
		numItems = 0;
		front = rear = -1; 
	}

	public void insert(E x)
	{
		if (numItems == maxQueue)
		{
			System.out.println("Queue Overflow");
			System.exit(0);
		}

		rear = (rear + 1) % maxQueue;
		items[rear] = x;
		numItems++;
		if (numItems == 1)
			front = rear;
	}

	public E remove()
	{
		if (numItems == 0) 
			return null;
		E temp = items[front]; 
		numItems--;
		if (numItems == 0)
			front = rear = -1;
		else
			front = (front + 1) % maxQueue;
		return temp;
	}

	public E peek()
	{
		if (numItems == 0) 
			return null;
		else
			return items[front];
	}

	public boolean empty()
	{
		return numItems == 0;
	}

	public int size()
	{
		return numItems;
	}

}
