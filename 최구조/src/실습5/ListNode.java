package 실습5;

public class ListNode {
	   private String data; //private, public -> 싱글톤 패턴 , 정보은닉-> 다른 클래스에서 접근할 수 없다.
	   public ListNode link;

	   public ListNode() {
	      this.data = null;
	      this.link = null;
	   }

	   public ListNode(String data) {
	      this.data = data;
	      this.link = null;
	   }

	   public ListNode(String data, ListNode link) {
	      this.data = data;
	      this.link = link;

	   }

	   public String getData() {
	      return this.data;
	   }
	}