package �ǽ�10_2;
public class EX9_1{
	public static void main(String args[]){
		LinkedTree T = new LinkedTree();

		TreeNode n5 = T.makeBT(null, 'E', null);
		TreeNode n4 = T.makeBT(null, 'D', null);
		TreeNode n3 = T.makeBT(n4, 'C', n5);
		TreeNode n2 = T.makeBT(null, 'B', null);
		TreeNode n1 = T.makeBT(n2, 'A', n3);

		System.out.println("������");
		System.out.print(" Preorder : ");
		T.preorder(n1);
		System.out.println();
		System.out.print(" Inorder : ");
		T.inorder(n1);
		System.out.println();
		System.out.print(" Postorder : ");
		T.postorder(n1);
		System.out.println();
		
		System.out.println("����");
		T.reverse(n1); //Ʈ���� �������� �ٲ�
		System.out.print(" Preorder : ");
		T.preorder(n1);
		System.out.println();
		System.out.print(" Inorder : ");
		T.inorder(n1);
		System.out.println();
		System.out.print(" Postorder : ");
		T.postorder(n1);
		System.out.println();
	}
}