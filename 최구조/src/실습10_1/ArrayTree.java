package �ǽ�10_1;

public class ArrayTree{
	private Object[] aTree;
	int index;
	
	ArrayTree(int TreeSize){ //Ʈ�� �ʱ�ȭ
		aTree = new Object[TreeSize];
		index = 1;
	}
	public void makeBT(Object data){ //Ʈ�� ����
		if(this.index > aTree.length){
			System.out.println("TreeSize Over");
		}
		aTree[index] = data;
		index++; //�迭���� ->�����ͳֱ�
		// ���� �ۼ�
	}
	public void preorder(int index){
		if(index < aTree.length && aTree[index] != null) {
		System.out.print(aTree[index]);
		preorder(2*index); //left�� �����ڴ� �׻� 2*index
		preorder(2*index+1); //right�� �����ڴ� �׻� 2*index+1
		}
		// DLR
		// ���� �ۼ� 
	}
	public void inorder(int index){
		if(index < aTree.length && aTree[index] != null) {
			inorder(2*index);
			System.out.print(aTree[index]);
			inorder(2*index+1);
			}
		//LDR
		// ���� �ۼ�
	}
	public void postorder(int index){
		if(index < aTree.length && aTree[index] != null ) {
			postorder(2*index);
			postorder(2*index+1);
			System.out.print(aTree[index]);	
		}
		//LRD
		// ���� �ۼ�
	}
}