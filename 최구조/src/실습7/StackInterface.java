package 실습7;

public interface StackInterface<E> {
	public void push(E x);
	// 스택에 x를 넣는다.
	public E pop();
	// 상단의 항목을 제거하고 반환한다.
	// 스택이 비어있다면 널(null)을 반환한다.
	public boolean empty();
	// 스택에 아무 요소도 없다면 참(true)을 반환한다.
	public E peek();
	// 상단의 항목을 반환한다. 하지만 스택의 내용은 변경되지 않는다.
	// 스택이 비어있다면 널(null)을 반환한다.
	public int size();
	// 스택에 있는 항목의 수를 반환한다.
}
