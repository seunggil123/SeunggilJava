package �ǽ�7;

public interface StackInterface<E> {
	public void push(E x);
	// ���ÿ� x�� �ִ´�.
	public E pop();
	// ����� �׸��� �����ϰ� ��ȯ�Ѵ�.
	// ������ ����ִٸ� ��(null)�� ��ȯ�Ѵ�.
	public boolean empty();
	// ���ÿ� �ƹ� ��ҵ� ���ٸ� ��(true)�� ��ȯ�Ѵ�.
	public E peek();
	// ����� �׸��� ��ȯ�Ѵ�. ������ ������ ������ ������� �ʴ´�.
	// ������ ����ִٸ� ��(null)�� ��ȯ�Ѵ�.
	public int size();
	// ���ÿ� �ִ� �׸��� ���� ��ȯ�Ѵ�.
}
