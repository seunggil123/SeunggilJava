
public class BinaryTree<E extends Comparable<E>> {

	protected BTNode<E> root;

	public BinaryTree(){ 
		root = null;}

	protected BinaryTree(BTNode<E> root){
		this.root = root;}

	public BinaryTree(E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree){
		root = new BTNode<E>(data);
		if(leftTree!=null)
			root.left = leftTree.root;
		else
			root.left = null;

		if(rightTree!=null)
			root.right = rightTree.root;
		else
			root.right = null;
	}

//	public void add(E data){
//		root = insert(root, data); 
//		}
//
//	private BTNode insert(BTNode node, E data){
//		if (node == null) node = new BTNode(data);
//		else{
//			if (node.getRight() == null)
//				node.right = insert(node.right, data);
//			else node.left = insert(node.left, data);
//		}
//		return node;
//	}

	public E getData(){
		return root.getData();}

	public void inorder(){ inorder(root);}
	private void inorder(BTNode r){
		if (r != null){
			inorder(r.getLeft());
			System.out.print(r.getData() +" ");
			inorder(r.getRight());
		}
	}
//	public void preorder(){preorder(root);}
//	private void preorder(BTNode r){
//		//To be implemented
//	}
//	public void postorder(){postorder(root);}
//	private void postorder(BTNode r){
//		//To be implemented
//	}
		
	// 트리의 구조를 알 수 있도록 출력
	int count = 0;
	public void print(){
		print(root,countNode(root));
		System.out.println(" ");
	}
	public void print(BTNode<E> node, int treeFloor){
		if(node != null){
			print(node.right,treeFloor+1);
			for(int i =0; i<treeFloor; i++)
				System.out.print("\t");
			System.out.print(node.data);
			
			if(node.left != null)
				System.out.print(",L");
			if(node.right != null)
				System.out.println(",R");
			System.out.println();
			
			print(node.left,treeFloor+1);
		}
	}
	
	//tree의 층이 어디인지 찾기.
	public int countNode() {
		return countNode(root);
	}
	private int countNode(BTNode<E> tree) {
		if (tree == null)
			return 0;
		else
			return countNode(tree.left) + countNode(tree.right);
	}



}
