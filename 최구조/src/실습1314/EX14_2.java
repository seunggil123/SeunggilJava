package �ǽ�1314;

public class EX14_2 {

	public static void main(String[] args) {
		AdjList2 LG1 = new AdjList2();
		for(int i=0; i<7; i++)
			LG1.insertVertex(i);
		LG1.insertEdge(0,3);
		LG1.insertEdge(0,2);
		LG1.insertEdge(0,1);
		//D���� ��� , ������ D->C->B�� �Ǿ������� ����� B->C->D�� �Ѵ�.
		LG1.insertEdge(1,6);
		LG1.insertEdge(1,3);
		LG1.insertEdge(1,0);
		
		LG1.insertEdge(2,5);
		LG1.insertEdge(2,4);
		LG1.insertEdge(2,0);
		
		LG1.insertEdge(3,4);
		LG1.insertEdge(3,1);
		LG1.insertEdge(3,0);
		
		LG1.insertEdge(4,6);
		LG1.insertEdge(4,5);
		LG1.insertEdge(4,3);
		LG1.insertEdge(4,2);
		
		LG1.insertEdge(5,6);
		LG1.insertEdge(5,4);
		LG1.insertEdge(5,2);
		
		LG1.insertEdge(6,5);
		LG1.insertEdge(6,4);
		LG1.insertEdge(6,1);
		
		System.out.println("�׷��� G1�� ��������Ʈ : ");
		LG1.printAdjList();
		System.out.println();
		System.out.println();
		
		System.out.print("���� �켱 Ž�� >>>  ");
		LG1.DFS(0);
		
		System.out.println();
		System.out.println();
		
		System.out.print("�ʺ� �켱 Ž�� >>>  ");
		LG1.BFS(0);
	}

}
