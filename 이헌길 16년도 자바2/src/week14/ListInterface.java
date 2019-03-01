package week14;

public interface ListInterface<E> {
	void add(int index, E x);
	// index ��ġ�� x�� �����Ѵ�.
	void add(E x);
	// ����Ʈ�� ���� x�� �����Ѵ�.
	void clear();
	// ����Ʈ�� ��� ��ü�� �����Ѵ�.
	boolean contains (E x);
	// x�� ����Ʈ�� ����̸� ���� ��ȯ�Ѵ�.
	E get(int index);
	// index ��ġ�� Object�� ��ȯ�Ѵ�.
	boolean isEmpty();
	// ����Ʈ�� ��Ұ� �ϳ��� ���ٸ� ���� ��ȯ�Ѵ�.
	boolean remove (E x);
	// x�� ����Ʈ�� ����̸�, ����Ʈ���� ù ��°�� �߰ߵǴ� x�� �����ϰ� x ������ ���
	// ����� ��ġ�� ������ �̵���Ű��, ���� ��ȯ�Ѵ�. �׷��� ������ ������ ��ȯ�Ѵ�.
	E remove (int index);
	// index ��ġ�� x ��ü�� �����ϰ� ��ȯ�Ѵ�.
	// x ������ ��� ��Ҹ� �� ��ġ ������ �̵�(shift)��Ų��.
	E set (int index, E x);
	// index�� �ִ� ��ü�� x�� ��ü�ϰ�, ��ü�� ��ü�� ��ȯ�Ѵ�.
	int size();
	// ���� ����Ʈ�� �ִ� ��ü�� ���� ��ȯ�Ѵ�.
}
