package 실습6;

public class ex1 {

	public static void main(String[] args) {

		List A = new List();
		List B = new List();
		List C = new List();


		A.appendTerm(((float)4),5);
		A.appendTerm(((float)2),3);
		A.appendTerm(((float)10),2);
		A.appendTerm(((float)1),0);
		//A식

		B.appendTerm(((float)3),4);
		B.appendTerm(((float)-2),3);
		B.appendTerm(((float)2),2);
		B.appendTerm(((float)-4),1);
		//B식


		C = addPoly(A, B);
		C.print();

		/**
		 * 메인문 작성 :
		 * A : 4x^5+2x^3+10x^2+1x^0
		 * B : 3x^4-2x^3+2x^2-4x^1
		 * C : 결과 >
		 */

		// 1. 위의 A와 B에 해당하는 다항식을 appendTerm 메서드를 이용하여 해당 리스트에 삽입
		// 2. addPoly 메서드를 이용하여 리스트 C에 연산 결과 리스트를 저장
		// 3. C의 다항식을 결과화면과 같이 출력한다. 
		// (계수가 양수일 경우 +, 음수일 경우 -로 표시)			

	}
	/**
	 * 다항식 LIST A와 B의 합 C를 반환하는 메소드
	 * 교재 알고리즘 6-14(p252)를 참고하여 작성하시오. * @param A
	 * @param B
	 * @return
	 */
	public static List addPoly(List A, List B){
		List C = new List();
		Node p = A.getPL();
		Node q = B.getPL();
		while(p != null && q != null)//A항과 B항이 둘다 null이 아니라면 실행 -> 한개라도 끝이 나면 종료
		{
			if(p.getExpo() == q.getExpo()) //지수가 같을때 +실행
			{
				if(p.coef + q.coef == 0) {
					p=p.link;
					q=q.link;
				}
				//만약 두 식을 더했는데 계수가 0이 된다면 C항에 추가하지않고 다음식으로 연결
				
				else {
					C.appendTerm(p.coef+q.coef, p.expo);
					p = p.link;
					q = q.link;
				}
				//더하기 실행
			}
			else if(p.getExpo() < q.getExpo()){
				C.appendTerm(q.coef, q.expo);
				q = q.link;
			}
			//q -> B항의 지수가 더 크다면 지수가 큰 항을 바로 추가
			else{
				C.appendTerm(p.coef,p.expo);
				p = p.link;
			}
			//p -> A항의 지수가 더 크다면 지수가 큰 항을 바로 추가
		}
		while(p != null){
			C.appendTerm(p.coef, p.expo);
			p =p.link;
		}
		// A항이 남아있다면 C항에 A항을 끝까지 추가
		while(q != null){
			C.appendTerm(q.coef, q.expo);
			q = q.link;
		}
		// B항이 남아있다면 C항에 B항을 끝까지 추가
		return C;
	}
}

