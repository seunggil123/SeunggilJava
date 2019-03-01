package 실습10_1;

public class week11 {
	public static void main(String[] ar){
		ArrayTree tree = new ArrayTree(32);
		// 트리의 사이즈는 2^트리레벨 : 레벨 5의 트리(하위 null 값 포함
		//교과서 365p의 트리를 구성하시오. 빈 노드에는 null 을 추가한다.
		
		tree.makeBT("A"); //트리에 데이터 추가
		tree.makeBT("B");
		tree.makeBT("C");
		tree.makeBT("D");
		tree.makeBT("E");
		tree.makeBT("F");
		tree.makeBT("G");
		tree.makeBT("H");
		tree.makeBT(null);
		tree.makeBT("I");
		tree.makeBT("J");
		tree.makeBT(null);
		tree.makeBT(null);
		tree.makeBT(null);
		tree.makeBT("K");
		
		for(int i=0; i<16; i++)
			tree.makeBT(null);
		
		/**
		 * 나머지 데이터 들을 추가하시오.
		 */
		System.out.print("Preorder : ");
		tree.preorder(1); //배열 1번째, 즉 root 부터 전위순회
		System.out.println();
		System.out.print("Inorder : ");
		tree.inorder(1); //배열 1번째, 즉 root 부터 중위순회
		System.out.println();
		System.out.print("Postorder : ");
		tree.postorder(1); //배열 1번째, 즉 root 부터 후위순회
	}
}

