package �ǽ�6;

public class ex2 {
	public static void main(String args[]){
		CLinkedList CL = new CLinkedList();
		System.out.println("(1) ���� ����Ʈ�� ��� 3�� �����ϱ�");
		CL.insertFirstNode("��");
		CL.insertFirstNode("��");
		CL.insertFirstNode("��");
		CL.printList();
		System.out.println("(2) �� ��� �ڿ� ȭ ��� �����ϱ�");
		CListNode pre = CL.searchNode("��");
		if (pre == null)
			System.out.println("�˻����� >> ã�� �����Ͱ� �����ϴ�.");
		else {
			CL.insertMiddleNode(pre,"ȭ");
			CL.printList();
		}
	}
}