package 실습5;

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

		System.out.println("(1) 공백 리스트에 문자열 삽입하기");

		/**
		 * 1. 입력받은 문자열을 list에 추가 (3점) 단, 중복된 문자가 있을 경우 한 번만 list에 추가 ex> 입력 : I LOVE MY
		 * FAMILY L = (I, , L, O, V, E, M, Y, F, A)
		 */

		for (int i = 0; i <inputstr.length(); i++) {
			if (i == 0)
				L.insertLastNode(inputstr.charAt(i) + "");
			//searchNode를 하려는데 처음 head값이 없으므로 무조건 리스트에 추가
			else {
				ListNode temp = L.searchNode(inputstr.charAt(i)+""); 
				//searchNode의 return값을 temp로 받는다.
				//temp의 값이 null이라면 같은것이 없다는 뜻이므로 리스트에 추가한다.
				
				if(temp==null) //같은것이 없다면 list에 추가
					L.insertLastNode(inputstr.charAt(i)+"");
			}
		}
		L.printList();

		System.out.println("(2) 공백 제거");

		/**
		 * 2. 삽입된 리스트 공백이 있을 경우 제거 (2점)
		 * searchNode(String data) 사용
		 * 작성한 메서드 deleteNode(String data) 사용
		 */

		L.deleteNode(" ");
		L.printList();
		/**
		* 3. 리스트의 가장 앞에 " 추가 (1점)
		* 작성한 메서드 insertFirstNode(String data) 사용
		*/

		System.out.println("(3) List의 가장 앞에 문자 추가");
		L.insertFirstNode("\"");
		L.printList();
		
		
		System.out.println("(4) 리스트 초기화");
		L.init();
		L.printList();
	}
}






