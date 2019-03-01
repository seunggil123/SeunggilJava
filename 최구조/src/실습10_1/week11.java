package �ǽ�10_1;

public class week11 {
	public static void main(String[] ar){
		ArrayTree tree = new ArrayTree(32);
		// Ʈ���� ������� 2^Ʈ������ : ���� 5�� Ʈ��(���� null �� ����
		//������ 365p�� Ʈ���� �����Ͻÿ�. �� ��忡�� null �� �߰��Ѵ�.
		
		tree.makeBT("A"); //Ʈ���� ������ �߰�
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
		 * ������ ������ ���� �߰��Ͻÿ�.
		 */
		System.out.print("Preorder : ");
		tree.preorder(1); //�迭 1��°, �� root ���� ������ȸ
		System.out.println();
		System.out.print("Inorder : ");
		tree.inorder(1); //�迭 1��°, �� root ���� ������ȸ
		System.out.println();
		System.out.print("Postorder : ");
		tree.postorder(1); //�迭 1��°, �� root ���� ������ȸ
	}
}

