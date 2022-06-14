package week13;

import java.util.LinkedList;
import java.util.List;

public class TStest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>[] adjList = new List[9];
		for(int i=0; i<adjList.length; i++)
			adjList[i] = new LinkedList<>();
		adjList[2].add(1);
		adjList[2].add(0);
		adjList[0].add(1);
		adjList[1].add(4);
		adjList[1].add(3);
		adjList[4].add(5);
		adjList[5].add(3);
		adjList[5].add(7);
		adjList[3].add(6);
		adjList[6].add(7);
		adjList[7].add(8);
		
		TopologicalSort ts = new TopologicalSort(adjList);
		System.out.print("위상 정렬:\n" + ts.tsort());
	}
}
