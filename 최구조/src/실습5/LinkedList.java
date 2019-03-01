package 실습5;

public class LinkedList {
	private ListNode head;

	public LinkedList() {
		head = null;
	}
	
	/*
	 * list 초기화
	 */
	public void init() {

		while (head.link != null) {
			ListNode temp = head;
			head = head.link;
			temp = null;
			//head를 옮기면서 계속 temp를 선언하여 head를 가리키고 temp를 null로 처리
			
		}
		if (head.link == null) //마지막 부분 처리
			head = null;
	}

	public void insertMiddleNode(ListNode pre, String data) {
		ListNode newNode = new ListNode(data);
		newNode.link = pre.link;
		pre.link = newNode;
	}

	public void insertLastNode(String data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			this.head = newNode;
		} else {
			ListNode temp = head;
			while (temp.link != null)
				temp = temp.link;
			temp.link = newNode;
		}
	}

	public void insertFirstNode(String data) {
		ListNode pre = new ListNode(data); //pre노드 선언(추가하려는 노드)
		if (head == null) {
			head = pre;
			//head가 비어있다면 처음 노드는 pre
		} else {
			pre.link = head;
			head = pre;
			//pre의 link는 head이고 (pre -> head)
			//head를 pre로 옮긴다.
			//A->B->C   ====>  pre -> A->B->C
		}
	}

	public void deleteLastNode() {
		ListNode pre, temp;
		if (head == null)
			return; // head가 null이면 종료
		if (head.link == null) {
			head = null; // head가 마지막 노드이면 null
		} else {
			pre = head;
			temp = head.link;
			while (temp.link != null) {
				pre = temp;
				temp = temp.link;
			}
			pre.link = null;
		}
	}

	public void deleteNode(String data) {
		ListNode temp, pre;
		if (head == null)
			return;
		if (head.link == null)
			head = null;
		// 노드가 비어있는 경우 , 노드가1개인 경우 처리
		else {
			pre = head;
			temp = head.link;
			if(head == searchNode(data))
			{ //head가 data와 같은 노드라면 head를 옆으로 옮긴다.
				head = head.link;
				pre = null; //pre는 head를 가리키고 있었으므로 null처리(삭제)한다.
				pre = head; //다시 pre는 head를 가리킨다. 
				//처음(head)가 지우려는 노드일때
			}
			while (temp.link != null) {
				if (temp == searchNode(data)) {
					temp = temp.link; //temp가 지우려는 노드에 도착했다면
					pre.link = null; //pre는 temp를 가리키고 있으므로 null처리(삭제)한다.
					pre.link = temp; //다시 pre는 temp를 가리킨다.
					break; //while문 종료
				}
				pre = temp; //만약 temp가 지우려는 노드가 아닐때 pre와 temp는 같이 이동한다. temp가 먼저, 후에 pre 이동
				temp = temp.link;

			}
		}
	}

	public ListNode searchNode(String data) {
		ListNode temp = this.head;
		while (temp != null) {
			if (data.equals(temp.getData()))
				return temp;
			else
				temp = temp.link;
		}
		return temp;
	}

	public void reverseList() {
		ListNode next = head;
		ListNode current = null;
		ListNode pre = null;
		while (next != null) {
			pre = current;
			current = next;
			next = next.link;
			current.link = pre;
		}
		head = current;
	}

	public void printList() {
		ListNode temp = this.head;
		System.out.print("L = (");
		while (temp != null) {
			System.out.print(temp.getData());
			temp = temp.link;
			if (temp != null) {
				System.out.print(", ");
			}
		}
		System.out.println(")");
	}
}