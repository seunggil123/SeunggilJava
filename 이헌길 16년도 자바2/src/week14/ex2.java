package week14;

public class ex2 {

	public static void main(String[] args) {
		
		LList<String> llist = new LList<String>();
		LList<Integer> llist2 = new LList<Integer>();
		
		llist.add("������");
		llist.add("�����");
		llist.add("KAIST");
		llist.add("�Ѹ���");
		llist.add("������");
		llist.add("�����");
		
		System.out.println("===== ��ü ��� =====");
		llist.printLList();
		
		System.out.println("===== ����� ���� ��� =====");
		llist.printLList("�����");
		
		llist2.add(2008);
		llist2.add(2016);
		llist2.add(2007);
		llist2.add(2008);
		llist2.add(2010);
		llist2.add(2011);
		
		System.out.println("===== ��ü ��� =====");
		llist2.printLList();
		System.out.println("===== 2011 ���� ��� =====");
		llist2.printLList(2016);
		
	}

}
