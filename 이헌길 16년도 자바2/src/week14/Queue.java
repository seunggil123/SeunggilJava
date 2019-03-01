package week14;

public class Queue<E> implements QueueInterface<E> {
	private E[] items;
	private int numItems; // �쁽�옱 �걧 �븞�쓽 �슂�냼 �닔
	int front, rear; // �븵履쎄낵 �뮘履� �슂�냼�쓽 �씤�뜳�뒪 踰덊샇 ���옣
	int maxQueue; // 理쒕� �겕湲�

	public Queue() // 湲곕낯 �깮�꽦�옄, maxQueue瑜� 10�쑝濡� �꽕�젙
	{
		items = (E[]) new Object[10]; // new E[10]�� �옒紐삳맂 寃� �삎 蹂��솚�씠 �븘�슂
		numItems = 0;
		front = rear = -1; // -1 �� �걧媛� 鍮꾩뼱�엳�떎�뒗 寃껋쓣 �굹���깂
		maxQueue =10;
	}

	public Queue(int max) // �떒�씪 �씤�닔 �깮�꽦�옄, 理쒕� �겕湲곕�� 諛쏆븘�뱾�엫
	{
		maxQueue = max;
		items = (E[]) new Object[maxQueue]; // new E[maxQueue]�뒗 �옒紐삳맂 寃� �삎 蹂��솚�씠 �븘�슂
		numItems = 0;
		front = rear = -1; // -1�� �걧媛� 鍮꾩뼱�엳�떎�뒗 寃껋쓣 �굹���깂
	}

	public void insert(E x)
	// �걧�쓽 �뮘履쎌뿉 x瑜� �궫�엯�븳
	// �삤踰꾪뵆濡쒖슦媛� 諛쒖깮�븯硫� 硫붿떆吏�瑜� 異쒕젰�븯怨� �봽濡쒓렇�옩�쓣 醫낅즺�븳
	{
		if (numItems == maxQueue) // �걧媛� 苑� 李�
		{
			System.out.println("Queue Overflow");
			System.exit(0);
		}

		rear = (rear + 1) % maxQueue; // % maxQueue�뒗 �닚�솚�쓣 媛��뒫�븯寃� �븿
		items[rear] = x;
		numItems++;
		if (numItems == 1) // �걧媛� �궗�쟾�뿉 鍮꾩뼱�엳�뿀�떎硫�
			front = rear;
	}

	public E remove()
	// �걧�쓽 泥� 踰덉㎏ �빆紐⑹쓣 �젣嫄고븯怨� 洹� 媛믪쓣 諛섑솚�븳
	// �걧媛� 鍮꾩뼱�엳�떎硫� �꼸(null)�쓣 諛섑솚�븳
	{
		if (numItems == 0) // 鍮꾩뼱�엳�뒗 �걧
			return null;
		E temp = items[front]; // �걧�뿉 泥� 踰덉㎏ �빆紐⑹쓣 ���옣
		numItems--;
		if (numItems == 0) // �쁽�옱 �걧媛� 鍮꾩뼱�엳�떎硫� front�� rear瑜� ��1濡� �꽕�젙
			front = rear = -1;
		else
			front = (front + 1) % maxQueue; // %maxQueue�뒗 �닚�솚�쓣 媛��뒫�븯寃� �븿
		return temp;
	}

	public E peek()
	// �걧�쓽 泥� 踰덉㎏ �빆紐⑹쓣 諛섑솚�븯嫄곕굹 �걧媛� 鍮꾩뼱�엳�떎硫� �꼸(null)�쓣 諛섑솚�븳
	// �걧�쓽 �궡�슜�� 蹂�寃쎈릺吏� �븡�뒗
	{
		if (numItems == 0) // 鍮꾩뼱�엳�뒗 �걧
			return null;
		else
			return items[front];
	}

	public boolean empty()
	// �걧媛� 鍮꾩뼱�엳�떎硫� 李�(true) �쓣 諛섑솚�븳
	{
		return numItems == 0;
	}

	public int size()
	// �쁽�옱 �걧 �븞�뿉 �엳�뒗 �빆紐⑹쓽 �닔瑜� 諛섑솚�븳
	{
		return numItems;
	}

}
