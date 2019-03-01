package 실습1314;

public class EX13_1 {

	public static void main(String[] args) {

		AdjMatrix MG1 = new AdjMatrix();
		for(int i=0; i<7; i++)
			MG1.insertVertex(i);
		MG1.insertEdge(0,1);
		MG1.insertEdge(0,2);
		MG1.insertEdge(0,3);
		MG1.insertEdge(1,3);
		MG1.insertEdge(1,0);
		MG1.insertEdge(1,6);
		MG1.insertEdge(2,0);
		MG1.insertEdge(2,4);
		MG1.insertEdge(2,5);
		MG1.insertEdge(3,0);
		MG1.insertEdge(3,1);
		MG1.insertEdge(3,4);
		MG1.insertEdge(4,2);
		MG1.insertEdge(4,3);
		MG1.insertEdge(4,5);
		MG1.insertEdge(4,6);
		MG1.insertEdge(5,4);
		MG1.insertEdge(5,2);
		MG1.insertEdge(5,6);
		MG1.insertEdge(6,4);
		MG1.insertEdge(6,1);
		MG1.insertEdge(6,5);
		
		System.out.println("그래프 G1의 인접행렬 : ");
		MG1.printMatrix();
		
		System.out.println();
		System.out.println();
		
		System.out.print("깊이 우선 탐색 >>");
		MG1.DFS(4);
		
		System.out.println();
		System.out.println();
		
		System.out.print("너비 우선 탐색 >>");
		MG1.BFS(4);
	}

}
