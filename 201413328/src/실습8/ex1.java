package 실습8;

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
		//////////////////// 처음 원형 큐리스트 입력
		System.out.println();
		System.out.println("현재 원형 큐리스트");
		cQ.printQueue();
		
		cQ.reverseQueue();
		
	}

}
