package ½Ç½À11;

public class EX_1 {

	public static void main(String[] args) {

		BinarySearchTree BST = new BinarySearchTree();
		for(int i=0; i<=11; i++) {
			if(i==10)
				continue;
			BST.insertBST(BST,i);
			
		}
		System.out.print("Binary Tree >> ");
		BST.printBST();

		System.out.print("Is there 5? >>> ");
		TreeNode p1 = BST.searchBST(5);
		if(p1 != null)
			System.out.print("Searching Success! Searched key : "+p1.data);
		else
			System.out.print("Searching Fail! there is no "+p1.data);

		System.out.println();
		
		System.out.print("Is there 10? >>> ");
		TreeNode p2 = BST.searchBST(10);
		if(p2 != null)
			System.out.print("Searching Success! Searched key : "+p2.data);
		else
			System.out.print("Searching Fail! ");

	}


}
