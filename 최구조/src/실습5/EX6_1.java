package �ǽ�5;

import java.util.*;

public class EX6_1 {

	public static void main(String[] args) {
		LinkedList L = new LinkedList();
		Scanner sc = new Scanner(System.in);
		String inputstr = sc.nextLine();
		String[] str = new String[inputstr.length()];

		for (int i = 0; i < inputstr.length(); i++) {
			str[i] = inputstr.charAt(i) + "";
		}

		System.out.println("(1) ���� ����Ʈ�� ���ڿ� �����ϱ�");

		/**
		 * 1. �Է¹��� ���ڿ��� list�� �߰� (3��) ��, �ߺ��� ���ڰ� ���� ��� �� ���� list�� �߰� ex> �Է� : I LOVE MY
		 * FAMILY L = (I, , L, O, V, E, M, Y, F, A)
		 */

		for (int i = 0; i <inputstr.length(); i++) {
			if (i == 0)
				L.insertLastNode(inputstr.charAt(i) + "");
			//searchNode�� �Ϸ��µ� ó�� head���� �����Ƿ� ������ ����Ʈ�� �߰�
			else {
				ListNode temp = L.searchNode(inputstr.charAt(i)+""); 
				//searchNode�� return���� temp�� �޴´�.
				//temp�� ���� null�̶�� �������� ���ٴ� ���̹Ƿ� ����Ʈ�� �߰��Ѵ�.
				
				if(temp==null) //�������� ���ٸ� list�� �߰�
					L.insertLastNode(inputstr.charAt(i)+"");
			}
		}
		L.printList();

		System.out.println("(2) ���� ����");

		/**
		 * 2. ���Ե� ����Ʈ ������ ���� ��� ���� (2��)
		 * searchNode(String data) ���
		 * �ۼ��� �޼��� deleteNode(String data) ���
		 */

		L.deleteNode(" ");
		L.printList();
		/**
		* 3. ����Ʈ�� ���� �տ� " �߰� (1��)
		* �ۼ��� �޼��� insertFirstNode(String data) ���
		*/

		System.out.println("(3) List�� ���� �տ� ���� �߰�");
		L.insertFirstNode("\"");
		L.printList();
		
		
		System.out.println("(4) ����Ʈ �ʱ�ȭ");
		L.init();
		L.printList();
	}
}






