package �ǽ�6;

public class ex1 {

	public static void main(String[] args) {

		List A = new List();
		List B = new List();
		List C = new List();


		A.appendTerm(((float)4),5);
		A.appendTerm(((float)2),3);
		A.appendTerm(((float)10),2);
		A.appendTerm(((float)1),0);
		//A��

		B.appendTerm(((float)3),4);
		B.appendTerm(((float)-2),3);
		B.appendTerm(((float)2),2);
		B.appendTerm(((float)-4),1);
		//B��


		C = addPoly(A, B);
		C.print();

		/**
		 * ���ι� �ۼ� :
		 * A : 4x^5+2x^3+10x^2+1x^0
		 * B : 3x^4-2x^3+2x^2-4x^1
		 * C : ��� >
		 */

		// 1. ���� A�� B�� �ش��ϴ� ���׽��� appendTerm �޼��带 �̿��Ͽ� �ش� ����Ʈ�� ����
		// 2. addPoly �޼��带 �̿��Ͽ� ����Ʈ C�� ���� ��� ����Ʈ�� ����
		// 3. C�� ���׽��� ���ȭ��� ���� ����Ѵ�. 
		// (����� ����� ��� +, ������ ��� -�� ǥ��)			

	}
	/**
	 * ���׽� LIST A�� B�� �� C�� ��ȯ�ϴ� �޼ҵ�
	 * ���� �˰��� 6-14(p252)�� �����Ͽ� �ۼ��Ͻÿ�. * @param A
	 * @param B
	 * @return
	 */
	public static List addPoly(List A, List B){
		List C = new List();
		Node p = A.getPL();
		Node q = B.getPL();
		while(p != null && q != null)//A�װ� B���� �Ѵ� null�� �ƴ϶�� ���� -> �Ѱ��� ���� ���� ����
		{
			if(p.getExpo() == q.getExpo()) //������ ������ +����
			{
				if(p.coef + q.coef == 0) {
					p=p.link;
					q=q.link;
				}
				//���� �� ���� ���ߴµ� ����� 0�� �ȴٸ� C�׿� �߰������ʰ� ���������� ����
				
				else {
					C.appendTerm(p.coef+q.coef, p.expo);
					p = p.link;
					q = q.link;
				}
				//���ϱ� ����
			}
			else if(p.getExpo() < q.getExpo()){
				C.appendTerm(q.coef, q.expo);
				q = q.link;
			}
			//q -> B���� ������ �� ũ�ٸ� ������ ū ���� �ٷ� �߰�
			else{
				C.appendTerm(p.coef,p.expo);
				p = p.link;
			}
			//p -> A���� ������ �� ũ�ٸ� ������ ū ���� �ٷ� �߰�
		}
		while(p != null){
			C.appendTerm(p.coef, p.expo);
			p =p.link;
		}
		// A���� �����ִٸ� C�׿� A���� ������ �߰�
		while(q != null){
			C.appendTerm(q.coef, q.expo);
			q = q.link;
		}
		// B���� �����ִٸ� C�׿� B���� ������ �߰�
		return C;
	}
}

