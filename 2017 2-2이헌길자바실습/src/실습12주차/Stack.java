package 실습12주차;

import java.util.*; // ArrayList<E>를 위해

public class Stack<E> implements StackInterface<E> {
	private ArrayList<E> items;

	public Stack()
	// 기본 생성자, 빈 스택 생성
	{
		items = new ArrayList<E>(); // 초기 크기 10
	}

	public Stack(int initialCapacity)
	// 단일 인수 생성자, 초기 크기 initialCapacity로 스택 생성
	{
		items = new ArrayList<E>(initialCapacity);
	}

	public void push(E x) {
		items.add(x); // ArrayList 메소드 add(E o) 사용
	}

	public E pop() {
		if (empty()) // 제거될 항목이 있는지 결정
			return null;
		return items.remove(items.size() - 1); // ArrayList 메소드 remove(int n) 사용
	}

	public boolean empty() {
		return items.isEmpty(); // ArrayList 메소드 isEmpty() 사용
	}

	public int size() {
		return items.size(); // ArayList 메소드 size() 사용
	}

	public E peek() {
		if (empty()) // 스택에 항목이 있는지 결정
			return null;
		return items.get(items.size() - 1); // ArrayList 메소드 get(int i) 사용
	}
}