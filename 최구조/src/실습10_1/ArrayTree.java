package 실습10_1;

public class ArrayTree{
	private Object[] aTree;
	int index;
	
	ArrayTree(int TreeSize){ //트리 초기화
		aTree = new Object[TreeSize];
		index = 1;
	}
	public void makeBT(Object data){ //트리 구성
		if(this.index > aTree.length){
			System.out.println("TreeSize Over");
		}
		aTree[index] = data;
		index++; //배열생성 ->데이터넣기
		// 내용 작성
	}
	public void preorder(int index){
		if(index < aTree.length && aTree[index] != null) {
		System.out.print(aTree[index]);
		preorder(2*index); //left의 노드숫자는 항상 2*index
		preorder(2*index+1); //right의 노드숫자는 항상 2*index+1
		}
		// DLR
		// 내용 작성 
	}
	public void inorder(int index){
		if(index < aTree.length && aTree[index] != null) {
			inorder(2*index);
			System.out.print(aTree[index]);
			inorder(2*index+1);
			}
		//LDR
		// 내용 작성
	}
	public void postorder(int index){
		if(index < aTree.length && aTree[index] != null ) {
			postorder(2*index);
			postorder(2*index+1);
			System.out.print(aTree[index]);	
		}
		//LRD
		// 내용 작성
	}
}