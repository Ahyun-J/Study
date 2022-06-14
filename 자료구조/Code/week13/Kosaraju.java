package week13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Kosaraju {
	private List<Integer>[] adjList;
	private List<Integer>[] adjListReverse;
	int N;
	List<Integer> graph;
	List<Integer> s;
	int sc= 0;
	protected boolean[] visited;
	
	public void Kosaraju() {
		this.buildGraph();
		N = this.adjList.length;
		visited = new boolean[N];
		graph = new ArrayList<>();
		s = new ArrayList<>();
	}
	
	private void buildGraph() {
		this.adjList = new List[10];
		for(int i=0; i<10; i++) {
			this.adjList[i] = new LinkedList<>();
		}
		this.adjList[0].add(1);
		this.adjList[0].add(3);
		this.adjList[1].add(7);
		this.adjList[2].add(8);
		this.adjList[3].add(5);
		this.adjList[3].add(6);
		this.adjList[4].add(1);
		this.adjList[5].add(4);
		this.adjList[5].add(1);
		this.adjList[6].add(0);
		this.adjList[7].add(4);
		this.adjList[8].add(6);
		this.adjList[8].add(7);
		this.adjList[8].add(9);
		this.adjList[9].add(2);
	}
	
	public void getReverse() {
		int N  = this.adjList.length;
		this.adjListReverse = new List[N];
		for(int i=0; i<N; i++) {
			this.adjListReverse[i] = new LinkedList<>();
		}
		for(int from = 0; from < N; from++) {
			for(Integer e : this.adjList[from]) {
				int to = e;
				int e1 =from;
				this.adjListReverse[to].add(e1);
			}
		}
	}
	
	public List<Integer> tsort(){
		for(int i = 0; i < N;i++) if (!visited[i]) dfs(i);
		Collections.reverse(graph);
		return graph;
	}
	
	public void dfs(int i) {
		//s = new List[sc];
		visited[i] = true;
		for(int v : adjList[i]) {
//			if (visited[v] == false) { {
//				dfs(v);
//				}s[sc-1].add(i);}
			if(!visited[v]) dfs(v);
		}
		graph.add(i);
//		sc++;
	}
	
	public void Sdfs(int i) {
		//s = new List[sc];
		visited[i] = true; 
		for(int v : this.adjListReverse[i]) {
			if(visited[v] == false) dfs(v);
		}
		graph.add(i);
	}
	
	public void print() {
		System.out.print(this.s + " ");
		System.out.print(this.graph + " ");
	}

}
