package 실습7;

public class LinkedStack implements LinkedStackInterface {

	StackNode top;

	public boolean isEmpty() {
		return (top==null);
	}


	public void push(char item) {
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}


	public char pop() {
		if(isEmpty())
		{
			return 0;
		}
		else {
			char item = top.data;
			top=top.link;
			return item;
		}
	}


	public void delete() {
		if(isEmpty())
		{
			System.out.println("스택이 비어있습니다.");
		}
		else {
			top = top.link;
		}
	}

	public char peek() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return 0;
		}
		else
			return top.data;
	}

	public void printStack()
	{
		if(isEmpty())
		{
			System.out.println("스택이 비어있습니다.");
		}
		else
		{
			StackNode temp = top;
			System.out.println(">>Linked Stack>>");
			while(temp != null) {
				System.out.print(temp.data);
				temp = temp.link;
			}
			System.out.println();
		}
	}






}
