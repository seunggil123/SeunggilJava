package 실습6;

public class CLinkedList {
	private CListNode CL;

	public CLinkedList() {
		CL = null;
	}

	/**
	 * 리스트의 가장 앞에 노드 추가
	 * 
	 * @param data
	 */
	public void insertFirstNode(String data) { // p.227 알고리즘 6-8 참조
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
	 * 리스트의 중간에 노드 추가
	 * @param data
	 */
	public void insertMiddleNode(CListNode pre, String data){ // p.230 알고리즘 6-9 참조
		CListNode C = new CListNode(data);
		if(CL == null)
		{
			CL = C;
			C.link = C;
		}
		else
		{
			C.link = pre.link; //new 노드의 link -> 들어갈자리 전 노드의 link
			pre.link = C; //들어갈자리 전 노드의 link -> C
		}
	}

	public CListNode searchNode(String data) { // p.223 단순리스트 searchNode() 메소드 참조
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

	public void printList() { // p.224 단순리스트 printList() 메소드 참조
		CListNode temp = this.CL;
		System.out.printf("L = (");
		while (temp != null) {
			System.out.printf(temp.getData());
			temp = temp.link;
			if (temp == CL) { // 원형 리스트에 맞게 변경
				System.out.println(")");
				break;
			}
			System.out.printf(", ");
		}	
	}
}