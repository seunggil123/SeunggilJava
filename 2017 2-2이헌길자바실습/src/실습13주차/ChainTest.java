package �ǽ�13����;

public class ChainTest {

	public static void main(String[] args) {
		
		Chain c1 = new Chain();
		Chain c2 = new Chain();
		Chain c3 = new Chain();
		
		System.out.println("�۾� 1");
		c1.printChain();
		System.out.println("�۾� 2");
		c2.printChain();
		System.out.println("�۾� 3");
		c3.printChain();
		
		System.out.println("�� �۾� �ð�: "+c1.getCount()+c2.getCount()+c3.getCount());
		
		
	}

}
