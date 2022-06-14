package week13;

import java.util.LinkedList;
import java.util.List;

public class BFStest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Edge>[] adjList = new List[10];
		for(int i=0; i<adjList.length; i++)
			adjList[i] = new LinkedList<>();
		Edge e1 = new Edge(2);
		adjList[0].add(e1);
		Edge e2 = new Edge(1);
		adjList[0].add(e2);
		Edge e3 = new Edge(3);
		adjList[1].add(e3);
		Edge e4 = new Edge(0);
		adjList[1].add(e4);
		Edge e5 = new Edge(3);
		adjList[2].add(e5);
		Edge e6 = new Edge(0);
		adjList[2].add(e6);
		Edge e7 = new Edge(9);
		adjList[3].add(e7);
		Edge e8 = new Edge(8);
		adjList[3].add(e8);
		Edge e9 = new Edge(2);
		adjList[3].add(e9);
		Edge e10 = new Edge(1);
		adjList[3].add(e10);
		Edge e11 = new Edge(5);
		adjList[4].add(e11);
		Edge e12 = new Edge(7);
		adjList[5].add(e12);
		Edge e13 = new Edge(6);
		adjList[5].add(e13);
		Edge e14 = new Edge(4);
		adjList[5].add(e14);
		Edge e15 = new Edge(7);
		adjList[6].add(e15);
		Edge e16 = new Edge(5);
		adjList[6].add(e16);
		Edge e17 = new Edge(6);
		adjList[7].add(e17);
		Edge e18 = new Edge(5);
		adjList[7].add(e18);
		Edge e19 = new Edge(3);
		adjList[8].add(e19);
		Edge e20 = new Edge(3);
		adjList[9].add(e20);
		
		System.out.println("BFS(0) 방문 순서 : ");
		BFS bfs = new BFS(adjList);
	}
}
