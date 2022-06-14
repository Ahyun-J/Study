package week14;

import java.util.List;

public class DijkstraSP {
	public int N;
	List<Edge>[] graph;
	public int [] previous;
	public DijkstraSP(List<Edge>[] adjList) {
		N = adjList.length;
		previous = new int[N];
		graph = adjList;
	}
	
	public int[] shortestPath (int s) {
		boolean[] visited = new boolean[N];
		int[] D = new int[N];
		for(int i = 0; i< N; i++) {
			visited[i] = false;
			previous[i] = -1;
			D[i] = Integer.MAX_VALUE;
		}
		previous[s] = 0;
		D[s] = 0;
		for(int k = 0;k<N;k++){
			int minVertex = -1;
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < N; j++) {
				if ((!visited[j]) && (D[j] < min)) {
					min = D[j];
					minVertex = j;
				}
			}
			visited[minVertex] = true;
			for (Edge e : graph[minVertex]) {
				if (!visited[e.adjvertex]) {
					int currentDist = D[e.adjvertex];
					int newDist = D[minVertex] + e.weight;
					if (newDist < currentDist) {
						D[e.adjvertex] = newDist;
						previous[e.adjvertex] = minVertex;
					}
				}
			}
		}return D;
	}

}
