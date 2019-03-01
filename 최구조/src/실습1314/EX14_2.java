package 실습1314;

public class EX14_2 {

	public static void main(String[] args) {
		AdjList2 LG1 = new AdjList2();
		for(int i=0; i<7; i++)
			LG1.insertVertex(i);
		LG1.insertEdge(0,3);
		LG1.insertEdge(0,2);
		LG1.insertEdge(0,1);
		//D부터 출력 , 연결은 D->C->B로 되어있지만 출력을 B->C->D로 한다.
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
		
		System.out.println("그래프 G1의 인접리스트 : ");
		LG1.printAdjList();
		System.out.println();
		System.out.println();
		
		System.out.print("깊이 우선 탐색 >>>  ");
		LG1.DFS(0);
		
		System.out.println();
		System.out.println();
		
		System.out.print("너비 우선 탐색 >>>  ");
		LG1.BFS(0);
	}

}
