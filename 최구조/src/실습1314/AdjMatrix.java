package 실습1314;

public class AdjMatrix {
	private int matrix[][]=new int[10][10];
	private int totalV=0;

	public void insertVertex(int v){
		totalV++;
	}

	public void insertEdge(int v1, int v2){
		if(v1>=totalV || v2>=totalV)
			System.out.println("그래프에 없는 정점입니다!!");
		else
			matrix[v1][v2] = 1;
	}

	public void printMatrix(){
		for(int i=0; i<totalV; i++){
			System.out.printf("\n\t\t");
			for(int j=0; j<totalV; j++)
				System.out.print(matrix[i][j]+" ");
		}
	}
	
	public void DFS(int v)
	{
		LinkedStack S = new LinkedStack();
		boolean visited[] = new boolean[10];
		S.push(v);
		visited[v] = true;
		boolean flag = false; //연결된 간선이 있는경우
		System.out.print((char)(v+65)+" ");
		while(S.top != null)
		{
			int v2 = S.peek();
			
			for(int i=0; i<=totalV; i++)
			{	
				flag = false;
				if(matrix[v2][i] == 1 && visited[i]==false)
				{
					S.push(i);
					System.out.print((char)(i+65)+" ");
					visited[i] = true;
					flag = true; //연결된 간선이 있다 -> 이어져있다.
					break;
				}
			}
			if(flag==false)
				S.pop();
			
		}
	}
	
	public void BFS(int v)
	{
		LinkedQueue Q = new LinkedQueue();
		boolean visited[] = new boolean[10];
		Q.enQueue(v);
		visited[v] = true;
		while(!Q.isEmpty())
		{
			int v2 = Q.poll();
			System.out.print((char)(v2+65)+" ");
			
			for(int i=0; i<totalV; i++)
			{
				if(matrix[v2][i]==1 && visited[i] ==false)
				{
					Q.enQueue(i);
					visited[i] = true;
					//큐에 방문한 vertex들을 넣기
				}
			}
			
			Q.deQueue(); // 차례대로 deQueue
			
		}
	}
}