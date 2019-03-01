package �ǽ�1314;

public class AdjList2 {
	private GraphNode head[] = new GraphNode[10];
	private int totalV = 0;

	public void insertVertex(int v) {
		totalV++;
	}

	public void insertEdge(int v1, int v2) {
		if (v1 >= totalV || v2 >= totalV)
			System.out.println("�׷����� ���� �����Դϴ�!!");
		else {
			GraphNode gNode = new GraphNode();
			gNode.vertex = v2;
			gNode.link = head[v1];
			head[v1] = gNode;
		}
	}

	public void printAdjList() {
		GraphNode gNode = new GraphNode();
		char a;
		for (int i = 0; i < totalV; i++) {
			System.out.printf("\n���� %c�� ��������Ʈ ", i + 65);
			gNode = head[i];

			while (gNode != null) {
				a = (char) (gNode.vertex + 65);
				System.out.print("-> " + a);
				gNode = gNode.link;
			}

		}
	}

	public void DFS(int v) {
		GraphNode w = new GraphNode();
		LinkedStack S = new LinkedStack();
		boolean visited[] = new boolean[10];
		S.push(v); // �ʱ� V�湮
		visited[v] = true;
		while (S.top != null) // ������ empty�� ����
		{
			w = head[v]; // ���� v���� Ž�� ����
			while (w != null) // w�� null�� �ƴҶ� �ݺ� w�� null�̸� ���̻� ���� Ž���� ���� ����.
			{
				if (visited[w.vertex] == false) {
					S.push(w.vertex);
					visited[w.vertex] = true;
					System.out.printf("(%c->%c) ", v + 65, w.vertex + 65);
					v = w.vertex;
					w = head[v];
				} else
					w = w.link;
			}
			v = S.pop();// w�� null�� �Ǿ� ���̻� ������ ������ �湮�� ���� ���� ��� pop
		}

	}

	public void BFS(int v) {
		GraphNode w = new GraphNode();
		LinkedQueue Q = new LinkedQueue();
		boolean visited[] = new boolean[10];
		visited[v] = true;
		Q.enQueue(v);
		while (!Q.isEmpty()) {
			v = Q.deQueue();
			for (w = head[v]; w != null; w = w.link) {
				if (visited[w.vertex] == false) {
					visited[w.vertex] = true;
					System.out.printf("(%c->%c) ", v + 65, w.vertex + 65);
					Q.enQueue(w.vertex);
				}
			}
		}

	}
}
