package week13;

import java.util.LinkedList;
import java.util.List;

public class AdjListGraphExt extends AdjListGraph {
	// 그래프(this.adjList)의 역방향 그래프를 저장하기 위한 리스트를 멤버 변수
	private List<Edge>[] adjListReverse;
	
	// 멤버 변수인 this.adjList 그래프의 역방향 그래프를
	// this.adjListReverse에 저장하는
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
	// this.adjListReverse를 출력
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
