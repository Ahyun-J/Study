package week13;

import java.util.LinkedList;
import java.util.List;

public class AdjListGraph {
	protected List<Edge>[] adjList;
	public void AdListGraph() {
		this.bulidGraph();
	}
	
	private void bulidGraph() {
		this.adjList = new List[4];
		for(int i=0; i<4; i++) 
			this.adjList[i] = new LinkedList<>();
		Edge e1 = new Edge(1);
		this.adjList[0].add(e1);
		Edge e2 = new Edge(2);
		this.adjList[0].add(e2);
		Edge e3 = new Edge(0);
		this.adjList[1].add(e3);
		Edge e4 = new Edge(2);
		this.adjList[1].add(e4);
		Edge e5 = new Edge(3);
		this.adjList[1].add(e5);
		Edge e6 = new Edge(0);
		this.adjList[2].add(e6);
		Edge e7 = new Edge(1);
		this.adjList[2].add(e7);
		Edge e8 = new Edge(3);
		this.adjList[2].add(e8);
		Edge e9 = new Edge(1);
		this.adjList[3].add(e9);
		Edge e10 = new Edge(2);
		this.adjList[3].add(e10);
	}
	
	public void printGraph() {
		System.out.println("Graph (AdjList) : ");
		for(int i=0; i<4; i++) {
			System.out.print("[" + i + "]"); 
			for(int j=0; j < this.adjList[i].size(); j++) 
				System.out.print(" => " + this.adjList[i].get(j).adjvertex);
			System.out.println();
		}
	}
}
//	for(int j = 0; j < N; j++) {
//		if(/*정점 i와 j사이에 간선이 존재하면*/) {
//			Edge e = new Edge(j);
//			adjList[i].add(e);
//		}
//	}