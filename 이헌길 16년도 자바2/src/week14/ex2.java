package week14;

public class ex2 {

	public static void main(String[] args) {
		
		LList<String> llist = new LList<String>();
		LList<Integer> llist2 = new LList<Integer>();
		
		llist.add("강원대");
		llist.add("서울대");
		llist.add("KAIST");
		llist.add("한림대");
		llist.add("연세대");
		llist.add("고려대");
		
		System.out.println("===== 전체 출력 =====");
		llist.printLList();
		
		System.out.println("===== 서울대 제외 출력 =====");
		llist.printLList("서울대");
		
		llist2.add(2008);
		llist2.add(2016);
		llist2.add(2007);
		llist2.add(2008);
		llist2.add(2010);
		llist2.add(2011);
		
		System.out.println("===== 전체 출력 =====");
		llist2.printLList();
		System.out.println("===== 2011 제외 출력 =====");
		llist2.printLList(2016);
		
	}

}
