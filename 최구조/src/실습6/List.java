package �ǽ�6;
/**
 * ���׽� ����Ʈ
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
	 * ����Ʈ�� ���׽��� �߰��ϴ� �޼���, ���� �˰��� 6-13(p247) �� �����Ͽ� �ۼ��Ͻÿ�. 
	 * @param coef
	 * @param expo
	 */
	public void appendTerm(float coef, int expo){
		Node node = new Node();
		node.setCoef(coef);
		node.setExpo(expo);
		node.setLink(null); //new
		//�ۼ� �Ͻÿ�
		if(PL == null) {
			PL = node;
			last = node; 
			//List�� ����ִٸ� -> ��ó�� ����
		}
		else {
			last.link = node;
			last = node;
			//List�� ��������ʴ� -> ���� -> (�ٲ����)last�� ��ũ -> ���Ե� �� 
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