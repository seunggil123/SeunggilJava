package �ǽ�8;

public class ex1 {

	public static void main(String[] args) {
		int queueSize = 4;
		char deletedItem;
		ArrayCQueue cQ = new ArrayCQueue(queueSize);
		
		cQ.enQueue('C');
		cQ.printQueue();
		
		cQ.enQueue('Q');
		cQ.printQueue();
		
		deletedItem = cQ.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item: "+deletedItem);
		cQ.printQueue();
		
		cQ.enQueue('O');
		cQ.printQueue();
		
		cQ.enQueue('A');
		cQ.printQueue();
		
		cQ.enQueue('L');
		cQ.printQueue();
		//////////////////// ó�� ���� ť����Ʈ �Է�
		System.out.println();
		System.out.println("���� ���� ť����Ʈ");
		cQ.printQueue();
		
		cQ.reverseQueue();
		
	}

}
