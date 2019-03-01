package 실습12;

public class Heap {
	
	private int heapSize;
	private Student itemHeap[];

	public Heap()
	{
		heapSize = 0;
		itemHeap = new Student[50];
	}

	public void insertHeap(Student stu)
	{
		heapSize++;
		int i = heapSize;
		while((i != 1) && (stu.id < (itemHeap[i/2]).id))
		{
			itemHeap[i] = itemHeap[i/2]; //부모보다 크다면 아래쪽에 insert
			i=i/2;
		}
		itemHeap[i] = stu;
		System.out.println("Inserted Item >> ["+itemHeap[i].id+" " +
		itemHeap[i].name+" "+itemHeap[i].addr+"]");
	}
	public Student deleteHeap()
	{
		int parent,child;
		Student item,temp;
		item = itemHeap[1];
		temp = itemHeap[heapSize];
		heapSize--;
		parent =1; child = 2;
		while(child <= heapSize)
		{
			if((child < heapSize) && (itemHeap[child].id > itemHeap[child+1].id))
				child++; //자식 노드 비교
			if(temp.id <= itemHeap[child].id)
				break; // 자식노드가 현재 temp보다 크다면 temp의 현재위치 확인
			
			itemHeap[parent] = itemHeap[child];
			parent = child; //다음 노드 탐색
			child = child*2;
		}
		itemHeap[parent] = temp; // 현재자리가 temp의 자리
		return item;
		
	}

	public int getHeapSize()
	{	
		return this.heapSize;
	}

	public void printHeap()
	{
		System.out.print("Heap >>> ");
		for(int i=1; i<=heapSize; i++)
			System.out.print("["+itemHeap[i].id+" "+
					itemHeap[i].name+" "+itemHeap[i].addr+"]");
		System.out.println();
	}

}

