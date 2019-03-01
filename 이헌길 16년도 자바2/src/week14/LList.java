package week14;

public class LList<E> {
	private class Node // ���� Ŭ����
	{
		private E data;
		private Node next;

		public Node() // �⺻ ������
		{
			data = null;
			next = null;
		}

		public Node(E x) // �� �μ� ������
		{
			data = x;
			next = null;
		}
	} // class Node ��

	private Node head, tail, current;
	private int length; // ����Ʈ�� ũ��

	public LList() // �⺻ ������
	{
		tail = head = current = null;
		length = 0;
	}

	public void add(E x) // ����Ʈ�� ���� x �߰�
	{
		Node p = new Node(x); // p�� ���� �����Ǵ� ���ο� ��� ����
		if (tail == null) // ����Ʈ�� �ʱ⿡ ����ִٸ�
			head = tail = p; // ����Ʈ�� �ϳ��� ��常 ������ ����
		else {
			tail.next = p; // p�� ���� �����Ǵ� ��带 ���� ����
			tail = p;
		}
		length++;
	}

	public void add(int index, E x) // ����Ʈ�� index ��ġ�� x �߰�
	{
		if (index > length) // ������ ��� index
		{
			System.out.println("Out of range in add(int index, E x)");
			System.exit(0);
		}
		Node p = new Node(x); // p�� ���� �����Ǵ� ���ο� ��� ����
		// ����Ʈ�� head�� �߰�
		if (index == 0) {
			p.next = head; // ù ��° ����� �ּҸ� �� ��忡 �ֱ�
			head = p; // head�� ���ο� ��带 ����
			if (tail == null) // ����Ʈ�� �ʱ⿡ ����ִٸ�
				tail = head; // head�� tail�� ����Ʈ�� �� ��带 ����
			length++;
			return;
		}

		// ����Ʈ�� ���� �߰�
		if (index == length) {
			add(x);
			return;
		}
		// �߰�(addition)�� head�� tail���� �߻����� �ʴ´�.
		Node q = head;
		for (int i = 0; i < index - 1; i++) // q�� index-1 ��ġ�� ��带 ����
			q = q.next;
		Node r = q.next; // r�� (��(null)�� �� �ִ�) q ������ ��带 ����
		q.next = p; // q ������ x�� �����ϰ� �ִ� ��� p�� ����
		p.next = r;
		length++;
	}

	public void clear() // �� ����Ʈ �ۼ�
	{
		head = tail = current = null;
		length = 0;
	}

	public boolean contains(E x) // x�� ����Ʈ�� ������ ���� ��ȯ
	{
		Node p = head;
		for (int i = 0; i < length; i++) // ���� ��(while p.next != null)���� ��� ����
		{
			if (x.equals(p.data))
				return true;
			p = p.next;
		}
		return false; // �˻� ����
	}

	public E get(int index) // index ��ġ�� ������ ��ȯ
	{
		if (index >= length) // index�� ������ �����
		{
			System.out.println("Error in get (int index)");
			System.exit(0);
		}
		Node p = head;
		for (int i = 0; i < index; i++) // p�� index ��ġ�� ��忡 ��ġ
			p = p.next; // ���� ����Ʈ�� ���� ���� �̵�
		return p.data;
	}

	public boolean isEmpty() // ����Ʈ�� ����ִٸ� ���� ��ȯ
	{
		return length == 0;
	}

	public boolean remove(E x) // ù ��°�� �߻��ϴ� x ����, �����Ѵٸ� ���� ��ȯ
	{
		Node p = head;
		Node q = null;
		while (!(p == null) && !x.equals(p.data)) // x ã��
		{
			q = p;
			p = p.next;
		}
		if (p == null) // ã�� �� ����
			return false;
		if (p == current) // current ��带 �����Ѵٸ� current�� ���� ���� �̵�
			current = p.next;
		if (!(q == null)) // x�� ù ��° ��忡 �ִٸ� q�� ��(null)��
			q.next = p.next;
		if (p == head) // x�� ù ��° ���
			head = head.next;
		if (p == tail) // x�� ������ ���
			tail = q;
		length--;
		return true;
	}

	public E remove(int index) // index ��ġ�� �����͸� �����ϰ� ��ȯ
	{
		if (index >= length) // ������ ��� index
		{
			System.out.println("Error in remove (int index)");
			System.exit(0);
		}
		Node p = head;
		Node q = null;
		for (int i = 0; i < index; i++) // q�� ����Ʈ���� p�� �ڸ� ���� �̵�
		{
			q = p; // q�� �׻� p ���� ��带 ����Ŵ
			p = p.next;
		}

		if (p == current) // current ��带 �����Ѵٸ� current�� ���� ���� �̵�
			current = p.next;
		if (!(q == null)) // ù ��° ��尡 �������� �ʾҴٸ�
			// q�� p�� ���󰣴�. �׷��Ƿ� p�� ù ��° ����� �� q�� ��(null)�� �ȴ�.
			q.next = p.next; // p�� ���� ����Ʈ���� ����
		if (p == head)
			head = head.next; // p�� head�� �� ���� �ڵ�
		if (p == tail)
			tail = q;
		length--;
		return p.data;
	}

	public int size() // ����Ʈ�� ������ ���� ��ȯ
	{
		return length;
	}

	public E set(int index, E x) // index ��ġ�� �����͸� x�� ����
	{
		if (index >= length) // ������ ��� index
		{
			System.out.println("Error in get (int index)");
			System.exit(0);
		}
		Node p = head;
		for (int i = 0; i < index; i++)
			p = p.next;
		E temp = p.data;
		p.data = x;
		return temp;
	}

	public void reset() // current ��带 ù ��° ���� ����
	{
		current = head;
	}

	public boolean hasNext() // next() ȣ���� �����ϸ� ���� ��ȯ
	{
		if (current == null)
			return false;
		return true;
	}

	public E next() // current ����� �����͸� ��ȯ�ϰ� current�� ���� ���� �̵�
	{
		if (current == null) {
			System.out.println("Error in hasNext() ");
			System.exit(0);
		}
		E temp = current.data;
		current = current.next;
		return temp;
	}

	public int Index_return(E x) // x���� ��ġ ��ȯ
	{
		int index = 0;
		Node p = head;
		for (int i = 0; i < length; i++) {
			if (p.data.equals(x)) {
				break;
			} else {
				p = p.next;
				index++;
			}
		}
		return index;
	}

	public void printLList() {
		Node p = head;
		while (!(p == null)) {
			System.out.println(p.data);
			p = p.next;
		}
	}

	public void printLList(E x) {
		Node p = head;

		while (!(p == null)) {
			int a = Index_return(x);
			int b = Index_return(p.data);
			if (Index_return(p.data) == Index_return(x)) {
				p = p.next;
			}
			if (p != null) {
				System.out.println(p.data);
				p = p.next;
			}
		}
	}

}
