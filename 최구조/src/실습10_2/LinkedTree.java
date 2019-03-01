package 실습10_2;

public class LinkedTree{
	private TreeNode root;

	public TreeNode makeBT(TreeNode bt1, Object data, TreeNode bt2){
		TreeNode root = new TreeNode();
		root.data = data;
		root.left = bt1;
		root.right = bt2;
		return root;
	}
	public void preorder(TreeNode root){
		if(root != null){
			System.out.printf("%c", root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	public void inorder(TreeNode root){
		if(root != null){
			inorder(root.left);
			System.out.printf("%c", root.data);
			inorder(root.right);
		}
	}
	public void postorder(TreeNode root){
		if(root != null){
			postorder(root.left);
			postorder(root.right);
			System.out.printf("%c", root.data);
		}
	}
	
	public TreeNode reverse(TreeNode root)
	{
		if(root == null)
			return root;
		reverse(root.left);
		reverse(root.right);
		reverseLink(root.left,root,root.right); //LR R(Reverse)실행
		return root;
	}
	public void reverseLink(TreeNode bt1,TreeNode root,TreeNode bt2)
	{	
		//root의 좌우링크를 교환
		TreeNode temp = bt1;
		bt1 = bt2;
		bt2 = temp;
		
		root.left  = bt1;
		root.right = bt2;
	}
}