package �ǽ�6;

public class CLinkedList {
	private CListNode CL;

	public CLinkedList() {
		CL = null;
	}

	/**
	 * ����Ʈ�� ���� �տ� ��� �߰�
	 * 
	 * @param data
	 */
	public void insertFirstNode(String data) { // p.227 �˰��� 6-8 ����
		CListNode C = new CListNode(data);
		if(CL == null)
		{
			CL = C;
			C.link = C;
		}
		else
		{
			CListNode temp = CL;
			while(temp.link != CL)
				temp=temp.link;
			temp.link =C;
			C.link = CL;
			CL = C;
		}
	}

	/**
	 * ����Ʈ�� �߰��� ��� �߰�
	 * @param data
	 */
	public void insertMiddleNode(CListNode pre, String data){ // p.230 �˰��� 6-9 ����
		CListNode C = new CListNode(data);
		if(CL == null)
		{
			CL = C;
			C.link = C;
		}
		else
		{
			C.link = pre.link; //new ����� link -> ���ڸ� �� ����� link
			pre.link = C; //���ڸ� �� ����� link -> C
		}
	}

	public CListNode searchNode(String data) { // p.223 �ܼ�����Ʈ searchNode() �޼ҵ� ����
		CListNode temp = this.CL;
		while(temp != null)
		{
			if(data.equals(temp.getData()))
				return temp;
			else
				temp = temp.link;
		}
		return temp;
		
	}

	public void printList() { // p.224 �ܼ�����Ʈ printList() �޼ҵ� ����
		CListNode temp = this.CL;
		System.out.printf("L = (");
		while (temp != null) {
			System.out.printf(temp.getData());
			temp = temp.link;
			if (temp == CL) { // ���� ����Ʈ�� �°� ����
				System.out.println(")");
				break;
			}
			System.out.printf(", ");
		}	
	}
}