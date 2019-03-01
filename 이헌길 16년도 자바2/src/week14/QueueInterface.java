package week14;

public interface QueueInterface<E> {
	public void insert(E x);
	// ť�� ����(rear)�� x�� �����Ѵ�.
	
	public E remove();
	// ����(front) �׸��� �����ϰ� ��ȯ�Ѵ�.
	// ť�� ����ִ� ���¶�� ��(null)�� ��ȯ�Ѵ�.
	
	public boolean empty();
	// ť�� ��Ұ� ���ٸ� ��(true)�� ��ȯ�Ѵ�.
	
	public E peek();
	// ������ �׸��� ��ȯ�Ѵ�. ������ ť�� ������ ������� �ʴ´�.
	// ť�� ����ִٸ� ��(null)�� ��ȯ�Ѵ�.
	
	public int size();
	// ť�� �ִ� �׸��� ���� ��ȯ�Ѵ�.
}