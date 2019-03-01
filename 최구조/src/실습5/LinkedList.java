package �ǽ�5;

public class LinkedList {
	private ListNode head;

	public LinkedList() {
		head = null;
	}
	
	/*
	 * list �ʱ�ȭ
	 */
	public void init() {

		while (head.link != null) {
			ListNode temp = head;
			head = head.link;
			temp = null;
			//head�� �ű�鼭 ��� temp�� �����Ͽ� head�� ����Ű�� temp�� null�� ó��
			
		}
		if (head.link == null) //������ �κ� ó��
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
		ListNode pre = new ListNode(data); //pre��� ����(�߰��Ϸ��� ���)
		if (head == null) {
			head = pre;
			//head�� ����ִٸ� ó�� ���� pre
		} else {
			pre.link = head;
			head = pre;
			//pre�� link�� head�̰� (pre -> head)
			//head�� pre�� �ű��.
			//A->B->C   ====>  pre -> A->B->C
		}
	}

	public void deleteLastNode() {
		ListNode pre, temp;
		if (head == null)
			return; // head�� null�̸� ����
		if (head.link == null) {
			head = null; // head�� ������ ����̸� null
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
		// ��尡 ����ִ� ��� , ��尡1���� ��� ó��
		else {
			pre = head;
			temp = head.link;
			if(head == searchNode(data))
			{ //head�� data�� ���� ����� head�� ������ �ű��.
				head = head.link;
				pre = null; //pre�� head�� ����Ű�� �־����Ƿ� nulló��(����)�Ѵ�.
				pre = head; //�ٽ� pre�� head�� ����Ų��. 
				//ó��(head)�� ������� ����϶�
			}
			while (temp.link != null) {
				if (temp == searchNode(data)) {
					temp = temp.link; //temp�� ������� ��忡 �����ߴٸ�
					pre.link = null; //pre�� temp�� ����Ű�� �����Ƿ� nulló��(����)�Ѵ�.
					pre.link = temp; //�ٽ� pre�� temp�� ����Ų��.
					break; //while�� ����
				}
				pre = temp; //���� temp�� ������� ��尡 �ƴҶ� pre�� temp�� ���� �̵��Ѵ�. temp�� ����, �Ŀ� pre �̵�
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