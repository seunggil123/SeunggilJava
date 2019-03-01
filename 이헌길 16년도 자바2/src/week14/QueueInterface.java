package week14;

public interface QueueInterface<E> {
	public void insert(E x);
	// 큐의 뒤쪽(rear)에 x를 삽입한다.
	
	public E remove();
	// 앞쪽(front) 항목을 제거하고 반환한다.
	// 큐가 비어있는 상태라면 널(null)을 반환한다.
	
	public boolean empty();
	// 큐에 요소가 없다면 참(true)을 반환한다.
	
	public E peek();
	// 앞쪽의 항목을 반환한다. 하지만 큐의 내용은 변경되지 않는다.
	// 큐가 비어있다면 널(null)을 반환한다.
	
	public int size();
	// 큐에 있는 항목의 수를 반환한다.
}