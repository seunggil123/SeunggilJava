
public class BTNode<E> {
	protected BTNode<E> left, right;
	protected E data;
	public BTNode()
	{
		left = null;
		right = null;
		data = null;
	}
	public BTNode(E n)
	{
		left = null;
		right = null;
		this.data = n;
	}
	public E getData(){ return data;}
	public BTNode<E> getRight(){return right; }
	public BTNode<E> getLeft(){return left;}
}
