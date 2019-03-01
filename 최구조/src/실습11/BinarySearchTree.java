package �ǽ�11;

public class BinarySearchTree {
	private TreeNode root;
	
	public TreeNode insertBST(BinarySearchTree BST,int data)
	{
		TreeNode p = root;
		TreeNode q = new TreeNode();
		while(p!=null) {
			if(data == p.data)
				break;
			q = p;
			if(data < p.data)
				p = p.left;
			else
				p = p.right;
		} //������ �ڸ� Ž��
		
		TreeNode newNode = new TreeNode();
		newNode.data = data;
		newNode.left = null;
		newNode.right = null;
		//������ ���
		
		if(root == null)
			root = newNode;
		else if(data < q.data)
			q.left = newNode;
		else
			q.right = newNode;
		return q;
		//����
	}
	
	public TreeNode searchBST(int data)
	{
		TreeNode p = root;
		while(p != null)
		{
			if(data < p.data)
				p = p.left;
			else if(data > p.data)
				p = p.right;
			else
				return p;
		}
		return p;
	} // ���� search�ϴ� �����Ϳ� ���� node �˻�
	

	public void inorder(TreeNode root)
	{
		if(root != null) {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}

	public void printBST()
	{
		inorder(root);
		System.out.println();
	}
	
}
