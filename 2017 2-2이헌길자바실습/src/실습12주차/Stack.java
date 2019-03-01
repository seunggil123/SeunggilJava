package �ǽ�12����;

import java.util.*; // ArrayList<E>�� ����

public class Stack<E> implements StackInterface<E> {
	private ArrayList<E> items;

	public Stack()
	// �⺻ ������, �� ���� ����
	{
		items = new ArrayList<E>(); // �ʱ� ũ�� 10
	}

	public Stack(int initialCapacity)
	// ���� �μ� ������, �ʱ� ũ�� initialCapacity�� ���� ����
	{
		items = new ArrayList<E>(initialCapacity);
	}

	public void push(E x) {
		items.add(x); // ArrayList �޼ҵ� add(E o) ���
	}

	public E pop() {
		if (empty()) // ���ŵ� �׸��� �ִ��� ����
			return null;
		return items.remove(items.size() - 1); // ArrayList �޼ҵ� remove(int n) ���
	}

	public boolean empty() {
		return items.isEmpty(); // ArrayList �޼ҵ� isEmpty() ���
	}

	public int size() {
		return items.size(); // ArayList �޼ҵ� size() ���
	}

	public E peek() {
		if (empty()) // ���ÿ� �׸��� �ִ��� ����
			return null;
		return items.get(items.size() - 1); // ArrayList �޼ҵ� get(int i) ���
	}
}