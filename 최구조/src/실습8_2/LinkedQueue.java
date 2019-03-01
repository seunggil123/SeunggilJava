package ½Ç½À8_2;

public class LinkedQueue implements Queue {

	QNode front;
	QNode rear;

	public LinkedQueue(){
		front =null;
		rear = null;
	}

	public boolean isEmpty(){
		return (front==null);
	}

	public void enQueue(QNode item){
		if(isEmpty()) {
			front = item;
			rear = item;
		}
		else {
			rear.link = item;
			rear = item;
		}


	}
	public QNode deQueue(){
		if(isEmpty()) {
			return null;
		}
		else{
			QNode temp = new QNode();
			temp.sex = front.sex;
			temp.name = front.name;
			front = front.link;
			if(front == null)
				rear = null;
			return temp;
		}
	}
	public void delete(){ 
		if(!isEmpty()) {
			front = front.link;
			if(front == null)
				rear = null;
		}

	}		
	
	public QNode peek()
	{
		if(isEmpty()) {
			return null;
		}
		else
		{
			QNode temp = new QNode();
			temp.sex = front.sex;
			temp.name = front.name;
			temp.link=null;
			return temp;
		}
	}

	public void printQueue(){
		if(isEmpty())
			System.out.printf("Linked Queue is empty!! %n");
		else{
			QNode temp = front;
			System.out.print("Linked Queue >>> ");
			while(temp != null) {
				System.out.print("("+temp.sex+","+temp.name+")"+" ");
				temp=temp.link;
			}
			System.out.println();
		}
	}
}

