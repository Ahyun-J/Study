package week13;

import java.util.LinkedList;
import java.util.List;

public class AdjListGraphExt extends AdjListGraph {
	// �׷���(this.adjList)�� ������ �׷����� �����ϱ� ���� ����Ʈ�� ��� ����
	private List<Edge>[] adjListReverse;
	
	// ��� ������ this.adjList �׷����� ������ �׷�����
	// this.adjListReverse�� �����ϴ�
	public void getReverse() {
		int N  = this.adjList.length;
		this.adjListReverse = new List[N];
		for(int i=0; i<N; i++) {
			this.adjListReverse[i] = new LinkedList<>();
		}
		for(int from = 0; from < N; from++) {
			for(Edge e : this.adjList[from]) {
				int to = e.adjvertex;
				Edge e1 = new Edge(from);
				this.adjListReverse[to].add(e1);
			}
		}
	}
	// this.adjListReverse�� ���
	public void printGraphReverse() {
		System.out.println("GraphReverse (AdjList) : ");
		for(int i=0; i<4; i++) {
			System.out.print("[" + i + "]"); 
			for(int j=0; j < this.adjListReverse[i].size(); j++) 
				System.out.print(" => " + this.adjListReverse[i].get(j).adjvertex);
			System.out.println();
		}
	}
}
