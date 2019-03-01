package week14;

public class LList<E> {
	private class Node // 내부 클래스
	{
		private E data;
		private Node next;

		public Node() // 기본 생성자
		{
			data = null;
			next = null;
		}

		public Node(E x) // 한 인수 생성자
		{
			data = x;
			next = null;
		}
	} // class Node 끝

	private Node head, tail, current;
	private int length; // 리스트의 크기

	public LList() // 기본 생성자
	{
		tail = head = current = null;
		length = 0;
	}

	public void add(E x) // 리스트의 끝에 x 추가
	{
		Node p = new Node(x); // p에 의해 참조되는 새로운 노드 생성
		if (tail == null) // 리스트가 초기에 비어있다면
			head = tail = p; // 리스트는 하나의 노드만 가지고 있음
		else {
			tail.next = p; // p에 의해 참조되는 노드를 끝에 놓기
			tail = p;
		}
		length++;
	}

	public void add(int index, E x) // 리스트의 index 위치에 x 추가
	{
		if (index > length) // 범위를 벗어난 index
		{
			System.out.println("Out of range in add(int index, E x)");
			System.exit(0);
		}
		Node p = new Node(x); // p에 의해 참조되는 새로운 노드 생성
		// 리스트의 head에 추가
		if (index == 0) {
			p.next = head; // 첫 번째 노드의 주소를 새 노드에 넣기
			head = p; // head는 새로운 노드를 참조
			if (tail == null) // 리스트가 초기에 비어있다면
				tail = head; // head와 tail은 리스트의 한 노드를 참조
			length++;
			return;
		}

		// 리스트의 끝에 추가
		if (index == length) {
			add(x);
			return;
		}
		// 추가(addition)가 head나 tail에서 발생하지 않는다.
		Node q = head;
		for (int i = 0; i < index - 1; i++) // q는 index-1 위치의 노드를 지시
			q = q.next;
		Node r = q.next; // r은 (널(null)일 수 있는) q 다음의 노드를 참조
		q.next = p; // q 다음에 x를 저장하고 있는 노드 p를 삽입
		p.next = r;
		length++;
	}

	public void clear() // 빈 리스트 작성
	{
		head = tail = current = null;
		length = 0;
	}

	public boolean contains(E x) // x가 리스트의 멤버라면 참을 반환
	{
		Node p = head;
		for (int i = 0; i < length; i++) // 또한 “(while p.next != null)”도 사용 가능
		{
			if (x.equals(p.data))
				return true;
			p = p.next;
		}
		return false; // 검색 실패
	}

	public E get(int index) // index 위치의 데이터 반환
	{
		if (index >= length) // index가 범위를 벗어나면
		{
			System.out.println("Error in get (int index)");
			System.exit(0);
		}
		Node p = head;
		for (int i = 0; i < index; i++) // p를 index 위치의 노드에 위치
			p = p.next; // 연결 리스트의 다음 노드로 이동
		return p.data;
	}

	public boolean isEmpty() // 리스트가 비어있다면 참을 반환
	{
		return length == 0;
	}

	public boolean remove(E x) // 첫 번째로 발생하는 x 제거, 성공한다면 참을 반환
	{
		Node p = head;
		Node q = null;
		while (!(p == null) && !x.equals(p.data)) // x 찾기
		{
			q = p;
			p = p.next;
		}
		if (p == null) // 찾을 수 없음
			return false;
		if (p == current) // current 노드를 삭제한다면 current를 다음 노드로 이동
			current = p.next;
		if (!(q == null)) // x가 첫 번째 노드에 있다면 q는 널(null)임
			q.next = p.next;
		if (p == head) // x가 첫 번째 노드
			head = head.next;
		if (p == tail) // x가 마지막 노드
			tail = q;
		length--;
		return true;
	}

	public E remove(int index) // index 위치의 데이터를 제거하고 반환
	{
		if (index >= length) // 범위를 벗어난 index
		{
			System.out.println("Error in remove (int index)");
			System.exit(0);
		}
		Node p = head;
		Node q = null;
		for (int i = 0; i < index; i++) // q는 리스트에서 p의 뒤를 따라 이동
		{
			q = p; // q는 항상 p 앞의 노드를 가리킴
			p = p.next;
		}

		if (p == current) // current 노드를 삭제한다면 current를 다음 노드로 이동
			current = p.next;
		if (!(q == null)) // 첫 번째 노드가 삭제되지 않았다면
			// q는 p를 따라간다. 그러므로 p가 첫 번째 노드일 때 q는 널(null)이 된다.
			q.next = p.next; // p를 연결 리스트에서 삭제
		if (p == head)
			head = head.next; // p가 head일 때 삭제 코드
		if (p == tail)
			tail = q;
		length--;
		return p.data;
	}

	public int size() // 리스트의 데이터 수를 반환
	{
		return length;
	}

	public E set(int index, E x) // index 위치의 데이터를 x로 설정
	{
		if (index >= length) // 범위를 벗어난 index
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

	public void reset() // current 노드를 첫 번째 노드로 설정
	{
		current = head;
	}

	public boolean hasNext() // next() 호출이 성공하면 참을 반환
	{
		if (current == null)
			return false;
		return true;
	}

	public E next() // current 노드의 데이터를 반환하고 current를 다음 노드로 이동
	{
		if (current == null) {
			System.out.println("Error in hasNext() ");
			System.exit(0);
		}
		E temp = current.data;
		current = current.next;
		return temp;
	}

	public int Index_return(E x) // x값의 위치 반환
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
