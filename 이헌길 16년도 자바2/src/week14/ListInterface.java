package week14;

public interface ListInterface<E> {
	void add(int index, E x);
	// index 위치에 x를 삽입한다.
	void add(E x);
	// 리스트의 끝에 x를 삽입한다.
	void clear();
	// 리스트의 모든 객체를 삭제한다.
	boolean contains (E x);
	// x가 리스트의 멤버이면 참을 반환한다.
	E get(int index);
	// index 위치의 Object를 반환한다.
	boolean isEmpty();
	// 리스트에 요소가 하나도 없다면 참을 반환한다.
	boolean remove (E x);
	// x가 리스트의 멤버이면, 리스트에서 첫 번째로 발견되는 x를 제거하고 x 다음의 모든
	// 요소의 위치를 앞으로 이동시키며, 참을 반환한다. 그렇지 않으면 거짓을 반환한다.
	E remove (int index);
	// index 위치의 x 객체를 제거하고 반환한다.
	// x 다음의 모든 요소를 한 위치 앞으로 이동(shift)시킨다.
	E set (int index, E x);
	// index에 있는 객체를 x로 대체하고, 대체된 객체를 반환한다.
	int size();
	// 현재 리스트에 있는 객체의 수를 반환한다.
}
