package 실습11_2;

public class BinarySearchTree {
	private TreeNode root;
	
	public void insertBST(Student stu)
	{
		TreeNode p = root;
		TreeNode q = null;
		while(p!=null) {
			if(stu.id == p.id)
				return;
			q = p;
			if(stu.id < p.id)
				p = p.left;
			else
				p = p.right;
		} //삽입할 자리 탐색
		
		TreeNode newNode = new TreeNode();
		newNode.id = stu.id;
		newNode.name = stu.name;
		newNode.addr = stu.addr;
		newNode.left = null;
		newNode.right = null;
		//삽입할 노드
		
		if(root == null)
			root = newNode;
		else if(stu.id < q.id)
			q.left = newNode;
		else
			q.right = newNode;
		return;
		//삽입
	}
	
	public TreeNode searchBST(int data)
	{
		TreeNode p = root;
		while(p != null)
		{
			if(data < p.id)
				p = p.left;
			else if(data > p.id)
				p = p.right;
			else
				return p;
		}
		return p;
	}

	public void inorder(TreeNode root)
	{
		if(root != null) {
			inorder(root.left);
			System.out.println(root.id+" "+root.name+" "+root.addr+" ");
			inorder(root.right);
		}
	} //중위 순회

	public void printBST()
	{
		inorder(root);
		System.out.println();
	} 
	//tree 출력
	
}
