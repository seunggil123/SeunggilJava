import java.util.HashSet;

public class BSTTest {
	static BinarySearchTree<String> tree;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree<String> tree = new BinarySearchTree<String>();
		insertData(tree);
		tree.insert("data");
		tree.print();
		tree.inorder();
		System.out.println("-----------------------------");
		BinarySearchTree<String> tree1 = new BinarySearchTree<String>();
		insertData(tree1);
		tree1.remove("dog");
		tree1.print();
		System.out.print("Inorder traversal : ");
		tree1.inorder();
	}
	
	public static void insertData(BinarySearchTree<String> tree) {
//		tree = new BinarySearchTree<String>();
		tree.add("lay");
		
		tree.add("rat");
		tree.add("house");
		
		tree.add("cow");
		tree.add("jack");
		tree.add("milked");
		tree.add("that");
	
		tree.add("built");
		tree.add("dog");
		tree.add("is");
		tree.add("killed");
		tree.add("malt");
		tree.add("priest");
		tree.add("shorn");
		tree.add("tossed");
		
		tree.add("and");
		tree.add("cock");
		tree.add("crumpled");
		tree.add("forlorn");
		tree.add("in");
		tree.add("kept");
		tree.add("kissed");
		tree.add("maiden");
		tree.add("man");
		tree.add("morn");
		tree.add("shaven");
		tree.add("tattered");
		tree.add("this");
		tree.add("with");
		
		tree.add("all");
		tree.add("ate");
		tree.add("cat");
		tree.add("corn");
		tree.add("crowed");
		tree.add("farmer");
		tree.add("horn");
		tree.add("married");
		tree.add("sowing");
		tree.add("the");
		tree.add("torn");
		tree.add("waked");
		tree.add("worried");
	}
}
