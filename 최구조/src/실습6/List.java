package 실습6;
/**
 * 다항식 리스트
 * @author hkchoi
 */
public class List {
	private Node PL, last;
	List()
	{
		PL = null;
		last = null;
	}
	/**
	 * 리스트에 다항식을 추가하는 메서드, 교재 알고리즘 6-13(p247) 을 참고하여 작성하시오. 
	 * @param coef
	 * @param expo
	 */
	public void appendTerm(float coef, int expo){
		Node node = new Node();
		node.setCoef(coef);
		node.setExpo(expo);
		node.setLink(null); //new
		//작성 하시오
		if(PL == null) {
			PL = node;
			last = node; 
			//List가 비어있다면 -> 맨처음 삽입
		}
		else {
			last.link = node;
			last = node;
			//List가 비어있지않다 -> 삽입 -> (바뀌기전)last의 링크 -> 삽입된 항 
		}
	}

	public Node getPL() {
		return PL;
	}
	public void setPL(Node pL) {
		PL = pL;
	}
	public Node getLast() {
		return last;
	}
	public void setLast(Node last) {
		this.last = last;
	}
	public void print()
	{
		while(PL.link != null)
		{
			System.out.print(PL.coef+"x^"+PL.expo);
			PL = PL.link;
			if(PL.coef >= 0)
				System.out.print("+");
		}
		System.out.print(PL.coef+"x^"+PL.expo);
	}
}