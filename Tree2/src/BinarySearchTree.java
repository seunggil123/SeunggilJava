import java.util.Random;

public class BinarySearchTree<E extends Comparable<E>>extends BinaryTree<E> {

	protected boolean addReturn;
	protected E deleteReturn;
	protected E insertReturn;

	public E find(E target) {
		return find(root, target);
	}
	private E find(BTNode<E> localRoot, E target) {
		if (localRoot == null) {
			return null;
		}
		int compResult = target.compareTo(localRoot.data);
		if (compResult == 0) {
			return localRoot.data;
		} else if (compResult < 0) {
			return find(localRoot.left, target);
		} else {
			return find(localRoot.right, target);
		}
	}

	public boolean add(E item) {
		root = add(root, item);
		return addReturn;
	}
	private BTNode<E> add(BTNode<E> localRoot, E item) {
		if (localRoot == null) {
			addReturn = true;
			return new BTNode<E>(item);
		} else if (item.compareTo(localRoot.data) == 0) {
			addReturn = false;
			return localRoot;
		} else if (item.compareTo(localRoot.data) < 0) {
			localRoot.left = add(localRoot.left, item);
			return localRoot;
		} else {
			localRoot.right = add(localRoot.right, item);
			return localRoot;
		}
	}
	//변경해주는 메소드
	//a에 있는거 b로 보냄
	void swap (BTNode<E> a, BTNode<E> b){
		E temp = a.data;
		a.data = b.data;
		b.data = temp;
	}
	public void insert(E item)
	{
		BTNode<E> newNode = new BTNode<E>(item);
		BTNode<E> ptr=root;

		if (ptr == null){
			root = newNode;
			return;
		}
		while(true){
			BTNode<E> parent = ptr;
			if (item.compareTo(ptr.data)<0){
				ptr = ptr.left;
				if (ptr == null){//끝이면 삽입
					newNode.left = parent.left;
					parent.left = newNode;
					swap(parent, newNode);
					return;
				}
			}
			if (item.compareTo(ptr.data)>0)
			{
				BTNode<E> a = new BTNode<E>(parent.data);
				ptr = ptr.right;
				if (ptr == null)
				{if (parent.left.right == null) {
					parent.left.right = a;
				}
				else
					findSmallistParent(parent).left = a; 
				swap(newNode, parent);
				return;
				}
			}
		}
	}
	public E delete(E target) {
		root = delete(root, target);
		return deleteReturn;
	}
	private BTNode<E> delete(BTNode<E> localRoot, E item) {
		if (localRoot == null) {
			// item is not in the tree.
			deleteReturn = null;
			return localRoot;
		}
		int compResult = item.compareTo(localRoot.data);
		if (compResult < 0) {
			localRoot.left = delete(localRoot.left, item);
			return localRoot;
		} else if (compResult > 0) {
			localRoot.right = delete(localRoot.right, item);
			return localRoot;
		} else {	//data랑 같으면
			deleteReturn = localRoot.data;
			if (localRoot.left == null) {
				return localRoot.right;
			} else if (localRoot.right == null) {
				return localRoot.left;
			} else {	//한 개 이상의 leaf층
				if (localRoot.right.right == null) {//오른쪽 끝 비었을 때
					localRoot.data = localRoot.right.data;
					localRoot.right = localRoot.right.left;
					return localRoot;
				} else {
					localRoot.data = findSmallistChild(localRoot.right);
					return localRoot;
				}
			}
		}
	}

	public boolean remove(E target) {
		return delete(target) != null;
	}
	public boolean contains(E target) {
		return find(target) != null;
	}
	private E findLargestChild(BTNode<E> parent) {
		if (parent.right.right == null) {
			E returnValue = parent.right.data;
			parent.right = parent.right.left;
			return returnValue;
		} else {
			return findLargestChild(parent.right);
		}
	}

	// 가장 작은값
	private E findSmallistChild(BTNode<E> parent) {
		if (parent.left.left == null) {
			E returnValue = parent.left.data;
			parent.left = parent.left.right;
			return returnValue;
		} else {
			return findSmallistChild(parent.left);
		}
	}

	// 가장 작은 부모
	private BTNode<E> findSmallistParent(BTNode<E> parent) {
		if (parent.left.left == null) {
			return parent.left;
		} else {
			return findSmallistParent(parent.left);
		}
	}
}